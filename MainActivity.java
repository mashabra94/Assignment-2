package com.labram.labram;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //decl`arin them as inst`ances so `aq touse them ``anywhere in progr`am
  EditText editText;
    Button button;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //reference the views
        editText=(EditText)findViewById(R.id.nameinput);
        button=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.sayname);


        //sticking `a listener on button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editText.getText().toString();

                String fin="Hey your name is  "+name;

                if(name.isEmpty()){
                    tv.setText("Please enter a name");
                    Toast.makeText(MainActivity.this,"Please enter a name",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,fin,Toast.LENGTH_SHORT).show();

                    tv.setText(fin);

                    editText.setText("");

                }



            }
        });

    }






}
