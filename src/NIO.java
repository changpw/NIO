import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class NIO {

    public static void main(String[] args) {
        try {
            long l = System.currentTimeMillis();
           // NIO();
           //IO2();
           // mark();
            Consl();
            long l1 =  System.currentTimeMillis();
            System.out.println(l1-l);
        }catch (Exception e){

        }

    }
/*
* NIO
* */
    public static void NIO() throws Exception{
        FileInputStream fileInputStream = new FileInputStream(new File("E:\\test.txt"));
        int available = fileInputStream.available();
        System.out.println(available+"Byte");
        fileInputStream.mark(10);
        File file = new File("E:\\test1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileChannel fileInputStreamChannel = fileInputStream.getChannel();
        FileChannel fileOutputStreamChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024*10);
        while (fileInputStreamChannel.read(byteBuffer)>0){
            byteBuffer.flip();
            int write = fileOutputStreamChannel.write(byteBuffer);
            byteBuffer.clear();
        }
        fileInputStream.close();
        fileOutputStream.close();
        fileInputStreamChannel.close();
        fileOutputStreamChannel.close();
    }
    /**
     * 旧时IO
     */

    public static void IO2() {

     try {
         byte[] buffer = new byte[1024*10];
         File file = new File("E:\\jdk参考文档中文版.CHM");
         FileInputStream fileInputStream = new FileInputStream(file);
         BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
         int len=0;
         FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\test.CHM"));
         BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
         while((len=bufferedInputStream.read(buffer) )!= -1){
             bufferedOutputStream.write(buffer,0, len);
         }
         bufferedOutputStream.flush();
         fileInputStream.close();
         fileOutputStream.close();

     }catch (IOException e){
         System.out.println( e.getMessage());
     }

    }
    /*
    * mark标记
    * */
    public static void mark() throws IOException{
        FileInputStream fileInputStream = new FileInputStream(new File("E:\\test1.txt"));
        FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\test01.txt"));
        byte [] buffer = new byte[10] ;
        fileInputStream.mark(5);
        int len =0 ;
        while (( len = fileInputStream.read(buffer))!= -1){
            System.out.println(fileInputStream.available());
            if (fileInputStream.available()>1){
                fileInputStream.reset();
            }
            fileOutputStream.write(buffer,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
    /*
    * 控制台输入
    * */
    public static void Consl() throws IOException{
        FileWriter writer = new FileWriter(new File("E:\\test02.txt"),true);
        while (true){
            System.out.println("Please input text :");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if(null != line){
                if(line.equals("exit")){
                    System.exit(0);
                }
                writer.write(line);
                writer.flush();
            }
        }

    }
}