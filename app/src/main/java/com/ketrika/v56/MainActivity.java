package com.ketrika.v56;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("KETRIKA v56\nMAITSO! SUCCESS!");
        tv.setTextSize(24);
        tv.setGravity(Gravity.CENTER);
        tv.setPadding(50, 200, 50, 50);
        setContentView(tv);
    }
}
