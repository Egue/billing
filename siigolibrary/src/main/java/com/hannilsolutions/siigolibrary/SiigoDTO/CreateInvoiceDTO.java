package com.hannilsolutions.siigolibrary.SiigoDTO;

import java.util.List;

public class CreateInvoiceDTO {
    
    private Document document;
    
    private String date;

    private Customer customer;

    public static class Customer{
        private String person_type;
        private String id_type;
        private String identification;
        private Integer branch_office;
        private List<String> name;
        private Address address;
        private List<Phone> phones;
        private List<Contacts> contacts;
        private Integer cost_center;
        private Currency currency;
        private Integer seller;
        /*
         * Campo para indicar el envío de la factura electronica
         */
        private Stamp stamp;
        /*
         * Campo para indicar el envío de la factura al cliente
         */
        private Mail mail;

        private String observations;

        private List<Item> items;
    }
    public static class Item{
        /*
         * Identificador del producto/servicio.

            63f918c2-ca65-4edc-a7db-66bcdd5159ps
         */
    }
    /*
     * Campo para indicar el envío de la factura al cliente
     */
    public static class Mail{
        private boolean send;
    }
    /*
     * Campo para indicar el envío de la factura electronica
     */
    public static class Stamp{
        private boolean send;
    }
    public static class Currency{
        private String code;
        private Double exchange_rate;
    }
    public static class Contacts{
        private String first_name;
        private String last_name;
        private String email;
        private Phone phone;
    }
    public static class Phone{
        private String indicative;
        private String number;
        private String extension;
    }

    public static class Address{
        private String address;
        private City city;
        private String postal_code;

    }
    public static class City{
        private String country_code;
        private String country_name;
        private String state_code;
        private String state_name;
        private String city_code;
        private String city_name;
    }

    public static class Document{
        private Integer number;

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }
        
    }
}
