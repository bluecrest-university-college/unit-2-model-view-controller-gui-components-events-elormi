package com.example.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button traffic;
    private int colors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        traffic = (Button) findViewById(R.id.traffic);
        traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (traffic.getText().toString() == "RED") {
                    traffic.setText("STOP");
                    traffic.setTextColor(getResources().getColor(R.color.black));
                } else if (traffic.getText().toString() == "RED")
                {

                    traffic.setText("WAIT");
                    traffic.setTextColor(getResources().getColor(R.color.black));

                }else {
                    traffic.setText("GO");
                    traffic.setTextColor(getResources().getColor(R.color.black));
                    traffic.setBackgroundColor(getResources().getColor(R.color.Green));


                    



                }


            }
        });


    }


}