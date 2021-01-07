
package airport_simple;

import java.util.Scanner;

public class Airport_simple
 {
     
    public static void main(String[] args) {
        // Itt hozod létre a változókat és a típusát
        int szelsebesseg;
        int szelirany;
        int felharany;
        int szeliranymax;
                
        Scanner sc = new Scanner(System.in);
        
        // Szélsebesség bekérése addig amíg helyes értéket nem ad meg a felhasználó
        do {
            System.out.print("Kérem adja meg a szélsebességet 0 és 500 Km/h között: ");
            szelsebesseg = sc.nextInt();
        } while (!(szelsebesseg >= 0 && szelsebesseg <= 500 ));
        
        // Szélirány bekérése addig amíg helyes értéket nem ad meg a felhasználó
        do {
            System.out.print("Kérem adja a szél irányát 0 és 180 fok között: ");
            szelirany = sc.nextInt();
        } while (!(szelirany >= 0 && szelirany <= 180 ));
        
        // Felhősödés bekérése addig amíg helyes értéket nem ad meg a felhasználó
        do {
            System.out.print("Kérem adja a felhösödési arányszámot 0 és 100 fok között: ");
            felharany = sc.nextInt();
        } while (!(felharany >= 1 && felharany <= 100 ));
        
        // A szélirány 30% értékének meghatározása amíg a felszállás engedélyezett
        szeliranymax  = (int) (180 * 0.3);  
        
        if (( szelsebesseg > 100 ) || ( felharany > 45 )) {
           System.out.println("A felszállás nem engedélyezett!"); 
        }else if (( szelsebesseg > 50 ) && (( szelirany < ( 180 - szeliranymax )) && ( szelirany > szeliranymax ))) {
           System.out.println("A felszállás nem ajánlott!");
        }else {
           System.out.println("A felszállás engedélyezett!");
        }            
    }
}
