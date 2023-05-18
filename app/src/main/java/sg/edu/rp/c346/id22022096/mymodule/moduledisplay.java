package sg.edu.rp.c346.id22022096.mymodule;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class moduledisplay extends AppCompatActivity {

    TextView tvresults;
    Button btnreturn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moduledisplay);

        tvresults = findViewById(R.id.result);
        btnreturn = findViewById(R.id.btnreturn);

        Intent intent = getIntent();
        String results = String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s",
                intent.getStringExtra("ModuleCode"),
                intent.getStringExtra("ModuleName"),
                intent.getStringExtra("AcademicYear"),
                intent.getIntExtra("Semester",0),
                intent.getIntExtra("ModuleCredit",0),
                intent.getStringExtra("Venue"));
        tvresults.setText(results);

        btnreturn.setOnClickListener(v -> finish());


    }
}