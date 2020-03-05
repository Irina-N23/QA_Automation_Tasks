package automation.collections.maintask;

import java.io.Serializable;
import java.util.*;

class PlaylistCreator implements Serializable {
    private static ArrayList<Track> tracklist = new ArrayList<>();

    void addTrackToPlaylist(Track newTrack) {
        tracklist.add(newTrack);
    }

    void printFullTracklist() {
        System.out.println(tracklist);
    }

    String sumTotalLengthOfTracks() {
        int totalLength = 0;
        for (Track track : tracklist) {
            totalLength += track.getLengthInSeconds();
        }
        return ((totalLength / 60) + ":" + Track.format.format(totalLength % 60));
    }

    ArrayList<Track> sortTracksByStyle() {
        Comparator<Track> comparator = new Comparator<Track>() {
            @Override
            public int compare(Track thisTrack, Track thatTrack) {
                return (thatTrack.getStyle().compareTo(thisTrack.getStyle()));
            }
        };
        ArrayList<Track> sortedTrackList = new ArrayList<>(tracklist);
        sortedTrackList.sort(comparator);
        return sortedTrackList;
    }

    ArrayList<Track> findTracksOfChosenLengthRange() {
        ArrayList<Track> tracksOfChosenLengthRange = new ArrayList<>();

        System.out.println("\nJust input a lower bound of a length range (in minutes):\t");
        int lowerBoundOfLength = defineInputtedValue();
        System.out.println("Just input an upper bound of a length range (in minutes):\t");
        int upperBoundOfLength = defineInputtedValue();

        if (upperBoundOfLength < lowerBoundOfLength) {
            System.out.println("NOTE:\tan upper bound must be bigger than a lower bound!");
            int permutationValue = lowerBoundOfLength;
            lowerBoundOfLength = upperBoundOfLength;
            upperBoundOfLength = permutationValue;
        }
        Iterator<Track> iterator = tracklist.iterator();
        while (iterator.hasNext()) {
            Track currentTrack = iterator.next();
            if (currentTrack.getLengthInSeconds() >= (lowerBoundOfLength * 60)
                    && currentTrack.getLengthInSeconds() <= (upperBoundOfLength * 60)) {
                tracksOfChosenLengthRange.add(currentTrack);
            }
        }
        return tracksOfChosenLengthRange;
    }

    private Integer defineInputtedValue() {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        String choice = scanner.nextLine();

        if (!choice.matches("^(\\d+)$")) {
            System.out.println("INVALID DATA:\tNo positive number found!");
            System.out.println("Lower and upper bounds of a length range must be"
                               + "greater than zero.");
            menu.goBackOrExit();
        }
        return Integer.parseInt(choice);
    }

    @Override
    public String toString() {
        StringBuilder diskTracklist = new StringBuilder();
        for (Track track : tracklist) {
            diskTracklist.append(track);
        }
        return diskTracklist.toString();
    }
}