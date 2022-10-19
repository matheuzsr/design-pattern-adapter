/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.padroessistemasoftware.adapter;

import com.padroessistemasoftware.adapter.log.LogCsv;
import com.padroessistemasoftware.adapter.log.LogJson;
import com.padroessistemasoftware.adapter.model.RegisterLog;
import com.padroessistemasoftware.adapter.services.LogService;

/**
 *
 * @author matheus-ufes
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        RegisterLog fooRegister = new RegisterLog("FALHA", "Falhou o banco de dados", "adm");

        new LogService(new LogJson()).registerLog(fooRegister);
        new LogService(new LogCsv()).registerLog(fooRegister);
    }
}
