package sg.edu.rp.c346.id19044628.ndpsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    Button btnShowAll;
    ListView lvSong;
    ArrayList<Song> al;
    ArrayAdapter<Song> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btnShowAll=findViewById(R.id.btnShowStar);
        lvSong=findViewById(R.id.lv);
        al = new ArrayList<Song>();
        aa = new ArrayAdapter<Song>(this,
                android.R.layout.simple_list_item_1, al);
        lvSong.setAdapter(aa);

    }
}