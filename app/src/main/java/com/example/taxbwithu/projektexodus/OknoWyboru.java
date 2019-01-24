package com.example.taxbwithu.projektexodus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class OknoWyboru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okno_wyboru);
    }

    public void onClickBtn(View v)
    {
        Intent intent = new Intent(getApplicationContext(),
                PlayerActivity.class);
        intent.putExtra("Value1", "Java");
        intent.putExtra("Value2", "Android");
        startActivity(intent);

    }
}
