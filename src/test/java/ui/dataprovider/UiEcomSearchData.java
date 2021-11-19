package ui.dataprovider;

import org.testng.annotations.DataProvider;

public interface UiEcomSearchData {

	@DataProvider(name = "searchData")
	public static Object[][] dataProviderMethod() {
		return new Object[][] { { "Blouse" } };
	}
}
