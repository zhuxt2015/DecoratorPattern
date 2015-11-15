package com.zhuxt.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2015/11/15.
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int c = super.read(b, off, len);
        for (int i = off; i < off + c; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return c;
    }

    @Override
    public int read(byte[] b) throws IOException {
        int c = super.read(b);

        return (c == -1 ? c : Character.toLowerCase((char) c));
    }


}
