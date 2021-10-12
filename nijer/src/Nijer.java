import java.util.Scanner;
public class Nijer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner scanner = new Scanner(System.in);
		int num1,num2,lcm,i;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		if(num1>=num2) {
			lcm = num1;
		}
			else {
				lcm = num2;
			}
	for(i=lcm;i<=num1*num2;i++) {
		if(i%num1==0 && i%num2==0) {
			lcm = i;
			break;
			
		}
	}
	System.out.print("The lcm number is "+lcm);
			}
		}
	


