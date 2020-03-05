package automation.collections.maintask;

import automation.collections.maintask.typesoftracks.PerformanceType;
import automation.collections.maintask.typesoftracks.Style;
import java.text.DecimalFormat;

class Track {
    private String name;
    private int lengthInSeconds;
    private Style style;
    private PerformanceType performanceType;

    Track(String name) {
        setName(name);
    }

    Track(String name, int lengthInSeconds, Style style, PerformanceType type) {
        setName(name);
        this.lengthInSeconds = lengthInSeconds;
        this.style = style;
    }

    void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getLengthInSeconds() {
        return lengthInSeconds;
    }

    Style getStyle() {
        return style;
    }

    void setStyle(Style style) {
        this.style = style;
    }

    PerformanceType getPerformanceType() {
        return performanceType;
    }

    void setPerformanceType(PerformanceType performanceType) {
        this.performanceType = performanceType;
    }

    static DecimalFormat format = new DecimalFormat("00");

    public String toString() {
        return ("\n*\t" + name + ", " + (lengthInSeconds / 60) + ":"
                + format.format(lengthInSeconds % 60) + ", " + getStyle());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Track track = (Track) object;
        return lengthInSeconds == track.lengthInSeconds &&
                name.equals(track.name) &&
                style == track.style &&
                performanceType == track.performanceType;
    }

    @Override
    public int hashCode() {
        return (int) (31 * lengthInSeconds + ((name == null) ? 0 : name.hashCode()));
    }
}