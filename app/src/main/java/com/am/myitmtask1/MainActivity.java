package com.am.myitmtask1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5;
    Button b1, b2, b3;
    TextView t1;
    CheckBox cb;
    String nam, dob, mob, bl, loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        e1 = findViewById(R.id.editTextTextPersonName);
        e2 = findViewById(R.id.editTextTextPersonName2);
        e3 = findViewById(R.id.editTextTextPersonName3);
        e4 = findViewById(R.id.editTextTextPersonName4);
        e5 = findViewById(R.id.editTextTextPersonName5);
        t1 = findViewById(R.id.textView);
        cb = findViewById(R.id.checkBox);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb.isChecked()) {

                    nam = e1.getText().toString();
                    mob = e2.getText().toString();
                    loc = e3.getText().toString();
                    bl = e4.getText().toString();
                    dob = e5.getText().toString();

                    String adil = nam + "\n" + mob + "\n" + loc + "\n" + bl + "\n" + dob + "\n";

                    Toast.makeText(MainActivity.this, "you have typed " + adil, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please agree to terms!", Toast.LENGTH_SHORT).show();
                }
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb.isChecked()) {

                    nam = e1.getText().toString();
                    mob = e2.getText().toString();
                    loc = e3.getText().toString();
                    bl = e4.getText().toString();
                    dob = e5.getText().toString();

                    String adil = nam + "\n" + mob + "\n" + loc + "\n" + bl + "\n" + dob + "\n";

                    t1.setText(adil);

                } else {
                    Toast.makeText(MainActivity.this, "Please agree to terms!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb.isChecked()) {

                    nam = e1.getText().toString();
                    mob = e2.getText().toString();
                    loc = e3.getText().toString();
                    bl = e4.getText().toString();
                    dob = e5.getText().toString();

                    String adil = nam + "\n" + mob + "\n" + loc + "\n" + bl + "\n" + dob + "\n";

                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                    intent.putExtra("name",nam);
                    intent.putExtra("mobil",mob);
                    intent.putExtra("loca",loc);
                    intent.putExtra("blo",bl);
                    intent.putExtra("db",dob);

                    startActivity(intent);



                } else {
                    Toast.makeText(MainActivity.this, "Please agree to terms!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
