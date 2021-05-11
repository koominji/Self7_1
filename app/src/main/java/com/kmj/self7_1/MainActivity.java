package com.kmj.self7_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout baseLayout;
    EditText edtAngle;
    ImageView imageView1;
    String angle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseLayout = (RelativeLayout) findViewById(R.id.baseLayout);
        edtAngle = (EditText) findViewById(R.id.edtAngle);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        angle = edtAngle.toString();
//        Float angle1=Float.parseFloat(angle);
        switch (item.getItemId()) {
            case R.id.hanlaMT:
                imageView1.setImageResource(R.drawable.hanlamt);
                return true;
            case R.id.choojado:
                imageView1.setImageResource(R.drawable.choojado);
                return true;
            case R.id.bumsum:
                imageView1.setImageResource(R.drawable.bumsum);
                return true;
            case R.id.rotateImage:
                imageView1.setRotation(Float.parseFloat(edtAngle.getText().toString()));
                return true;
        }
        return false;
    }
}