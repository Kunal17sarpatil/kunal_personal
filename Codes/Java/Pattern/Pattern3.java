import java.util.*;

class Pattern3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No = ");
		int no = sc.nextInt();

		for(int i=1;i<=no;i++) {
		
			for(int j=1;j<=no;j++) {
			
				System.out.print(j+" ");
			}

			System.out.println();
		}
	}
}
