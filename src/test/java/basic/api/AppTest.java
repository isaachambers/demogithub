package basic.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import basic.BasicTestApplication;
import basic.BasicTestConfiguration;
import basic.domain.Person;
import io.dropwizard.testing.DropwizardTestSupport;
import io.dropwizard.testing.ResourceHelpers;
import junit.framework.TestCase;

public class AppTest extends TestCase {

	private Client client;
	public static final DropwizardTestSupport<BasicTestConfiguration> SUPPORT = new DropwizardTestSupport<BasicTestConfiguration>(
			BasicTestApplication.class, ResourceHelpers.resourceFilePath("config.yaml"));
//			,
//			ConfigOverride.config("server.applicationConnectors[0].port", "0") // Optional, if not using a separate
	// testing-specific configuration file,
	// use a randomly selected port
//	);

	@BeforeClass
	public void beforeClass() {
		SUPPORT.before();
		client = ClientBuilder.newBuilder().build();
	}

	@AfterClass
	public void afterClass() {
		SUPPORT.after();
	}

	@Test
	public void testApiPost() {
		int port = SUPPORT.getLocalPort();
		Response response = client.target(String.format("http://localhost:%d/login", SUPPORT.getLocalPort())).request()
				.post(Entity.json(new Person("Ben", "ajs@js.com")));
		assertEquals(response.getStatus(), 200);
	}

}
