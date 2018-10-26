package com.zzy.first;

import java.io.*;

/**
 * 用输入输出流实现文件中数据的读取和写入
 *
 */
public class InOut {

    public static File oneFile = new File("E://oneFile.txt");
    public static File twoFile = new File("E://twoFile.txt");

    public static File oneCharFile = new File("E://oneCharFile.txt");
    public static File twoCharFile = new File("E://twoCharFile.txt");

    /**
     * 第一部分，用字节输入输出流实现数据的读取和写入
     * @throws IOException
     */
    public static void readFile() throws IOException {
        FileInputStream is = new FileInputStream(oneFile);
        FileOutputStream os = new FileOutputStream(twoFile, true);
        byte[] bytes = new byte[1024];
        int temp;
        while ((temp = is.read(bytes)) != -1) {
            System.out.println(bytes.toString());
            os.write(bytes);
        }
        os.close();
        is.close();
    }

    public static void writeFile(String s) throws IOException {
        FileOutputStream os = new FileOutputStream(oneFile, true);
        os.write(s.getBytes());
        os.close();
    }

    /**
     * 用字符输入输出流实现数据的读取和写入
     * @throws IOException
     */
    public static void readCharacter() throws IOException {
        BufferedReader isr = new BufferedReader(new FileReader(oneCharFile));
        PrintWriter pw = new PrintWriter(twoCharFile);
        String line;
        while ((line=isr.readLine())!=null) {
            System.out.println(line);
            pw.write(line);
        }
        pw.close();
        isr.close();
    }

    public static void writeCharacter(String s) throws IOException {
        PrintWriter pw = new PrintWriter(oneCharFile);
        pw.println(s);
        pw.close();
    }


    public static void main(String[] args) throws Exception {
//        writeFile("xiaowang");
//        readFile();
        writeCharacter("xiaozhang");
//        readCharacter();
    }
}
