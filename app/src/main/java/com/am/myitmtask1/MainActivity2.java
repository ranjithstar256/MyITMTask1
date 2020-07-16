package com.am.myitmtask1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5;
    String nam, dob, mob, bl, loc;

    ListView listView;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView=findViewById(R.id.lv);
        arrayList=new ArrayList();


        nam=getIntent().getStringExtra("name");
        mob=getIntent().getStringExtra("mobil");
        loc=getIntent().getStringExtra("loca");
        bl=getIntent().getStringExtra("blo");
        dob=getIntent().getStringExtra("db");

        arrayList.add(nam);
        arrayList.add(mob);
        arrayList.add(loc);
        arrayList.add(bl);
        arrayList.add(dob);
        arrayAdapter= new ArrayAdapter(MainActivity2.this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==1){
                    String num = (String) arrayList.get(1);
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(num,null,"successfully registered",null,null);

                    // assume notification code added here

                } else if (position==4){
                    startActivity(new Intent(MainActivity2.this,MainActivity3.class));
                }
            }
        });

        tv1=findViewById(R.id.textView2);
        tv2=findViewById(R.id.textView3);
        tv3=findViewById(R.id.textView4);
        tv4=findViewById(R.id.textView5);
        tv5=findViewById(R.id.textView6);

        tv1.setText(nam);
        tv2.setText(mob);
        tv3.setText(loc);
        tv4.setText(bl);
        tv5.setText(dob);
    }
}