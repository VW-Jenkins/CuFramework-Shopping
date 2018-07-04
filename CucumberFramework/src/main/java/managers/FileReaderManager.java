package managers;

import dataProvider.ConfigFileReader;
import dataProvider.JsonDataReader;

public class FileReaderManager {
	private FileReaderManager() {
		// TODO Auto-generated constructor stub
	}

	private static FileReaderManager fileReadermanager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static JsonDataReader jsonDataReader;

	public static FileReaderManager getInstance() {
		return fileReadermanager;
	}

	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
	}

	public JsonDataReader getJsonReader() {
		return (jsonDataReader == null) ?new JsonDataReader() : jsonDataReader;
	}
}
