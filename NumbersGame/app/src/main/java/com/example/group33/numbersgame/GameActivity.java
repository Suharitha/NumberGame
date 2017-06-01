package com.example.group33.numbersgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Button b_plus,b_minus;
    TextView tv_number;

    int current_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        b_plus = (Button)findViewById(R.id.b_plus);
        b_minus = (Button)findViewById(R.id.button_minus);
        tv_number = (TextView)findViewById(R.id.tv_number);

        current_number = 0;
        tv_number.setText("" + current_number);

        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_number < 50) {


                    current_number++;

                }

                tv_number.setText("" + current_number);
            }
        });

        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (current_number > 0) {

                    current_number--;

                }

                tv_number.setText("" + current_number);

            }
        });


    }
}
