package com.example.hellotoast;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    int Count = 0;
    TextView tEXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tEXT = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello Toast!",
                Toast.LENGTH_SHORT);
        toast.show();
    }


    public void countUp(View view) {
        Count++;
        if (tEXT != null)
            tEXT.setText(Integer.toString(Count));
    }
}
