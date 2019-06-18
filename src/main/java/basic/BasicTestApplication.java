package basic;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BasicTestApplication extends Application<BasicTestConfiguration> {

	public static void main(final String[] args) throws Exception {
		new BasicTestApplication().run(args);
	}

	@Override
	public String getName() {
		return "basictest";
	}

	@Override
	public void initialize(final Bootstrap<BasicTestConfiguration> bootstrap) {
		// TODO: application initialization
	}

	@Override
	public void run(final BasicTestConfiguration configuration, final Environment environment) {
		// TODO: implement application
	}

}
