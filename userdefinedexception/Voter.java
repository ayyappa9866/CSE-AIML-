package userdefinedexception;

public class Voter {
	public void checkEligibility(int age)throws NotEligibleToVote {
		if(age >= 18) {
			System.out.println("Eligible To Vote");
		}else {
			throw new NotEligibleToVote("Age is Lessthan 18");
		}
	}
}
