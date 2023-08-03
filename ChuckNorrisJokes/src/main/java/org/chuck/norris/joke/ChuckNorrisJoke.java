package org.chuck.norris.joke;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ChuckNorrisJoke {

	private String iconUrl;
	private String updatetAt;
	private String joke;
}
