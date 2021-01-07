package airport;

import java.util.Scanner;

public class GetData {
    private Scanner scan;
    
    public GetData()
    {
        scan= new Scanner(System.in);
    }
    
    public double getNumber(String text)
    {
        System.out.print(text); 
        double number=scan.nextDouble();
        return number;                 
    }

}
