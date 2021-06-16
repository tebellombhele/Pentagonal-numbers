package Pentagonal_Number;

public class Main {

    public static void main(String[] args) {
	// Calculate and Print 40 pentagonal numbers.
       int count = 1;
       System.out.print("Display 40 pentagonal numbers...\n");
       //Conditional Statement
        for(int k= 1; k<= 40; k++)
        {
            System.out.printf("%-6d", getPentagonalNumber(k));
            if(count % 10 == 0)
                System.out.println();
            count++;
        }
    }
    public static int getPentagonalNumber(int k) {
        return (k* (3 * k- 1)) / 2;
    }
}
