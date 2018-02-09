package com.bitcamp.app.lotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView lottoNum = findViewById(R.id.lottoNum);
        findViewById(R.id.lottoBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = "";
                int[] lotto = new int[6];
                for(int i=0;i<6;i++){
                    lotto[i] = (int)(Math.random()* 45 + 1);
                    for(int j=0; j<i; j++){
                        if(lotto[j] == lotto[i]){
                            i--;
                        }
//                        else {
//                            lotto[i] = (int)(Math.random()* 45 + 1);
//                            Arrays.sort(lotto);
//                            res += lotto[i]+" ";
//                            break;
//                        }
                    }
                }
                Arrays.sort(lotto);
                for (int i=0;i<7;i++){
                    res+=lotto[i] + " ";
                }

                lottoNum.setText("번호 : "+String.valueOf(res));
            }

        });
    }
}
