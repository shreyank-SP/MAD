package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

 import android.view.View;
 import android.widget.ArrayAdapter;
 import android.widget.Button;
 import android.widget.EditText;
 import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

        //Defining the Views
    EditText e1,e2;
    Button bt;
    Spinner s,s1;

        //Data for populating in Spinner
    String [] dept_array={"CSE","ECE","IT","Mech","Civil"};
    String [] dept_sem={"1","2","3","4","5","6","7","8"};
        String name,reg,dept,sem;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

        //Referring the Views
        e1= (EditText) findViewById(R.id.editText);
        e2= (EditText) findViewById(R.id.editText2);

        bt= (Button) findViewById(R.id.button);

        s= (Spinner) findViewById(R.id.spinner);
        s1= (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter adapter= new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,dept_array);
        ArrayAdapter adapter1= new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,dept_sem);
        s.setAdapter(adapter);
        s1.setAdapter(adapter1);
        bt.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {

      name=e1.getText().toString();
        reg=e2.getText().toString();
        dept=s.getSelectedItem().toString();
        sem=s1.getSelectedItem().toString();

               Intent i = new Intent(MainActivity.this, SecondAcitivity.class);


                 i.putExtra("name_key", name);
                 i.putExtra("reg_key",reg);
                 i.putExtra("dept_key", dept);
                 i.putExtra("sem_key",sem);

        startActivity(i);

        }
        });
}
}


