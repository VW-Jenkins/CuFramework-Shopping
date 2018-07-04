package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import managers.FileReaderManager;
import testDataTypes.Customer;

public class JsonDataReader {
	private final String customerFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcepath();
	private List<Customer> customerList;

	public JsonDataReader() {
		// TODO Auto-generated constructor stub
		customerList = getCustomerData();
	}

	private List<Customer> getCustomerData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(customerFilePath));
			Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
			return Arrays.asList(customers);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			throw new RuntimeException("Json file not found at path" + customerFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ingore) {
				// TODO: handle exception
			}
		}
	}
	
	public final Customer getCustomerByName(String customerName) {
		for (Customer customer:customerList) {
			if(customer.firstName.equalsIgnoreCase(customerName)) return customer;
		}
		return null;
		
		//return customerList.stream().filter(x -> x.firstName.equalsIgnoreCase(customerName)).findAny().get();
	}
}
