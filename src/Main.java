import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter number:");
		int a = in.nextInt();
		
		if(a<0 && a%2 ==0){
			System.out.println("Negative and even.");
			}else if(a<0 && a%2 ==1){
				System.out.println("Negative and odd.");
				}else if(a>0 && a%2 ==0){
					System.out.println("Positive and even.");
				}else if(a>0 && a%2 ==1){
					System.out.println("Positive and odd.");
					}else{
						System.out.println("Null.");
					}

	}

}
