package com.hannilsolutions.siigolibrary;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hannilsolutions.siigolibrary.SiigoDTO.AuthenticationDTO;
import com.hannilsolutions.siigolibrary.SiigoDTO.CreateInvoiceDTO;
import com.hannilsolutions.siigolibrary.SiigoDTO.CreateInvoiceResponse;

public class SiigoService {
    private final String url = "https://api.siigo.com";

    private final Client client;

    private final String applicationName;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public SiigoService(String applicationName)
    {
        this.client = ClientBuilder.newClient();
        this.applicationName = applicationName;
        
    }

    public AuthenticationDTO auth(String username , String accesKey)
    {
        String jsonPayload = String.format("{ \"username\": \"%s\", \"access_key\": \"%s\" }", username, accesKey);

        Entity payload = Entity.json(jsonPayload);

        Response response = this.client.target(url + "/auth")
                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .header("Partner-Id", this.applicationName)
                    .post(payload);
        if(response.getStatus() != 200){
            throw new RuntimeException("Error authenticating");
        }

        try {
            return this.objectMapper.readValue(response.readEntity(String.class), AuthenticationDTO.class); 
        } catch (JsonProcessingException e) {
            // TODO: handle exception
            throw new RuntimeException("Error parsing JSON response", e);
        }
    }

    public CreateInvoiceResponse invoiceCreate(CreateInvoiceDTO createInvoiceDTO, String accesToken){
        
        Entity payload = Entity.json(createInvoiceDTO);

        Response response = this.client.target(url + "/v1/invoice")
                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .header("Authorization", "Bearer " + accesToken)
                    .header("Partner-Id", this.applicationName)
                    .post(payload);
        
        if(response.getStatus() != 201){
            throw new RuntimeException("Error creating invoice");
        }

        try {
            return this.objectMapper.readValue(response.readEntity(String.class), CreateInvoiceResponse.class); 
        } catch (JsonProcessingException e) {

            throw new RuntimeException("Error parsing JSON response", e);
        }

    }

}
