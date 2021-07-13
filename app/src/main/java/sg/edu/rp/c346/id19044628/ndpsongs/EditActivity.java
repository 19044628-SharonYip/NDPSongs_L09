package sg.edu.rp.c346.id19044628.ndpsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class EditActivity extends AppCompatActivity {

    EditText etID, edTitle, edSinger, edYear;
    Button btnUpdate, btnDel, btnCancel;
    RadioGroup rgStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        etID=findViewById(R.id.etID);
        edTitle=findViewById(R.id.etTitle);
        edSinger=findViewById(R.id.etSingers);
        edYear=findViewById(R.id.etYear);
        rgStars=findViewById(R.id.rgStar);
        btnUpdate=findViewById(R.id.btnUpdate);
        btnDel=findViewById(R.id.btnDel);
        btnCancel=findViewById(R.id.btnCancel);
    }
}