package Subject;
import java.util.Scanner;
public class hangman {

	public static void main(String[] args) {

		String quiz = "count";
		String user ="_____";
		

		try(Scanner in = new Scanner(System.in))
		{
			while(true) {
				System.out.print("현재의 상태:"+user);
				System.out.println();
				System.out.print("글자를 추측하시오: ");

				char letter = in.nextLine().charAt(0);
				//System.out.println(letter);
				int idx = quiz.indexOf(letter);
				if(idx != -1) {
					//user = user.substring(idx-1)+letter+user.substring(idx+1);
					user = user.substring(0,idx)+ letter + user.substring(idx+1); 
				}
				// substring

				if(quiz.equalsIgnoreCase(user)) {
					System.out.println(user);
					break;
				}

			}
		}




	}

	private static char substring(int idx) {
		// TODO Auto-generated method stub
		return 0;
	}

}
