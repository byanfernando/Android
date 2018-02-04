package com.example.byanfernando.studycase;

/**
 * Created by byanfernando on 2/4/2018.
 */


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;
        import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1 = (TextView)findViewById(R.id.namamakan);
        txt2 = (TextView)findViewById(R.id.namaporsi);
        txt3 = (TextView)findViewById(R.id.tempatmakan);
        txt4 = (TextView)findViewById(R.id.harga);

        Bundle b1 = getIntent().getExtras();
        Bundle b2 = getIntent().getExtras();
        Bundle b3 = getIntent().getExtras();
        Bundle b4 = getIntent().getExtras();
        String s1 = b1.getString("byan1");
        String s2 = b2.getString("byan2");
        String s3 = b3.getString("byan3");
        String s4 = b4.getString("byan44");
        txt1.setText(s1);
        txt2.setText(s2);
        txt3.setText(s3);
        txt4.setText(s4);
    }
}

