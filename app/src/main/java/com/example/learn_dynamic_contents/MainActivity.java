package com.example.learn_dynamic_contents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout layout=new RelativeLayout(this);
        layout.setBackgroundColor(getResources().getColor(R.color.fadedyellow));
        setContentView(layout);

        Button button=new Button(this);
        button.setText("Click Me");
        RelativeLayout.LayoutParams layoutParams=new RelativeLayout.
                LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);


        button.setLayoutParams(layoutParams);
        layout.addView(button);
    }
}
