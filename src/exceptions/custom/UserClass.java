package src.exceptions.custom;

public class UserClass {
    public static void main(String[] args) {
        try {
            validateVoterAge(15);
            System.out.println("Authorized Voter");
        } catch (VoterAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            validateVoterAccess(false);
            System.out.println("Access Granted");
        } catch (UnauthorizedAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateVoterAccess(Boolean status) throws UnauthorizedAccessException {
        if (!status) {
            throw new UnauthorizedAccessException("Unauthorized Voter: Person do not have permission to Vote");
        }
    }

    public static void validateVoterAge(int age) throws VoterAgeException {
        if (age < 18) {
            throw new VoterAgeException("Person is less than 18 years- not Authorize to Vote");
        }
    }
}
