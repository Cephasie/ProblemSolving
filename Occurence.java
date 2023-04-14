package ProblemSolving;

public class Occurence {
    public static void main(String[] args) {
        String missi = "Mississippi";
        int CountForI = 0;
        int CountForS = 0;

        for (int i = 0; i < missi.length(); i++) {
            if (missi.charAt(i) == 's') {
                CountForS++;
            } else if (missi.charAt(i) == 'i') {
                CountForI++;
            }
        }
        System.out.println("Occurrence for 's' is " + CountForI + " and " + "occurrence for 'i' is " + CountForS);


    }
}
