package javaLibrary;
import java.io.*;
public class ioLibrary  {
    public ioLibrary() throws FileNotFoundException {}
   File file = new File("D:/IdeaProject/testJavaLibrary/src/javaLibrary/text.txt");
   InputStream inputStream = new InputStream() {
       @Override
       public int read() throws IOException {
           return 0;
       }
   };
   FileInputStream fileInputStream = new FileInputStream(file);
   FileOutputStream fileOutputStream = new FileOutputStream(file);
   public void test(){
       System.out.println(
               "Работаем сучки"+
               file.getName()

       );
   }


}
