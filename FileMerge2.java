import java.io.*;
public class FileMerge2
{ 
 public static void main(String[] args)throws IOException
 {
  PrintWriter pw = new PrintWriter("file4.txt");
  BufferedReader br= new BufferedReader(new FileReader("file1.txt"));
  String line= br.readLine();
  while(line!= null)
  {
   pw.println(line);
   line = br.readLine();                                                           
   }                                                                               
   br = new BufferedReader(new FileReader("file2.txt"));                           
   line= br.readLine();                                                             
   while(line != null)                                                             
   {                                                                              
    pw.println(line);                                                             
    line = br.readLine();
   }
   pw.flush();
   br.close();
   br.close();
   pw.close();
   System.out.println("Merged file1.txt and file2.txt alternatively into file3.txt");
  }
}
