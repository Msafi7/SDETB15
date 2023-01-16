package Class4;

public class PhoneNumber {
    public static void main(String[] args) {
        String input="1234567890";
        String MobileNumber=input.replaceFirst("(\\d{3})(\\d{3})(\\d+)","($1) $2-$3");
        System.out.println(MobileNumber);
    }
}
