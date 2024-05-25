package br.com.properties.properties.properties;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@PropertySource(value = "{spring.profiles.active}.properties")
@ConfigurationProperties(prefix = "app")
@Validated
public class ConfigProperties {

    @NotBlank(message = "hostname não pode ser nulo")
    @Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$", message = "email invalido")
    private String hostname;
    private int port;
    @NotBlank(message = "From não pode ser nulo")
    @Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$", message = "email invalido")
    private String from;
    private List<String> defaultRecipients;
    private Map<String, String> additionalHeaders;
    private Credentials credentials;
    @Bean
    @ConfigurationProperties(prefix = "item")
    public Item item(){
        return new Item();
    }

}
