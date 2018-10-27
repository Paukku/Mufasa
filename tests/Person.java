import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.easymock.EasyMock;
// I just don't get this..
public class Person {
	Mufasa sqatMufasa;
	BankAccount sqtBank;
	
	@Before
	public void setup(){
		sqatMufasa = new Mufasa();
		
		//Mock create
		sqtBank = EasyMock.createMock(BankAccount.class);
		sqatMufasa.setBank(sqtBank);
	}
	
	@Test //verifying external dependency
	public void theTotalValueOfTheStocksAreReturnedAccordingToTheStockmarketPrice() {
		//Mock set expectations
		EasyMock.expect(sqtBank.getSummary("MS")).andReturn(25.50); //recording the expected behaviour
		EasyMock.expect(sqtBank.getSummary("N0")).andReturn(5.50);
		//Mock ready
		EasyMock.replay(sqtBank); //activating the expected behaviour
		Bank microsoft = new Bank("MS", 6);
		Bank nokia = new Bank("N0", 7);
		sqatMufasa.addStock(microsoft);
		sqatMufasa.addStock(nokia);
		sqatMufasa.setBank(sqtBank);
		//imitating the expected collaborations and verifying our own unit's method
		assertEquals(25.50*4+5.50*100, sqatMufasa.getTotalValue(),0.0); //0.0 is to avoid issues 
																		//with floating point rounding
																		//for comparing two double objects
	}


}
