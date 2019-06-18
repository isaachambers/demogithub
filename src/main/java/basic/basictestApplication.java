package basic;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class basictestApplication extends Application<basictestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new basictestApplication().run(args);
    }

    @Override
    public String getName() {
        return "basictest";
    }

    @Override
    public void initialize(final Bootstrap<basictestConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final basictestConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
