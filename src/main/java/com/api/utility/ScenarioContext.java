package com.api.utility;

import io.restassured.response.Response;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ScenarioContext {

    public static SimpleDateFormat formatter1 = new SimpleDateFormat("mmssSSS");
    public static Date date = new Date();

    public static int maximumSalary;
    public static int higherSalary = maximumSalary * 2;
    static Response response = null;
    public static String employeeName = "Test" + formatter1.format(date);;



}
