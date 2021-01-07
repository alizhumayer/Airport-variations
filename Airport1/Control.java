package airport;

public class Control {
    private GetData getData;

    public  Control() {
	
        getData= new GetData();
		
		program();
    }
	
    private void program() {
        
            double szelsebesseg = getData.getNumber("K�rem a sz�lsebess�get: ");
            double szelirany    = getData.getNumber("K�rem a sz�lir�nyt    : ");
            double felhosodes   = getData.getNumber("K�rem a felh�s�d�st   : ");

            
            if (!verify1(szelsebesseg)) {
                System.out.print("Sz�lsebess�g hib�s! (0-t�l 500-ig j�)");        
                return;
            }
            if (!verify2(szelirany)) {
                System.out.print("Sz�lir�ny hib�s! (0-t�l 180-ig j�)");        
                return;
            }
            if (!verify3(felhosodes)) {
                System.out.print("Felh�s�d�s nem megfelel�! (1-t�l 100-ig j�)");        
                return;
            }

            
            if ((szelsebesseg > 50) && (szelirany > 30)) {
                    System.out.print("Nem aj�nlott a felsz�ll�s!");        
            } 
            else {
                    if ((szelsebesseg > 100) || (felhosodes > 45)) {
                            System.out.print("Tiltott felsz�ll�s!");        
                    }
                    else {
                            System.out.print("Fel lehet sz�llni");        
                    }
            }
    }
	
    private boolean verify1(double szelsebesseg) {
       boolean helyes;
       if ((0 <= szelsebesseg) && (szelsebesseg < 500)) {
           helyes=true;
       }
       else {
           helyes=false;
       }
       return helyes;
    }

    private boolean verify2(double szelirany) {
       boolean helyes;
       if ((0 <= szelirany) && (szelirany <= 180)) {
           helyes=true;
       }
       else {
           helyes=false;
       }
       return helyes;
    }


    private boolean verify3(double felhosodes) {
       boolean helyes;
       if ((1 <= felhosodes) && (felhosodes <= 100)) {
           helyes=true;
       }
       else {
           helyes=false;
       }
       return helyes;
    }
    
}


