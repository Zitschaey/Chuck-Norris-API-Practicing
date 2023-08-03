package org.chuck.norris.joke.Z1;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.chuck.norris.joke.ChuckNorrisJoke;
import org.chuck.norris.joke.ChuckNorrisParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class ChuckNorrisParserTest extends TestCase {
	private ChuckNorrisParser parser;

	@BeforeEach
	public void setUp() {
		parser = new ChuckNorrisParser();
	}

	@Test
	public void testValidJsonParsing() {
		StringBuilder json = new StringBuilder(
				"{\"icon_url\":\"url\",\"updated_at\":\"2023-08-03\",\"value\":\"Chuck Norris joke\"}");
		ChuckNorrisJoke joke = parser.parseJsonToJoke(json);

		assertEquals("url", joke.getIconUrl());
		assertEquals("2023-08-03", joke.getUpdatetAt());
		assertEquals("Chuck Norris joke", joke.getJoke());
	}
}
