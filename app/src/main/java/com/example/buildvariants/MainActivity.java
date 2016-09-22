package com.example.buildvariants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.buildvariants.util.ProHelper;
import com.example.buildvariants.util.ProHelperImp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProHelper proHelper = new ProHelperImp();
        TextView variant = (TextView) findViewById(R.id.variant);
        if (proHelper.isPro()){
            variant.setText(R.string.proText);
        }
        else {
            variant.setText(R.string.freeText);
        }
    }
}
