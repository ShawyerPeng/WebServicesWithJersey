package services;

import org.glassfish.jersey.server.ResourceConfig;

public class MainApplication extends ResourceConfig {
    public MainApplication() {
        packages("services");
        // packages("com.example;com.example2;com.example3");
    }
}
