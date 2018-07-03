package mafengwo;

import java.io.*;

public class CheckLog {
    public void checklog(String keyword) throws IOException {
        boolean isFind = false;
        String pathname = "Users\\mfw\\Documents\\java_monkey_log.txt";
        File filename = new File(pathname);
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
        BufferedReader bufferedReader = new BufferedReader(reader);
        String nextLine;


        int line =1;
        while ((nextLine=bufferedReader.readLine())!=null){
            if(nextLine.indexOf(keyword)>-1){
                System.out.println(line+"行"+nextLine);
                isFind = true;
            }
            line++;
        }
        if(!isFind){
            System.out.println("Not found in file");
        }
    }
}

