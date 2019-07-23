package com.blure.complexviewexample;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.blure.complexview.ComplexView;
import com.blure.complexview.Shadow;

import static android.widget.RelativeLayout.CENTER_IN_PARENT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup vg = (ViewGroup) getLayoutInflater().inflate(R.layout.activity_main, null);
        setContentView(vg);
        ComplexView complexView = new ComplexView(this);
        ComplexView.LayoutParams params = new ComplexView.LayoutParams(50, 50);
        params.addRule(CENTER_IN_PARENT);
        complexView.setLayoutParams(params);
        complexView.setRadius(50);
        float[] radius = {50, 50, 50, 50, 50, 50, 50, 50};
        ComplexView.LayoutParams param = new ComplexView.LayoutParams(50, 50);
        ComplexView view = new ComplexView(this);
        view.setColor(Color.parseColor("#B388FF"));
        view.setLayoutParams(param);
        view.setRadius(50);
        complexView.addView(view);
        complexView.setShadow(new Shadow(1, 100, "#000000", GradientDrawable.RECTANGLE, radius));
        vg.addView(complexView);
    }
}
