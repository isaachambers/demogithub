package basic.domain;

import static io.dropwizard.testing.FixtureHelpers.fixture;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.dropwizard.jackson.Jackson;

public class PersonTest {

	private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

	@Test
	public void serializesToJSON() throws Exception {
		final Person person = new Person("Luther Blissett", "lb@example.com");

		final String expected = MAPPER
				.writeValueAsString(MAPPER.readValue(fixture("fixtures/person.json"), Person.class));

		assert MAPPER.writeValueAsString(person).equals(expected);
	}

	@Test
	public void deserializesFromJSON() throws Exception {
		final Person person = new Person("Luther Blissett", "lb@example.com");
//		assertThat((Person) MAPPER.readValue(fixture("fixtures/person.json"), Person.class)).isEqualTo(person);
//		assertThat((Person) MAPPER.readValue(fixture("fixtures/person.json"), Person.class))
//				.isEqualToComparingFieldByField(person);
	}
}
