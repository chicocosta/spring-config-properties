package br.com.properties.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.properties.properties.properties.ConfigProperties;
import br.com.properties.properties.properties.Item;

@Component
public class Teste {
   
    @Autowired
	private ConfigProperties configProperties;

    @Autowired
    private Item item;
    
    public void testarProperties() {
        System.out.println(configProperties.getHostname());
        System.out.println(configProperties.getPort());
        System.out.println(configProperties.getFrom());
        configProperties.getDefaultRecipients().forEach(System.out::println);
        configProperties.getAdditionalHeaders().entrySet().forEach(System.out::println);
        System.out.println(configProperties.getCredentials().getUsername());
        System.out.println(configProperties.getCredentials().getPassword());
        System.out.println(configProperties.getCredentials().getAuthMethod());
        System.out.println(item.getName());
        System.out.println(item.getSize());
    }

}
