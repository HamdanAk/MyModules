package sg.edu.rp.c346.id22028460.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvString1;
    TextView tvString2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvString1 = findViewById(R.id.tvC346);
        tvString1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("value", "Module Code: C346" +
                                                     " Module Name: Android Programming" +
                                                     " Academic Year: 2023" +
                                                     " Semester: 1" +
                                                     " Module Credit: 4" +
                                                     " Venue: W66M");
                startActivity(intent);

            }
        });
        tvString2 = findViewById(R.id.tvC349);
        tvString2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra("value", "Module Code: C349" +
                                                     " Module Name: iPad Programming" +
                                                     " Academic Year: 2023" +
                                                     " Semester: 1" +
                                                     " Module Credit: 4" +
                                                     " Venue: W64M");
                startActivity(intent);
            }
        });
    }
}

