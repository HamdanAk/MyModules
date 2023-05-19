package sg.edu.rp.c346.id22028460.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvString1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvString1 = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        tvString1.setText("Module Code: C346" +
                         " Module Name: Android Programming" +
                         " Academic Year: 2023" +
                         " Semester: 1" +
                         " Module Credit: 4" +
                         " Venue: W66M");

    }
}