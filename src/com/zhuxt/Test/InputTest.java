package com.zhuxt.Test;

import com.zhuxt.io.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2015/11/15.
 */
public class InputTest {

    public static void main(String[] args) throws IOException{
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while((c = in.read()) == 0){
                System.out.println((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
