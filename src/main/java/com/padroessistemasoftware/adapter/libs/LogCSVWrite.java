package com.padroessistemasoftware.adapter.libs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;
import com.padroessistemasoftware.adapter.model.RegisterLog;

public class LogCSVWrite {
  public void write(RegisterLog registerLog) {
    try {
      File file = new File("src/main/java/com/padroessistemasoftware/adapter/resources/log.csv");
      CSVWriter csvWriter = new CSVWriter(new FileWriter(file, true));

      String[] logString = {
          registerLog.getTipo(),
          registerLog.getInformation(),
          registerLog.getUser(),
          registerLog.getDateHour()
      };

      csvWriter.writeNext(logString);
      csvWriter.close();
    } catch (IOException exception) {
      exception.printStackTrace();
      throw new RuntimeException("Erro na escrita do arquivo");
    }
  }
}
