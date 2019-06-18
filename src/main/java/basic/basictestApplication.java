package basic;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BasictestApplication extends Application<BasictestConfiguration> {

	public static void main(final String[] args) throws Exception {
		new BasictestApplication().run(args);
	}

	@Override
	public String getName() {
		return "basictest";
	}

	@Override
	public void initialize(final Bootstrap<BasictestConfiguration> bootstrap) {
		// TODO: application initialization
	}

	@Override
	public void run(final BasictestConfiguration configuration, final Environment environment) {
		// TODO: implement application
	}

}
