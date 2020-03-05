package automation.collections.maintask;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class DiskWriter {
    void writePlaylistToDisk(PlaylistCreator playlist) {
        ObjectOutputStream objectOutStream = null;

        try {
            objectOutStream = new ObjectOutputStream(new FileOutputStream("src" + File.separator
                                                     + "main" + File.separator + "java"
                                                     + File.separator +  "automation"
                                                     + File.separator + "collections"
                                                     + File.separator + "maintask" + File.separator
                                                     + "Disk.txt"));
            objectOutStream.writeObject(playlist.toString());
        } catch (IOException exception) {
            System.err.println("Disk recording has been failed.");
        } finally {
            try {
                if (objectOutStream != null) {
                    objectOutStream.close();
                }
            } catch (IOException exception) {
                System.err.println("Error of stream closing" + exception);
            }
        }
    }
}