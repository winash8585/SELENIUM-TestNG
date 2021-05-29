package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

	@Test(dataProvider = "data-provider")
    public void test(int a, int b) {
        
        
        int result = a+b;
        System.out.println(result);
        
        
    }
    
    @DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{2, 3}, {5, 7}};
     }	

	

}
