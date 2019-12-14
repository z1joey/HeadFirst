package com.company.patterns.decorator.io;

import java.io.*;

/**
 * @author yizhang
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        final String path = "/Users/yizhang/IdeaProjects/HeadFirst/src/com/company/patterns/decorator/io/test.txt";
        File file = new File(path);

        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)
                    )
            );

            while ((c = in.read()) >= 0) {
                System.out.println((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
