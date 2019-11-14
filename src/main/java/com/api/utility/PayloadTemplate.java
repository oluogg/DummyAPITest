package com.api.utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class PayloadTemplate {

    private String employeeTemplate = "{\n" +
            "  \"name\":\""+ScenarioContext.employeeName+"\",\n" +
            "  \"salary\":\""+ScenarioContext.higherSalary+"\",\n" +
            "  \"age\":\"23\"\n" +
            "}";

    void writeToJSONFile(File file) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        out.write(employeeTemplate);

        out.close();
    }
}
