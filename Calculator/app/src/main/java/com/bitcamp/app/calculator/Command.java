package com.bitcamp.app.calculator;

import android.widget.Button;
import android.widget.EditText;

public class Command {
    public static int changeInt(EditText num){
        return Integer.parseInt(String.valueOf(num.getText()));
    }
    public static int calc(EditText num1, EditText num2, String opcode){
        int num01 = Integer.parseInt(String.valueOf(num1.getText()));
        int num02 = Integer.parseInt(String.valueOf(num2.getText()));
        String opcode1 = "";
        int result = 0;
        switch (opcode1){
            case "+" : result = num01 + num02;
            break;
        }

        return 0;
    }
}
