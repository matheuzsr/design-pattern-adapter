/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.padroessistemasoftware.adapter.model;

import java.time.LocalDateTime;

/**
 *
 * @author matheus-ufes
 */
public final class RegisterLog {

    String tipo;
    String information;
    String user;
    String dateHour;
    String hour;

    public RegisterLog(String tipo, String information, String user) {
        this.tipo = tipo;
        this.information = information;
        this.user = user;
        this.dateHour = LocalDateTime.now().toString();
    }

    public String getTipo() {
        return tipo;
    }

    public String getInformation() {
        return information;
    }

    public String getUser() {
        return user;
    }

    public String getDateHour() {
        return dateHour;
    }
}
