import java.util.*;
public class task2
{
  public static void main (String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double [] bags = new double[n];
    for(int i=0;i<bags.length;i++){
      bags[i]=sc.nextDouble();
    }
    double load=bags[0];
    int count=0;
    for(int i=0;i<bags.length-1;i++){
      if((load+bags[i+1])>3){
//        System.out.println("Load = "+load);
//        System.out.println("nextLoad = "+bags[i+1]);
        count++;
        load=load+bags[i+1];
//        System.out.println("Count Barse.");
//        System.out.println(bags[i]+" and "+bags[i+1]+" er majhe ");
        load=bags[i+1];
      }
      else{
//        System.out.println("Load = "+load);
//        System.out.println("nextLoad = "+bags[i+1]);
        load=load+bags[i+1];
      }
    }
//    System.out.println(load);
    if(load<3){count++;}
    System.out.println(count);
  }
}