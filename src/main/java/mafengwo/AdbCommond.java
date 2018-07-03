package mafengwo;

import java.io.IOException;

public class AdbCommond {
    public void adbcommond() {
        Process process = null;
        String cmd = "/Users/mfw/Downloads/android-sdk-macosx/platform-tools/adb shell monkey -p com.mfw.roadbook -s 500 --ignore-crashes --ignore-timeouts --monitor-native-crashes -v -v 10000 > Users\\mfw\\Documents\\java_monkey_log.txt";
        try {
            process = Runtime.getRuntime().exec(cmd);
            process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
