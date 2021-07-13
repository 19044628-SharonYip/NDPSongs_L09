package sg.edu.rp.c346.id19044628.ndpsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        DBHelper dbh=new DBHelper(this);
        al=dbh.getAllSongs();
        dbh.close();

        aa = new ArrayAdapter<Song>(this,
                android.R.layout.simple_list_item_1, al);
        lvSong.setAdapter(aa);

        lvSong.setOnItemClickListener((parent, view, position, id) -> {
            Intent i = new Intent(ListActivity.this, EditActivity.class);
            i.putExtra("song", al.get(position));
            startActivity(i);
        });

        btnShowAll.setOnClickListener((v)->
        {
            DBHelper dbh= new DBHelper(ListActivity.this);
            al.clear();
            al.addAll(dbh.getAllSongByStar(5));
            aa.notifyDataSetChanged();
        });







    }
}