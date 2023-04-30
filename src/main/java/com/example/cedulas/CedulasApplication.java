package com.example.cedulas;

import com.example.cedulas.services.CedulasService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CedulasApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(CedulasApplication.class, args);
        CedulasService perm = appContext.getBean(CedulasService.class);

        Server server = ServerBuilder.forPort(8089).addService(perm).build();

        try {
            server.start();
            System.out.println("Server de cedulas 8089");
            server.awaitTermination();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }

    }

}
