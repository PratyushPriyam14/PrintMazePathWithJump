import java.io.*;
import java.util.*;
public class MazeJump{
  public static void main(String []args)throws Exception{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    printmazejumppath(1,1,n,m," ");
  }
  public static void  printmazejumppath(int sr,int sc,int dr,int dc,String path){
    //base case 
    if(sr==dr && sc==dc){
      System.out.println(path);
      return;
    }
    //horizontal move
    for(int ms=1;ms<=dc-sc;ms++)
    {
       printmazejumppath(sr,sc+ms,dr,dc,path+"h"+ms);
    }
    //vertical move
    for(int ms=1;ms<=dr-sr;ms++){
       printmazejumppath(sr+ms,sc,dr,dc,path+"v"+ms);
    }
    //diagonal move
    for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++){
       printmazejumppath(sr+ms,sc+ms,dr,dc,path+"d"+ms);
    }
  }
}
