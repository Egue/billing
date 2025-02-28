package com.hannilsolutions.siigolibrary.SiigoDTO;

import java.util.ArrayList;

public class CreateInvoiceResponse {
    
    public String id;
    public Document document;
    public int number;
    public String name;
    public String date;
    public Customer customer;
    public int cost_center;
    public Currency currency;
    public double total;
    public int balance;
    public int seller;
    public Stamp stamp;
    public Mail mail;
    public String observations;
    public ArrayList<Item> items;
    public ArrayList<Payment> payments;
    public String public_url;
    public ArrayList<Globaldiscount> globaldiscounts;
    public AdditionalFields additional_fields;
    public Metadata metadata;

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCost_center() {
        return cost_center;
    }

    public void setCost_center(int cost_center) {
        this.cost_center = cost_center;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSeller() {
        return seller;
    }

    public void setSeller(int seller) {
        this.seller = seller;
    }

    public Stamp getStamp() {
        return stamp;
    }

    public void setStamp(Stamp stamp) {
        this.stamp = stamp;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    public String getPublic_url() {
        return public_url;
    }

    public void setPublic_url(String public_url) {
        this.public_url = public_url;
    }

    public ArrayList<Globaldiscount> getGlobaldiscounts() {
        return globaldiscounts;
    }

    public void setGlobaldiscounts(ArrayList<Globaldiscount> globaldiscounts) {
        this.globaldiscounts = globaldiscounts;
    }

    public AdditionalFields getAdditional_fields() {
        return additional_fields;
    }

    public void setAdditional_fields(AdditionalFields additional_fields) {
        this.additional_fields = additional_fields;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public static class AdditionalFields{

    }
    
    public static class Currency{
        public String code;
        public double exchange_rate;
        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public double getExchange_rate() {
            return exchange_rate;
        }
        public void setExchange_rate(double exchange_rate) {
            this.exchange_rate = exchange_rate;
        }

        
    }
    
    public static class Customer{
        public String id;
        public String identification;
        public int branch_office;
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getIdentification() {
            return identification;
        }
        public void setIdentification(String identification) {
            this.identification = identification;
        }
        public int getBranch_office() {
            return branch_office;
        }
        public void setBranch_office(int branch_office) {
            this.branch_office = branch_office;
        }

        
    }

    public static class Discount{
        public int percentage;
        public int value;
        public int getPercentage() {
            return percentage;
        }
        public void setPercentage(int percentage) {
            this.percentage = percentage;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }

        
    }
    
    public static class Document{
        public int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        
    }
    
    public static class Globaldiscount{
        public int id;
        public String name;
        public int percentage;
        public int value;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getPercentage() {
            return percentage;
        }
        public void setPercentage(int percentage) {
            this.percentage = percentage;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }

    }
    
    public static class Item{
        public String id;
        public String code;
        public String description;
        public int quantity;
        public double price;
        public Discount discount;
        public ArrayList<Taxis> taxes;
        public double total;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Discount getDiscount() {
            return discount;
        }

        public void setDiscount(Discount discount) {
            this.discount = discount;
        }

        public ArrayList<Taxis> getTaxes() {
            return taxes;
        }   

        public void setTaxes(ArrayList<Taxis> taxes) {
            this.taxes = taxes;
        }   

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }


    }

    public static class Mail{
        public String status;
        public String observations;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getObservations() {
            return observations;
        }

        public void setObservations(String observations) {
            this.observations = observations;
        }


    }
    
    public static class Metadata{
        public String created;
        public String last_updated;

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }


    }
    
    public static class Payment{
        public int id;
        public String name;
        public double value;
        public String due_date;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public String getDue_date() {
            return due_date;
        }

        public void setDue_date(String due_date) {
            this.due_date = due_date;
        }


    }

    public static class Stamp{
        public String status;
        public String cufe;
        public String observations;
        public String errors;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCufe() {
            return cufe;
        }

        public void setCufe(String cufe) {
            this.cufe = cufe;
        }

        public String getObservations() {
            return observations;
        }

        public void setObservations(String observations) {
            this.observations = observations;
        }

        public String getErrors() {
            return errors;
        }

        public void setErrors(String errors) {
            this.errors = errors;
        }


    }
    
    public static class Taxis{
        public int id;
        public String name;
        public String type;
        public int percentage;
        public double value;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getPercentage() {
            return percentage;
        }

        public void setPercentage(int percentage) {
            this.percentage = percentage;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        
    }
}
