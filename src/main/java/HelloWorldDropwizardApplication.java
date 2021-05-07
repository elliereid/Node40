import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class HelloWorldDropwizardApplication extends Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldDropwizardApplication().run(args);
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {

    }
}
