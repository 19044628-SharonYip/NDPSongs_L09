package sg.edu.rp.c346.id19044628.ndpsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText edTitle, edSinger, edYear;
    Button btnInsert, btnShow;
    RadioGroup rgStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTitle=findViewById(R.id.etTitle);
        edSinger=findViewById(R.id.etSingers);
        edYear=findViewById(R.id.etYear);
        rgStars=findViewById(R.id.rgStar);
        btnInsert=findViewById(R.id.btnInsert);
        btnShow=findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,
                        ListActivity.class);
                startActivity(i);
            }
        });


    }
}