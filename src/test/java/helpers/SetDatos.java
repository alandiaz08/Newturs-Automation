package helpers;

import org.testng.annotations.DataProvider;

public class SetDatos {
	

	@DataProvider(name="RE") 
    public Object[][] getData() {
        Object[][]data = new Object[1][10];
        data[0][0] ="Alan";
        data[0][1] ="Diaz";
        data[0][2] ="1156884663";
        data[0][3] ="Firered_088@gmail.com";
        data[0][4] ="Formosa 30";
        data[0][5] ="Buenos Aires";
        data[0][6] ="1424";
        data[0][7] ="FireRed08";
        data[0][8] ="36456891";
        data[0][9] ="8";

        return data;
        }
	
}
