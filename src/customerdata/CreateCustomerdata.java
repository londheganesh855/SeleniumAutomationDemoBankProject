package customerdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.automation.pages.NewCustomer;
import com.automation.utility.BaseTest;
import com.automation.utility.Flib;

public class CreateCustomerdata extends BaseTest {

	public void createnewCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		NewCustomer customer = new NewCustomer(driver);
		Flib fb = new Flib();
		customer.clickCustLink();
		//Thread.sleep(5000);
		customer.closeAdd();
		//Thread.sleep(2000);
		//customer.dimiss();
		Thread.sleep(2000);
		String customername = fb.readExcelData(EXCEL_PATH,"accountdetailscust",1,0);
		String address = fb.readExcelData(EXCEL_PATH,"accountdetailscust",1,1);
		String city = fb.readExcelData(EXCEL_PATH,"accountdetailscust",1,2);
		String state = fb.readExcelData(EXCEL_PATH,"accountdetailscust",1,3);
		//String pincode = fb.readExcelData(EXCEL_PATH,"accountdetailscust",1,4);
		//String telephoneno= fb.readExcelData(EXCEL_PATH,"accountdetailscust",1,5);
		String email= fb.readExcelData(EXCEL_PATH,"accountdetailscust",1,6);
		//String password= fb.readExcelData(EXCEL_PATH,"accountdetailscust",1,7);
		             
		customer.customername(customername);
		customer.male();
		customer.dateofbirt("11","01","2010");
		customer.address(address);
		customer.city(city);
		customer.state(state);
		customer.pin("411055");
		customer.telephone("9145496704");
		customer.emailid(email);
		customer.password("pass@123");
		customer.submit();
	}

	
}
