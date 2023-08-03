package org.chuck.norris.joke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONObject;

public class ChuckNorrisApiService {
	private static final String API_ENDPOINT = "https://api.chucknorris.io/jokes/random";

	public ChuckNorrisJoke getChuckNorrisJoke() {

		try {
			URL url = new URL(API_ENDPOINT);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");

			// Daten empfangen
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder response = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				response.append(line);
			}
			reader.close();

			ChuckNorrisParser parser = new ChuckNorrisParser();

			return parser.parseJsonToJoke(response);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
