package com.padroessistemasoftware.adapter.services;

import com.padroessistemasoftware.adapter.model.ILog;
import com.padroessistemasoftware.adapter.model.RegisterLog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author matheus-ufes
 */
public class LogService {

    private ILog iLog;

    public LogService(ILog iLog) {
        this.iLog = iLog;
    }

    public void setTipoLog(ILog iLog) {
        this.iLog = iLog;
    }

    public void registerLog(RegisterLog registerLog) {
        this.iLog.write(registerLog);
    }
}
