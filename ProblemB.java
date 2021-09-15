import java.util.Scanner;

public class ProblemB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = 0;
        while (sc.hasNext()) {
            if (numberOfCases++ > 200) throw new IllegalArgumentException("200 cases at most!");
            int certainExplosionCurrent = sc.nextInt();
            if (certainExplosionCurrent == 0) return;
            if (certainExplosionCurrent < 1 || certainExplosionCurrent > 4711)
                throw new IllegalArgumentException("Invalid current is given for the case!");
            int maximumCurrentToTry = certainExplosionCurrent - 1;
            int worstNumberOfTests = 0;
            while ((worstNumberOfTests * (worstNumberOfTests + 1)) / 2 < maximumCurrentToTry)
                worstNumberOfTests++;
            System.out.println(worstNumberOfTests);
        }
    }
}
