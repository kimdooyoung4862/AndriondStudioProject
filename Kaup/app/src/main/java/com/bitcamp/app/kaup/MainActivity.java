package com.bitcamp.app.kaup;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = MainActivity.this;
        final EditText name = findViewById(R.id.iName);
        final EditText height = findViewById(R.id.iHeight);
        final EditText weight = findViewById(R.id.iWeight);
        final TextView result = findViewById(R.id.iResult);
        findViewById(R.id.resultBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("결과보기 : "+String.valueOf(name.getText())
                        +" : "+Command.kaup(name,weight,height));
            }
        });
    }
}
