package userdefinedexception;

public class VoterDemo {
	public static void main(String[] args) {
		Voter v1 = new Voter();
		try {
			v1.checkEligibility(16);
		} catch (NotEligibleToVote e) {
			
			System.out.println(e);
		}
		System.out.println("Rest Of the Code");
	}
}
