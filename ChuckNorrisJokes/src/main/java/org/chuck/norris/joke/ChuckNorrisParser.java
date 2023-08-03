package org.chuck.norris.joke;

import org.json.JSONObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class ChuckNorrisParser {

	public ChuckNorrisJoke parseJsonToJoke(StringBuilder json) {
		JSONObject jsonObject = new JSONObject(json.toString());
		return new ChuckNorrisJoke(jsonObject.getString("icon_url"), jsonObject.getString("updated_at"),
				jsonObject.getString("value"));
	}
}
