import java.util.Scanner
class SwapNumbers
{
public static void main(string args[])
{
int z,y, temp;
system.out.println("enter z and y");
Scanner sct = new Scanner(system.in);
z = sct.nextInt();
y = sct.nextInt();
System.out.println("before swapping\nz = "+z+"\ny = "+y);
temp = z;
z = y;
y = temp;
system.out.println("after swapping|nz = "+z+"\ny = "+y);
}
}
