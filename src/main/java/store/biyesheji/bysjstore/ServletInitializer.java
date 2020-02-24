package store.biyesheji.bysjstore;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
    
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
       return application.sources(BysjstoreApplication.class);
   }
}