package org.com.java7.WatchService;

import java.nio.file.*;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class WatchServiceInJava7 {

    public static void main(String[] args) throws Exception{
        directoryWatchService();
    }

    private static void directoryWatchService() throws Exception{

        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("C:\\Users", "antiy", "Documents");
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        boolean poll = true;
        WatchKey key = watchService.take();

        while(poll){
            for(WatchEvent<?> event: key.pollEvents()){
                System.out.println("Event kind: " + event.kind() + " - for the file :" + event.context());
            }
            poll = key.reset();
        }
    }
}
