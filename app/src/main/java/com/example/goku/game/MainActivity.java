package com.example.goku.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ImageView image1,image2;
    EditText name_of_word;
    Button submit1, restart;
    int level=1,count=1;

    TextView show;

    private static HashMap<Integer, String> abc = new HashMap<Integer, String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit1 = (Button) findViewById(R.id.submit);
        restart = (Button) findViewById(R.id.reset);
        name_of_word = (EditText) findViewById(R.id.input);

        abc.put(1,"a1_sand|b1_wich");
        abc.put(2,"a2_hot|b2_dog");
        abc.put(3,"a3_ear|b3_ring");
        abc.put(4,"a4_rain|b4_bow");
        abc.put(5,"a5_sea|b5_saw");
        abc.put(6,"a6_mil|b6_lion");
        abc.put(7,"a7_peo|b7_ple");
        abc.put(8,"a9_knight|b9_mare");
        abc.put(9,"a9_pen|b9_ny");
        abc.put(10,"a10_pea|b8_pole");


        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        show = (TextView) findViewById(R.id.level);


        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // check();
               // String word = name_of_word.toString();

                String name = name_of_word.getText().toString();
                if(level == 1) {
                    name = name.toLowerCase();
                   /// System.out.println("hello oo : " + level + " " + name);
                    String s;
                    s = abc.get(count);
                    String fistImage = s.substring(0, s.indexOf('|'));
                    String secondImage = s.substring(s.indexOf('|') + 1);
                    String firstname = fistImage.substring(s.indexOf('_') + 1);
                    String lastname = secondImage.substring(s.indexOf('_') + 1);
                    System.out.println(firstname + " " + lastname + " " + fistImage + " " + secondImage);
                    //String
                    if (name.equals(firstname + lastname)) {
                        // System.out.println("hello oo : "+level);
                        level++;
                        count++;
                        Toast.makeText(getApplicationContext(), name + " is right ...", Toast.LENGTH_LONG).show();
//                        s = abc.get(count);
//                        fistImage = s.substring(0, s.indexOf('|'));
//                        secondImage = s.substring(s.indexOf('|') + 1);
//                        firstname = fistImage.substring(s.indexOf('_') + 1);
//                        lastname = secondImage.substring(s.indexOf('_') + 1);
                        image1.setImageResource(R.drawable.a2_hot);
                        image2.setImageResource(R.drawable.b2_dog);
                        name_of_word.setText("");
                        show.setText("Level " + level);

                    } else {
                        Toast.makeText(getApplicationContext(), "Think correct word \n Be ware of blank space... ", Toast.LENGTH_LONG).show();
                    }

                    //  Toast.makeText(getApplicationContext(),secondImage+" ...",Toast.LENGTH_LONG).show();
                }
                else if (level ==2)
                {
                    String s;
                    s = abc.get(count);
                    String fistImage = s.substring(0, s.indexOf('|'));
                    String secondImage = s.substring(s.indexOf('|') + 1);
                    String firstname = fistImage.substring(s.indexOf('_') + 1);
                    String lastname = secondImage.substring(s.indexOf('_') + 1);
                    System.out.println(firstname + " " + lastname + " " + fistImage + " " + secondImage);
                    //String
                    if (name.equals(firstname + lastname)) {
                        // System.out.println("hello oo : "+level);
                        level++;
                        count++;
                        Toast.makeText(getApplicationContext(), name + " is right ...", Toast.LENGTH_LONG).show();
                        s = abc.get(count);
                        image1.setImageResource(R.drawable.a3_ear);
                        image2.setImageResource(R.drawable.b3_ring);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                      //  Toast.makeText(getApplicationContext(),"hotdog is right ...",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==3)
                {
                    String s;
                    s = abc.get(count);
                    String fistImage = s.substring(0, s.indexOf('|'));
                    String secondImage = s.substring(s.indexOf('|') + 1);
                    String firstname = fistImage.substring(s.indexOf('_') + 1);
                    String lastname = secondImage.substring(s.indexOf('_') + 1);
                    System.out.println(firstname + " " + lastname + " " + fistImage + " " + secondImage);
                    //String
                    if (name.equals(firstname + lastname)) {
                        // System.out.println("hello oo : "+level);
                        level++;
                        count++;
                        Toast.makeText(getApplicationContext(), name + " is right ...", Toast.LENGTH_LONG).show();
                        s = abc.get(count);
                        image1.setImageResource(R.drawable.a4_rain);
                        image2.setImageResource(R.drawable.b4_bow);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                       // Toast.makeText(getApplicationContext(),"earring is right ....",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space...",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==4)
                {
                    String s;
                    s = abc.get(count);
                    String fistImage = s.substring(0, s.indexOf('|'));
                    String secondImage = s.substring(s.indexOf('|') + 1);
                    String firstname = fistImage.substring(s.indexOf('_') + 1);
                    String lastname = secondImage.substring(s.indexOf('_') + 1);
                    System.out.println(firstname + " " + lastname + " " + fistImage + " " + secondImage);
                    //String
                    if (name.equals(firstname + lastname)) {
                        // System.out.println("hello oo : "+level);
                        level++;
                        count++;
                        Toast.makeText(getApplicationContext(), name + " is right ...", Toast.LENGTH_LONG).show();
                        s = abc.get(count);
                        image1.setImageResource(R.drawable.a5_sea);
                        image2.setImageResource(R.drawable.b5_saw);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                      //  Toast.makeText(getApplicationContext(),"rainbow is right ....",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space...",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==5)
                {
                    String s;
                    s = abc.get(count);
                    String fistImage = s.substring(0, s.indexOf('|'));
                    String secondImage = s.substring(s.indexOf('|') + 1);
                    String firstname = fistImage.substring(s.indexOf('_') + 1);
                    String lastname = secondImage.substring(s.indexOf('_') + 1);
                    System.out.println(firstname + " " + lastname + " " + fistImage + " " + secondImage);
                    //String
                    if (name.equals(firstname + lastname)) {
                        // System.out.println("hello oo : "+level);
                        level++;
                        count++;
                        Toast.makeText(getApplicationContext(), name + " is right ...", Toast.LENGTH_LONG).show();
                        s = abc.get(count);
                        image1.setImageResource(R.drawable.a7_mill);
                        image2.setImageResource(R.drawable.b7_lion);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                       // Toast.makeText(getApplicationContext(),"seasaw is right ....",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==6)
                {
                    String s;
                    s = abc.get(count);
                    String fistImage = s.substring(0, s.indexOf('|'));
                    String secondImage = s.substring(s.indexOf('|') + 1);
                    String firstname = fistImage.substring(s.indexOf('_') + 1);
                    String lastname = secondImage.substring(s.indexOf('_') + 1);
                    System.out.println(firstname + " " + lastname + " " + fistImage + " " + secondImage);
                    //String
                    if (name.equals(firstname + lastname)) {
                        // System.out.println("hello oo : "+level);
                        level++;
                        count++;
                        Toast.makeText(getApplicationContext(), name + " is right ...", Toast.LENGTH_LONG).show();
                        s = abc.get(count);
                        image1.setImageResource(R.drawable.a8_pea);
                        image2.setImageResource(R.drawable.b8_pole);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                        //Toast.makeText(getApplicationContext(),"million is right ....",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==7)
                {
                    String s;
                    s = abc.get(count);
                    String fistImage = s.substring(0, s.indexOf('|'));
                    String secondImage = s.substring(s.indexOf('|') + 1);
                    String firstname = fistImage.substring(s.indexOf('_') + 1);
                    String lastname = secondImage.substring(s.indexOf('_') + 1);
                    System.out.println(firstname + " " + lastname + " " + fistImage + " " + secondImage);
                    //String
                    if (name.equals(firstname + lastname)) {
                        // System.out.println("hello oo : "+level);
                        level++;
                        count++;
                        Toast.makeText(getApplicationContext(), name + " is right ...", Toast.LENGTH_LONG).show();
                        s = abc.get(count);
                        image1.setImageResource(R.drawable.a9_knight);
                        image2.setImageResource(R.drawable.b9_mare);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                       // Toast.makeText(getApplicationContext(),"people is right ....",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==8)
                {
                    String s;
                    s = abc.get(count);
                    String fistImage = s.substring(0, s.indexOf('|'));
                    String secondImage = s.substring(s.indexOf('|') + 1);
                    String firstname = fistImage.substring(s.indexOf('_') + 1);
                    String lastname = secondImage.substring(s.indexOf('_') + 1);
                    System.out.println(firstname + " " + lastname + " " + fistImage + " " + secondImage);
                    //String
                    if (name.equals(firstname + lastname)) {
                        // System.out.println("hello oo : "+level);
                        level++;
                        count++;
                        Toast.makeText(getApplicationContext(), name + " is right ...", Toast.LENGTH_LONG).show();
                        s = abc.get(count);
                        image1.setImageResource(R.drawable.b6_pen);
                        image2.setImageResource(R.drawable.a6_knee);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                       // Toast.makeText(getApplicationContext(),"nightmare is right ....",Toast.LENGTH_LONG).show();


                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space...",Toast.LENGTH_LONG).show();
                    }
                }else if (level ==9)
                {
                    String s;
                    s = abc.get(count);
                    String fistImage = s.substring(0, s.indexOf('|'));
                    String secondImage = s.substring(s.indexOf('|') + 1);
                    String firstname = fistImage.substring(s.indexOf('_') + 1);
                    String lastname = secondImage.substring(s.indexOf('_') + 1);
                    System.out.println(firstname + " " + lastname + " " + fistImage + " " + secondImage);
                    //String
                    if (name.equals(firstname + lastname)) {
                        // System.out.println("hello oo : "+level);
                        level++;
                        count++;
                        Toast.makeText(getApplicationContext(), name + " is right ...", Toast.LENGTH_LONG).show();
                        s = abc.get(count);
                        Toast.makeText(getApplicationContext(),"Level is complete",Toast.LENGTH_LONG).show();
                        Intent intent1 = new Intent(MainActivity.this,Home.class);

                        startActivity(intent1);
                        finish();
                    }
                    else
                    {
                        //Toast.makeText(getApplicationContext(),"Think correct word \n" +                                " Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // level =1;
                name_of_word.setText("");
            }
        });
    }


}
