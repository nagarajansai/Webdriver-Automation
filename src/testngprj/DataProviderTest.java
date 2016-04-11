package testngprj;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	static String loc = "/Users//admin//workspace//testngpk//testdata//cm_api.xls";
	
		
	@DataProvider(name = "getprogram_dp")
	public Object[][] createData1() throws Exception {
		Excel_processing ex = new Excel_processing();
		Object[][] retObjArr = ex.getTableArray(loc, "getprograms", "getprograms_tb");
		return (retObjArr);
	}	
	
  @Test(dataProvider = "getprogram_dp")
  public void show(String program_id,String program_name) {
	  System.out.println(program_id);
	  System.out.println(program_name);
  }
}
