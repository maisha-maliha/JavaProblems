import java.util.Scanner;

class Palindrom {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String str1 = "";
        int i = str.length() - 1, j = 0;
        for (; i >= 0; i--) {
            str1 += str.charAt(i);
            j++;
        }
        if (str.equals(str1)) {
            System.out.println("The word is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}