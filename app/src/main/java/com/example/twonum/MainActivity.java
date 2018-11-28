package com.example.twonum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn,btn1,btn2,btn3;
    TextView tv1,tv2,tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById (R.id.tv3);
        btn = (Button) findViewById (R.id.btn);
        btn1 = (Button) findViewById (R.id.btn1);
        btn2 = (Button) findViewById (R.id.btn2);
        btn3 = (Button) findViewById (R.id.btn3);

    }
    int x,y;
    Random rnd=new Random();
    public void create(View view) {
        x=rnd.nextInt();
        tv2.setText("first:" + x);
        tv3.setText("second:" + y);
        y=rnd.nextInt();

    }

    public void small(View view) {
        if (x<y) tv1.setText ("True");
        else tv1.setText ("False");
    }

    public void neq(View view) {
        if (x==y) tv1.setText ("True");
        else tv1.setText("False");
    }

    public void big(View view) {
        if (x>y) tv1.setText ("True");
        else tv1.setText("False");
    }
}
