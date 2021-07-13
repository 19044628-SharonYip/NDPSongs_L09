package sg.edu.rp.c346.id19044628.ndpsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

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
                Intent i = new Intent(MainActivity.this, ListActivity.class);
                startActivity(i);
            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = edTitle.getText().toString().trim();
                String singer= edSinger.getText().toString().trim();

                if(title.length()==0 || singer.length()==0)
                {
                    Toast.makeText(MainActivity.this, "Invalid inputs", Toast.LENGTH_SHORT).show();
                return;
                }
                String yearr= edYear.getText().toString().trim();
                int year=0;
                try{
                    year=Integer.valueOf(yearr);
                }catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Invalid year", Toast.LENGTH_SHORT).show();
                    return;
                }

                DBHelper dbh = new DBHelper(MainActivity.this);
                int star= getStars();
                dbh.insertSong(title, singer, year, star);
                dbh.close();
                Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_SHORT).show();

                edTitle.setText("");
                edSinger.setText("");
                edYear.setText("");
                }
            }
        });


    }
}