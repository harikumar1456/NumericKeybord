package com.example.administrator.keybordexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;

    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(b1.getTag().toString());
//                e1.setText(b1.getTag().toString());


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(b2.getTag().toString());
//                e2.setText(b2.getTag().toString());

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(b3.getTag().toString());
//                e3.setText(b3.getTag().toString());

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(b4.getTag().toString());
//                e1.setText(b1.getTag().toString());


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(b5.getTag().toString());
//                e2.setText(b2.getTag().toString());

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(b6.getTag().toString());
//                e3.setText(b3.getTag().toString());

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(b7.getTag().toString());
//                e1.setText(b1.getTag().toString());


            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(b8.getTag().toString());
//                e2.setText(b2.getTag().toString());

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(b9.getTag().toString());
//                e3.setText(b3.getTag().toString());

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clear();
//                e3.setText(b3.getTag().toString());

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                back();
//                e3.setText(b3.getTag().toString());

            }
        });
//        b12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                forword();
//                e3.setText(b3.getTag().toString());

         //   }
        //});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void buttonClick(String press)
    {
        switch(press)
        {
            case "1" :
                setText(press);
                break;
            case "2" :
                setText(press);
                break;
            case "3" :
                setText(press);
                break;
            case "4" :
                setText(press);
                break;
            case "5" :
                setText(press);
                break;
            case "6" :
                setText(press);
                break;
            case "7" :
                setText(press);
                break;
            case "8" :
                setText(press);
                break;

            case "9" :
                setText(press);
                break;



        }
    }

    private void setText(String press) {
        if((e1.getText().toString()).equals("")) {
            e1.requestFocus();
            e1.setText(press);
            e2.requestFocus();

        }
        else if((e2.getText().toString()).equals("")) {
            e2.requestFocus();
            e2.setText(press);
            e3.requestFocus();

        }
        else if((e3.getText().toString()).equals("")) {
            e3.requestFocus();
            e3.setText(press);
            e4.requestFocus();

        }
        else if((e4.getText().toString()).equals("")) {
            e4.requestFocus();
            e4.setText(press);


        }
    }
    public void clear()
    {
        if(e1.isFocused())
        {
            e1.setText("");
        }else if(e2.isFocused())
    {
        e2.setText("");
    }else if(e3.isFocused())
        {
            e3.setText("");
        }else if(e4.isFocused())
        {
            e4.setText("");
        }
    }
    public void back()
    {
        if(e4.isFocused())
        {
            e4.setText("");
            e3.requestFocus();
           // e3.setText("");
        }else if(e3.isFocused())
        {
            e3.setText("");
            e2.requestFocus();
           // e2.setText("");
        }else if(e2.isFocused())
        {
            e2.setText("");
            e1.requestFocus();
            //e1.setText("");
        }
        else
        {
            e1.setText("");
        }
    }
    public void forword()
    {
        if(e1.isFocused())
        {
            e2.requestFocus();
        }else if(e2.isFocused())
        {
            e3.requestFocus();
        }else if(e3.isFocused())
        {
            e4.requestFocus();
        }
    }
}
