package com.tamanna.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tamanna.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //TextView emailperson , namePerson;

    private ActivityMainBinding activityMainBinding;

    private MainactivityClickHandlers handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        emailperson = findViewById(R.id.personEmail);
//        namePerson= findViewById(R.id.personName);

//        namePerson.setText(person1.getName());
//        emailperson.setText(person1.getEmail());

        Person person1 = new Person("Tamanna","tamannpriyadarshini96@gmail.com");


        //Binding the textview
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setPerson(person1);

        // Binding the handler

        handler = new MainactivityClickHandlers(this);
        activityMainBinding.setClickHandler(handler);

    }

    public class MainactivityClickHandlers{

        Context context ;

        public MainactivityClickHandlers(Context context){
            this.context = context;
        }

        //First Button click handling

        public  void onButtonClick(View view){
            Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
        }


        //Second Button click handling

        public  void onButton2Click(View view){
            Toast.makeText(context, "Bye", Toast.LENGTH_SHORT).show();
    }
}}