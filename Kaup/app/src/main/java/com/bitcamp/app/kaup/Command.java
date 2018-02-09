package com.bitcamp.app.kaup;

import android.util.Log;
import android.widget.EditText;

public class Command {
    public static String kaup(EditText iName,EditText iWeight ,EditText iHeight){
        String result = "";
        double wei = Integer.parseInt(String.valueOf(iWeight.getText()));
        double hei = Integer.parseInt(String.valueOf(iHeight.getText()));
        double height = hei/100;
        Log.d("키",String.valueOf(height));
        double bmi = wei/(height*height);
        Log.d("들어온 체중 값 :",String.valueOf(bmi));
        if(bmi < 18.5 ) {
            result = "저체중";
        }else if(18.5<= bmi && bmi <22.9) {
            result = "정상";
        }else if(23<= bmi && bmi <24.9) {
            result = "과체중";
        }else if(25<= bmi && bmi <30) {
            result = "경도비만";
        }else if(30<= bmi && bmi <35) {
            result = "중등도비만";
        }else {
            result = "고도비만";
        }
        return result;
    }
}
