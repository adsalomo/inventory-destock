package com.iudigital.inventory.client;

import com.iudigital.inventory.client.dto.InventoryDTO;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class InventoryClient {
    
    private final RestTemplate restTemplate;
    private static final String URL = "https://inventory-back-iud.herokuapp.com/api/inventory";
    
    public InventoryClient() {
        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
    }
    
    public List<InventoryDTO> getInventories() {
        List<InventoryDTO> inventories = Arrays
                .asList(restTemplate.getForObject(URL, InventoryDTO[].class));
        return inventories;
    }
    
}
