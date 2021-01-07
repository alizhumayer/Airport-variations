package airport;

import java.util.Scanner;

public class GetData {
    private Scanner scan;
    
    public GetData()
    {
        scan= new Scanner(System.in);
    }
    
    public int getNumber(String text)
    {
        System.out.print(text); 
        int number=scan.nextInt();
        return number;                 
    }

}