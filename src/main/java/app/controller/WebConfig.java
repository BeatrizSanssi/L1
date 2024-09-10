package app.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(@NonNull CorsRegistry registry) {
           // Log to check if this is called
           System.out.println("CORS configuration applied");
      registry.addMapping("/**")
              .allowedOrigins("http://localhost:3000")
              .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
              .allowedHeaders("*")
              .allowCredentials(true);
  }
  // Add custom ResourceHandler for static files
  @Override
  public void addResourceHandlers(@NonNull ResourceHandlerRegistry registry) {
      // Map /static/** to the folder where your static files are located
      registry.addResourceHandler("/**")
              .addResourceLocations("file:/Users/beasanssi/Desktop/L1/express-frontend/public/")
              .setCachePeriod(3600); // Cache for 1 hour (adjust as needed)
      
      // Log to check if this is called
      System.out.println("Static resource handler applied");
  }
  @Override
    public void addViewControllers(@NonNull ViewControllerRegistry registry) {
        // Redirect any undefined path to index.html
        registry.addViewController("/{spring:[a-zA-Z0-9-]+}")
                .setViewName("forward:/index.html");
    }
}