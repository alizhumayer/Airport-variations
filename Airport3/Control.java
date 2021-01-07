package airport;

public class Control { 
    private GetData getData;
	
    public Control () { 
	getData= new GetData();
        program();
    }
	
    private void program() {
        int szelsebesseg;
        do{
            szelsebesseg = getData.getNumber(" Kérem a szélsebességet: ");
        }while (!(szelsebesseg >=0 && szelsebesseg <=500 ));


        int szelirany;
        do { 
            szelirany = getData.getNumber(" Kérem a szélirányt: ");
        }while (!(szelirany>=0 && szelirany<=180 ));


        int felhosodes;
        do { 
            felhosodes = getData.getNumber(" Kérem a felhősödést: " );
        }while (!(felhosodes >=1 && felhosodes <=100 ));



        int szeliranymax;
        szeliranymax = (int) (180*0.3);


        if (( szelsebesseg > 100 ) && ( felhosodes > 45)){
            System.out.println("Tiltott a felszállás.");
        }             
        if (( szelsebesseg > 50 ) && ( szelirany < (180 - szeliranymax) ) && ( szelirany> szeliranymax )) {
            System.out.println("Nem ajánlott a felszállás.");
        }
        else {
            System.out.println("Engedélyezett a felszállás");
        }	 
    }
	             
}