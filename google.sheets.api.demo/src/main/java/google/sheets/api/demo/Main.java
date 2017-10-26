package google.sheets.api.demo;

import java.io.IOException;
import java.util.List;

public class Main {

	private static String spreadsheetId = "1lPq3LVsRZYuv6aBSDWuYJ8THXSeTHh5jbKES8jrg4gw"; 
	private static String range = "TestData1!A1:C";
	
	public static void main(String args[]) throws IOException{
		GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
		List<List<Object>> values = sheetAPI.getSpreadSheetRecords(spreadsheetId, range);
		
		for (List<Object> row : values) {
			for (Object cell : row) {
			System.out.println(cell.toString());
			}
		}
	}
	
}