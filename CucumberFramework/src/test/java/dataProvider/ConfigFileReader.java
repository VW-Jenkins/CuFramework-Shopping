package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath="configs/Configuration.properties";
	
	public ConfigFileReader() {
		// TODO Auto-generated constructor stub
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	
	public String getDriverName() {
		String driverName = properties.getProperty("driverName");
		if(driverName!=null) return driverName;
		else throw new RuntimeException("driverName not specified in the Configuration.properties file.");
	}
	
	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!=null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}
	
	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait!=null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url!=null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched :" + browserName);
	}
	
	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if(environmentName==null||environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched: " + environmentName);
	}
	
	public boolean getBrowserWindowSize() {
		String windwoSize = properties.getProperty("windowMaximize");
		if(windwoSize!=null) return Boolean.valueOf(windwoSize);
		return true;
	}
	
	public String getTestDataResourcepath() {
		String testDataResourcepath = properties.getProperty("testDataResourcePath");
		if(testDataResourcepath!=null) return testDataResourcepath;
		else throw new RuntimeException("Test Data Resource Path not specified in the configuration.properties for the key: testDataResourcepath");
	}
	
	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!=null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}
	
	public String getSnapshotPath() {
		String snapshotPath = properties.getProperty("snapshotPath");
		if(snapshotPath!=null) return snapshotPath;
		else throw new RuntimeException("Cannot found the snapshotpath in Configuration.properties");
	}
}
