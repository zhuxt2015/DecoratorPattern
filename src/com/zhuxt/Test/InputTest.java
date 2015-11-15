package com.zhuxt.Test;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.zhuxt.io.LowerCaseInputStream;

import java.io.*;
import java.net.URL;

/**
 * Created by Administrator on 2015/11/15.
 */
public class InputTest {

    public static void main(String[] args) throws IOException{
        int c;
        File derectory = new File("test.txt");
        URL filePath = InputTest.class.getResource("Test.txt");
        String path = filePath.getPath();
        System.out.println("authority:" + filePath.getAuthority());
        System.out.println("content: " + filePath.getContent());
        System.out.println("file: " + filePath.getFile());
        System.out.println("host: " + filePath.getHost());
        System.out.println("port: " + filePath.getPort());
        System.out.println(path.substring(1));
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path.substring(1))));
            while((c = in.read()) >= 0){
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
