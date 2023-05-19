package sg.edu.rp.c346.id22028460.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView tvString2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intentReceived = getIntent();
        tvString2.setText("Module Code: C349" +
                " Module Name: iPad Programming" +
                " Academic Year: 2023" +
                " Semester: 1" +
                " Module Credit: 4" +
                " Venue: W64M");
    }
}