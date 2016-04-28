package com.example.meena.bday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText bdaypname;
    String string;
    Button greet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*Need to make button and edittext disappear
probably selector can be used*/
        greet = (Button) findViewById(R.id.greet);
        greet.setVisibility(View.VISIBLE);
        greet.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {


                                         bdaypname = (EditText) findViewById(R.id.editText);
                                         bdaypname.setVisibility(View.VISIBLE);
                                         string = bdaypname.getText().toString();
                                         TextView intp = (TextView) findViewById(R.id.textView);
                                         string = "Happy Bday " + string + "!";
                                         intp.setText(string);
                                         greet.setVisibility(View.INVISIBLE);
                                         bdaypname.setVisibility(View.INVISIBLE);
                                     }
                                 });



   /* Not working with enter button need to debug
     bdaypname.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
        TextView intp = (TextView)findViewById(R.id.textView);
        string="Happy Bday "+string+"!";
                    return true;
                }
                return false;
            }
        });*/

    }
}
