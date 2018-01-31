package com.example.android.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.phone_call);
    /*   for telephone number 650-555-5555 :)

            textView.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            String toCall = textView.getText().toString();
            callIntent.setData(Uri.parse("tel:"+toCall));
            startActivity(callIntent);
        });*/
    }
}
