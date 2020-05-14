package sg.edu.rp.soi.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate,getBtnDisplayTime,btnreset;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplayDate=findViewById(R.id.buttonDisplayDate);
        btnreset = findViewById(R.id.btnreset);
        getBtnDisplayTime=findViewById(R.id.buttonDisplayTime);
        getBtnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvDisplay.setText( "Time is "+  tp.getCurrentHour() + ":" + tp.getCurrentMinute());
            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Date is "+ dp.getDayOfMonth()+"/"+ (dp.getMonth() + 1)+"/"+dp.getYear());
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.updateDate(2020,0,1);
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
            }
        });
    }


}
