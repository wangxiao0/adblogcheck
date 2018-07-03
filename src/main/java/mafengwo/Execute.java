package mafengwo;

import mafengwo.AdbCommond;

import java.io.IOException;

public class Execute {
    public static void main(String[] args) throws IOException {
        AdbCommond adbCommond = new AdbCommond();
        CheckLog checkLog = new CheckLog();
        adbCommond.adbcommond();
        try {
            checkLog.checklog("crash");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
