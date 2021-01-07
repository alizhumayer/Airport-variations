package airport;

public class Control {
    private GetData getData;

    public  Control() {
	
        getData= new GetData();
		
		program();
    }
	
    private void program() {
        
            double szelsebesseg = getData.getNumber("Kérem a szélsebességet: ");
            double szelirany    = getData.getNumber("Kérem a szélirányt    : ");
            double felhosodes   = getData.getNumber("Kérem a felhõsödést   : ");

            
            if (!verify1(szelsebesseg)) {
                System.out.print("Szélsebesség hibás! (0-tól 500-ig jó)");        
                return;
            }
            if (!verify2(szelirany)) {
                System.out.print("Szélirány hibás! (0-tól 180-ig jó)");        
                return;
            }
            if (!verify3(felhosodes)) {
                System.out.print("Felhõsödés nem megfelelõ! (1-tõl 100-ig jó)");        
                return;
            }

            
            if ((szelsebesseg > 50) && (szelirany > 30)) {
                    System.out.print("Nem ajánlott a felszállás!");        
            } 
            else {
                    if ((szelsebesseg > 100) || (felhosodes > 45)) {
                            System.out.print("Tiltott felszállás!");        
                    }
                    else {
                            System.out.print("Fel lehet szállni");        
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


