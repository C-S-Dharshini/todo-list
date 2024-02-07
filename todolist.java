import java.util.Scanner;
import java.util.ArrayList;

class todolist
{
public static ArrayList<String> a=new ArrayList<String>();
public static void main(String ar[])
{
Scanner d=new Scanner(System.in);
System.out.println("--------------------To-do List----------------------");
int choice;
do{
System.out.println("_________________Lets Start________________________");
System.out.println("1.Add Task");
System.out.println("2.Remove Task");
System.out.println("3.display Task");
System.out.println("4.Mark as Complete");
System.out.println("5.Exit");
System.out.println("Enter Your Choice");
choice=d.nextInt();
d.nextLine();
switch(choice)
{
case 1: addtask(d);
        break;
case 2: removetask(d);
        break;
case 3: display();
        break;
case 4: mcomplete(d);
        break;
case 5: System.out.println("Exiting.................");
        break;
default:
        System.out.println("Invalid choice");
}
}while(choice!=5);
}
public static void addtask(Scanner d)
{
System.out.println("enter task:");
String x=d.nextLine();
a.add(x);
System.out.println("************Task added Successfully*************");
}
public static void removetask(Scanner d)
{
System.out.println("Enter the task to be remove:");
String x=d.nextLine();
if(a.remove(x))
{
System.out.println("***********task removed Successfully***********");
}
else
{
System.out.println("Task Not found");
}
}
public static void display()

{
System.out.println("----------------Tasks---------------------");
for(int i=0;i<a.size();i++)
{
System.out.println((i+1)+"."+a.get(i));
}
System.out.println("-------------------------------------");
}
public static void mcomplete(Scanner d)
{
System.out.println("Enter the task to mark as complete");
String x=d.nextLine();
if(a.contains(x))
{
System.out.println("marked as complete..."+x);
int z=a.indexOf(x);
a.set(z,x+"---(completed)");
}
else
{
System.out.println("Task not found");
}
}
}
       


