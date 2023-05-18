package sg.edu.rp.c346.id22022096.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c203;
    TextView c206;
    TextView c218;
    TextView c235;
    TextView c346;
    ImageView imagePHP;
    ImageView imageSDC;
    ImageView imageUIUX;
    ImageView imageHack;
    ImageView imageAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c203 = findViewById(R.id.c203);
        c206 = findViewById(R.id.c206);
        c218 = findViewById(R.id.c218);
        c235 = findViewById(R.id.c235);
        c346 = findViewById(R.id.c346);
        imagePHP = findViewById(R.id.imagePHP);
        imageSDC = findViewById(R.id.imageSDC);
        imageUIUX = findViewById(R.id.imageUIUX);
        imageHack = findViewById(R.id.imageHack);
        imageAndroid = findViewById(R.id.imageAndroid);

        c203.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, moduledisplay.class);
            intent.putExtra("ModuleCode","C203");
            intent.putExtra("ModuleName","Web Appln Development in PHP");
            intent.putExtra("AcademicYear","2023");
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","W65C");
            startActivity(intent);
        });

        imagePHP.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, moduledisplay.class);
            intent.putExtra("ModuleCode","C203");
            intent.putExtra("ModuleName","Web Appln Development in PHP");
            intent.putExtra("AcademicYear","2023");
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","W65C");
            startActivity(intent);
        });

        c206.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, moduledisplay.class);
            intent.putExtra("ModuleCode","C206");
            intent.putExtra("ModuleName","Software Development Process");
            intent.putExtra("AcademicYear","2023");
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","W65C");
            startActivity(intent);
        });

        imageSDC.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, moduledisplay.class);
            intent.putExtra("ModuleCode","C203");
            intent.putExtra("ModuleName","Web Appln Development in PHP");
            intent.putExtra("AcademicYear","2023");
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","W65C");
            startActivity(intent);
        });

        c218.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, moduledisplay.class);
            intent.putExtra("ModuleCode","C218");
            intent.putExtra("ModuleName","UI/UX Design for Apps");
            intent.putExtra("AcademicYear","2023");
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","W65C");
            startActivity(intent);
        });

        imageUIUX.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, moduledisplay.class);
            intent.putExtra("ModuleCode","C203");
            intent.putExtra("ModuleName","Web Appln Development in PHP");
            intent.putExtra("AcademicYear","2023");
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","W65C");
            startActivity(intent);
        });

        c235.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, moduledisplay.class);
            intent.putExtra("ModuleCode","C235");
            intent.putExtra("ModuleName","IT Security & Management");
            intent.putExtra("AcademicYear","2023");
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","W65C");
            startActivity(intent);
        });

        imageHack.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, moduledisplay.class);
            intent.putExtra("ModuleCode","C203");
            intent.putExtra("ModuleName","Web Appln Development in PHP");
            intent.putExtra("AcademicYear","2023");
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","W65C");
            startActivity(intent);
        });

        c346.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, moduledisplay.class);
            intent.putExtra("ModuleCode","C235");
            intent.putExtra("ModuleName","Mobile App Development");
            intent.putExtra("AcademicYear","2023");
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","E63A");
            startActivity(intent);
        });

        imageAndroid.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, moduledisplay.class);
            intent.putExtra("ModuleCode","C203");
            intent.putExtra("ModuleName","Web Appln Development in PHP");
            intent.putExtra("AcademicYear","2023");
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","W65C");
            startActivity(intent);
        });

    }
}