package ProblemSolving;

public class PrintVentures {
    public static void main(String[] args) {
        String ven = "VENTURES";
        for (int i = 0; i < ven.length(); i+=2) {
            System.out.println(ven.charAt(i)+""+ven.charAt(i + 1) );
        }
    }
}