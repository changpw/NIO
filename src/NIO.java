import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIO {

    public static void main(String[] args) {
        try {
            long l = System.currentTimeMillis();
           // NIO();
           IO2();
            long l1 =  System.currentTimeMillis();
            System.out.println(l1-l);
        }catch (Exception e){

        }

    }
/*
* NIO
* */
    public static void NIO() throws Exception{
        FileInputStream fileInputStream = new FileInputStream(new File("E:\\jdk参考文档中文版.CHM"));
        File file = new File("E:\\test.CHM");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileChannel fileInputStreamChannel = fileInputStream.getChannel();
        FileChannel fileOutputStreamChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024*10);
        while (true){
            int read = fileInputStreamChannel.read(byteBuffer);
            if (read==-1){
                break;
            }
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
}