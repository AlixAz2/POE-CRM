package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type_presta;
    private String designation;
    @ManyToOne
    private Client client;
    private Integer nb_days;
    private Double unit_price;
    @Transient
    private Double total_exclude_taxe;
    @Transient
    private Double total_with_taxe;
    @Column(columnDefinition = "int4")
    private StateOrder state;

    // SOlution pour gérer le calcul automatique des données : mais il est ,nécéssaire de modifier la structure de la bdd

//    @PrePersist
//    private void calculs(){
//        this.total_exclude_taxe=unit_price * nb_days;
//        this.total_with_taxe = total_exclude_taxe * 1.2;
//    }

    public Order() {
    }

    public Order(String type_presta, String designation, Client client, Integer nb_days, Double unit_price, StateOrder state) {
        this.type_presta = type_presta;
        this.designation = designation;
        this.client = client;
        this.nb_days = nb_days;
        this.unit_price = unit_price;
//        this.total_exclude_taxe = nb_days * unit_price;
//        this.total_with_taxe = total_exclude_taxe * 1.2;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType_presta() {
        return type_presta;
    }

    public void setType_presta(String type_presta) {
        this.type_presta = type_presta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Client getclient() {
        return client;
    }

    public void setclient(Client client) {
        this.client = client;
    }

    public Integer getNb_days() {
        return nb_days;
    }

    public void setNb_days(Integer nb_days) {
        this.nb_days = nb_days;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public Double getTotal_exclude_taxe() {
        return total_exclude_taxe;
    }

    public void setTotal_exclude_taxe(Double total_exclude_taxe) {
        this.total_exclude_taxe = total_exclude_taxe;
    }

    public Double getTotal_with_taxe() {
        return total_with_taxe;
    }

    public void setTotal_with_taxe(Double total_with_taxe) {
        this.total_with_taxe = total_with_taxe;
    }

    public StateOrder getState() {
        return state;
    }

    public void setState(StateOrder state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", type_presta='" + type_presta + '\'' +
                ", designation='" + designation + '\'' +
                ", client='" + client + '\'' +
                ", nb_days=" + nb_days +
                ", unit_price=" + unit_price +
                ", total_exclude_taxe=" + total_exclude_taxe +
                ", total_with_taxe=" + total_with_taxe +
                ", state=" + state +
                '}';
    }
}
