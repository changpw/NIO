import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIO {

    public static void main(String[] args) {
        try {
           NIO();
         //  IO2();
        }catch (Exception e){

        }

    }
/*
* NIO
* */
    public static void NIO() throws Exception{
        FileInputStream fileInputStream = new FileInputStream(new File("E:\\miy.txt"));
        File file = new File("E:/test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileChannel fileInputStreamChannel = fileInputStream.getChannel();
        FileChannel fileOutputStreamChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
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
         byte[] buffer = new byte[1024];
         File file = new File("E:\\miy.txt");
         FileInputStream fileInputStream = new FileInputStream(file);
         BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
         int read = bufferedInputStream.read(buffer);
         int lent=0;
         if((lent=read )!= -1){
             FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\test.txt"));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
             bufferedOutputStream.write(buffer);
             bufferedOutputStream.flush();
             fileInputStream.close();
             fileOutputStream.close();
         }

     }catch (IOException e){
         System.out.println( e.getMessage());
     }

    }
}