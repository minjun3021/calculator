package com.example.kmj.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView res;
    TextView bt0;
    TextView bt1;
    TextView bt2;
    TextView bt3;
    TextView bt4;
    TextView bt5;
    TextView bt6;
    TextView bt7;
    TextView bt8;
    TextView bt9;
    Text text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res=(TextView) findViewById(R.id.mainText);
        bt0=(TextView)findViewById(R.id.num0);
        bt1=(TextView)findViewById(R.id.num1);
        bt2=(TextView)findViewById(R.id.num2);
        bt3=(TextView)findViewById(R.id.num3);
        bt4=(TextView)findViewById(R.id.num4);
        bt5=(TextView)findViewById(R.id.num5);
        bt6=(TextView)findViewById(R.id.num6);
        bt7=(TextView)findViewById(R.id.num7);
        bt8=(TextView)findViewById(R.id.num8);
        bt9=(TextView)findViewById(R.id.num9);

        res.setOnClickListener(this);
        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.num0:
                res.setText(res.getText()+"0");
                break;
            case R.id.num1:
                res.setText(res.getText()+"1");
                break;
            case R.id.num2:
                res.setText(res.getText()+"2");
                break;
            case R.id.num3:
                res.setText(res.getText()+"3");
                break;
            case R.id.num4:
                res.setText(res.getText()+"4");
                break;
            case R.id.num5:
                res.setText(res.getText()+"5");
                break;
            case R.id.num6:
                res.setText(res.getText()+"6");
                break;
            case R.id.num7:
                res.setText(res.getText()+"7");
                break;
            case R.id.num8:
                res.setText(res.getText()+"8");
                break;
            case R.id.num9:
                res.setText(res.getText()+"9");
                break;
        }
    }
}
