package net.pms.dlna;

public class MediaInfoTest {

    public static void main(String[] args) {
        if (args.length == 1) {
            MediaInfo mi = new MediaInfo();
            System.out.println(mi.Open(args[0]));
            System.out.println(mi.Inform());
            mi.Close();
        } else {
            System.out.println("Usage: java -jar <Path to MediaInfoTest.jar> <mediafile>");
        }
    }

}
