package com.example.taxbwithu.projektexodus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class OknoWyboru extends AppCompatActivity {

    String choice = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okno_wyboru);
    }

    public void onClickBtn(View v)
    {
        choice = "0";
        Intent intent = new Intent(getApplicationContext(),
                PlayerActivity.class);
        intent.putExtra("key",choice);
        startActivity(intent);

    }
    public void onClickBtn2(View v)
    {
        choice = "1";
        Intent intent = new Intent(getApplicationContext(),
                PlayerActivity.class);
        intent.putExtra("key",choice);
        startActivity(intent);

    }
    public void onClickBtn3(View v)
    {
        choice = "2";
        Intent intent = new Intent(getApplicationContext(),
                PlayerActivity.class);
        intent.putExtra("key",choice);
        startActivity(intent);

    }

    public void onClickBtn4(View v)
    {
        choice = "3";
        Intent intent = new Intent(getApplicationContext(),
                PlayerActivity.class);
        intent.putExtra("key",choice);
        startActivity(intent);

    }
    public void onClickBtn5(View v)
    {
        choice = "4";
        Intent intent = new Intent(getApplicationContext(),
                PlayerActivity.class);
        intent.putExtra("key",choice);
        startActivity(intent);

    }
}
