package com.hannilsolutions.siigolibrary;

import com.hannilsolutions.siigolibrary.SiigoDTO.AuthenticationDTO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String accesKey = "NDllMzI0NmEtNjExZC00NGM3LWE3OTQtMWUyNTNlZWU0ZTM0OkosU2MwLD4xQ08=";
        String username = "sandbox@siigoapi.com";
        SiigoService siigoService = new SiigoService("INConnection");

        AuthenticationDTO authSiigo =  siigoService.auth(username, accesKey);

        System.out.println(authSiigo.getAccess_token());
    }
}
