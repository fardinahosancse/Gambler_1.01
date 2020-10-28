package com.fardin.a8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    int  store = 0;
    int click = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // UI BUTTON ASSIGN
        Button suffle_button = (Button)findViewById(R.id.suffle_button);
        Button reset_button = (Button)findViewById(R.id.reset_button);

        //UI IMAGE ASSIGN

      final  ImageView one = (ImageView)findViewById(R.id.one_w);
     final   ImageView two = (ImageView)findViewById(R.id.two_w);
       final ImageView three = (ImageView)findViewById(R.id.three_w);
       final ImageView four = (ImageView)findViewById(R.id.four_w);
       final ImageView five = (ImageView)findViewById(R.id.five_w);
       final ImageView six = (ImageView)findViewById(R.id.six_w);


       //Input Image Taking



        //OnClick Button "Suffle"


        suffle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Random randomGen = new Random();
                store = randomGen.nextInt(7);
                Log.d("Gambler " , "Number is : " +store);
                switch (store)
                {
                    case 1 : one.setImageResource(R.drawable.one_red);
                        break;
                    case 2 : two.setImageResource(R.drawable.two_red);
                        break;
                    case 3 : three.setImageResource(R.drawable.three_red);
                        break;
                    case 4 : four.setImageResource(R.drawable.four_red);
                        break;
                    case 5 : five.setImageResource(R.drawable.five_red);
                        break;
                    case 6 : six.setImageResource(R.drawable.six_red);
                        break;

                }

                suffle_button.setEnabled(false);



            }




        });




        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (store)
                {
                    case 1 : one.setImageResource(R.drawable.one);

                    case 2 : two.setImageResource(R.drawable.two);

                    case 3 : three.setImageResource(R.drawable.three);

                    case 4 : four.setImageResource(R.drawable.four);

                    case 5 : five.setImageResource(R.drawable.five);

                    case 6 : six.setImageResource(R.drawable.six);


                }
                click = 1;
                if(store!=0)
                {
                    store =0;
                }

                if(click==1)
                {
                    suffle_button.setEnabled(true);
                }



            }
        });



    }
}