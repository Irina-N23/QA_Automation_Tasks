// Вариант 5: Звукозапись.
// Определить иерархию музыкальных композиций. Записать на диск сборку.
// Подсчитать продолжительность.
// Провести перестановку композиций диска на основе принадлежности к стилю.
// Найти композицию, соответствующую заданному диапазону длины треков.
package automation.collections.maintask;

import automation.collections.maintask.typesoftracks.PerformanceType;
import automation.collections.maintask.typesoftracks.Style;

class PlaylistsRunner {
    public static void main(String[] args) {
        PlaylistCreator playlist = new PlaylistCreator();

        try {
            playlist.addTrackToPlaylist(new Track("Adrenaline Mob - All on the line", 260,
                                                  Style.METAL, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Peter Cincotti - Be careful", 223,
                                                  Style.JAZZ, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Cream - White room", 299,
                                                  Style.ROCK, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Joana Rios - Fascinating rhythm", 265,
                                                  Style.JAZZ, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Ark - Burn the sun", 275,
                                                  Style.METAL, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Joe Cocker - It's only love", 237,
                                                  Style.ROCK, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Andy James - After midnight", 357,
                                                  Style.METAL, PerformanceType.INSTRUMENTAL));
            playlist.addTrackToPlaylist(new Track("Jerome Kern - Smoke gets in your eyes", 249,
                                                  Style.JAZZ, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Muse - Panic station", 184,
                                                  Style.ROCK, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("George Gershwin - Rhapsody in blue", 976,
                                                  Style.JAZZ, PerformanceType.INSTRUMENTAL));
            playlist.addTrackToPlaylist(new Track("Russel Allen - Loosin' you", 241,
                                                  Style.METAL, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Soen - Orison", 425,
                                                  Style.METAL, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Nobody.one - Set", 161,
                                                  Style.ROCK, PerformanceType.INSTRUMENTAL));
            playlist.addTrackToPlaylist(new Track("Daniel Kramer - Improvisation", 576,
                                                  Style.JAZZ, PerformanceType.INSTRUMENTAL));
            playlist.addTrackToPlaylist(new Track("JORN  - Something real", 324,
                                                  Style.METAL, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Dream Theater - Home", 773,
                                                  Style.METAL, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Blondie - Hanging on the telephone", 142,
                                                  Style.ROCK, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Queen - Bohemian rhapsody", 328,
                                                  Style.ROCK, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Blur - Song 2", 129,
                                                  Style.ROCK, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("Audioslave - Shadow on the Sun", 343,
                                                  Style.ROCK, PerformanceType.SINGING));
            playlist.addTrackToPlaylist(new Track("John Petrucci & Jordan Rudess - Furia Taurina",
                                                  612, Style.ROCK, PerformanceType.INSTRUMENTAL));
        } catch (IllegalArgumentException exception) {
            System.err.println("Incorrect name of track: null or empty.\n");
        }

        DiskWriter diskWriter = new DiskWriter();
        diskWriter.writePlaylistToDisk(playlist);

        Menu menu = new Menu();
        menu.showMainMenu();
        menu.goToChosenAction();
    }
}