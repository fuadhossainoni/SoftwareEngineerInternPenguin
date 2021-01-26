import java.util.*;
public class task3{
  public static void main (String[]args)
  {
    day c=new day();
    Scanner sc=new Scanner(System.in);
    day sunday=new day();
    day monday=new day();
    day tuesday=new day();
    day wednesday=new day();
    day thursday=new day();
    for(int i=0;i<100;i++){
      System.out.println("A. Create Routine");
      System.out.println("B. Show Routine");
      System.out.println("C. List Courses with Teachers Name");
      String n=sc.nextLine();
      if(n.equals("a")||n.equals("A")){
        for(int y=0;y<c.courses.length;y++){
        System.out.println(y+1+". "+c.courses[y]+", "+c.teachers[y]);
        }
        System.out.println("_________________________");
        int day=sc.nextInt();
        int hour=sc.nextInt();
        int course=sc.nextInt();
        if(day==0){
          sunday.hourcourse[hour]=sunday.courses[course];
          System.out.println("Course Added for Sunday");
        }
        else if(day==1){
          monday.hourcourse[hour]=monday.courses[course];
          System.out.println("Course Added for Monday");
        }
        else if(day==2){
          tuesday.hourcourse[hour]=tuesday.courses[course];
          System.out.println("Course Added for Tuesday");
        }
        else if(day==3){
          wednesday.hourcourse[hour]=wednesday.courses[course];
          System.out.println("Course Added for Wednesday");
        }
        else if(day==4){
          thursday.hourcourse[hour]=thursday.courses[course];
          System.out.println("Course Added for Thursday");
        }
      }
      
      if(n.equals("b")||n.equals("B")){
      int day=sc.nextInt();
       if(day==0){
         for(int d=0; d<4;d++){
          System.out.println(day+" "+(d+1)+" "+sunday.hourcourse[d]);
        }
       }
        if(day==1){
         for(int d=0; d<4;d++){
          System.out.println(day+" "+(d+1)+" "+monday.hourcourse[d]);
        }
       }
        if(day==2){
         for(int d=0; d<4;d++){
          System.out.println(day+" "+(d+1)+" "+tuesday.hourcourse[d]);
        }
       }
        if(day==3){
         for(int d=0; d<4;d++){
          System.out.println(day+" "+(d+1)+" "+wednesday.hourcourse[d]);
        }
       }
        if(day==4){
         for(int d=0; d<4;d++){
          System.out.println(day+" "+(d+1)+" "+thursday.hourcourse[d]);
        }
       }
        System.out.println("_________________________");
      }
      
      if(n.equals("c")||n.equals("C")){
        for(int x=0;x<c.courses.length;x++){
          System.out.println(c.courses[x]+", "+c.teachers[x]);
        }
         System.out.println("_________________________");
      }
    }
  }
}