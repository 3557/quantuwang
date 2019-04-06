import java.io.*;
import java.net.*;

// 获取网页url


public class  urlget {


public static void main (String arge[]){

String homeurl="http://www.quantuwang.co/meinv/"; //从这个网页开始爬取

try{
URL url=new URL(homeurl);

URLConnection conn=url.openConnection();
// 与网页链接

InputStream is =conn.getInputStream();

System.out.println(conn.getContentEncoding());


BufferedReader br=new BufferedReader(new InputStreamReader(is,"UTF-8"));
//因此用BufferedReader和InputStreamReader把字节流转化为字符流的缓冲流
//进行转换时，需要处理编码格式问题

String line =null;
while((line=br.readLine())!=null){
System.out.println(line);
filein(line);
}
br.close();

}
catch(Exception e){
    e.printStackTrace();
}
}


public static void filein(String line )throws IOException{
try{
    File file=new File("1.0.0/homeurl.txt");
    String str ="\r\n";
    FileOutputStream af =new FileOutputStream(file ,true);
    af.write(line.getBytes());
    af.write(str.getBytes());
}catch(FileNotFoundException e)
{
System.out.println("写入失败");
e.printStackTrace();
}
    
}



}