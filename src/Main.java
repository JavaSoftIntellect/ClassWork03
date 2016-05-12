import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Въведете число:");
		int a = in.nextInt();
		
		if(a<0 && a%2 ==0){
			System.out.println("Числото е отрицателно и четно.");
			}else if(a<0 && a%2 ==1){
				System.out.println("Числото е отрицателно и нечетно.");
				}else if(a>0 && a%2 ==0){
					System.out.println("Числото е положително и четно.");
				}else if(a>0 && a%2 ==1){
					System.out.println("Числото е положително и нечетно.");
					}else{
						System.out.println("Нула.");
					}

	}

}
