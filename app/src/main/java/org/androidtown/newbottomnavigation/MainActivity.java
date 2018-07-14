package org.androidtown.newbottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        tv = (TextView)findViewById(R.id.textView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_medium:
                        tv.setText("Medium!");
                        break;
                    case R.id.action_wasd:
                        tv.setText("Wasd!");
                        break;
                    case R.id.action_android:
                        tv.setText("Android!");
                        break;
                }
                return true;
            }
        });
    }
}
