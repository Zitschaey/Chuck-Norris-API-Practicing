package org.chuck.norris.joke;

import org.slf4j.Logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class ChuckNorrisApp {

	public static void main(String[] args) {
		ChuckNorrisApiService service = new ChuckNorrisApiService();

		ChuckNorrisJoke joke = service.getChuckNorrisJoke();
		log.info(joke.getJoke());

	}
}
