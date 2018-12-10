package com.example.user.dzienniczekucznia.activity;


import com.example.user.dzienniczekucznia.R;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class PlanActivity extends Activity {
    CalendarView calendarView;
    TextView dateDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        dateDisplay = (TextView) findViewById(R.id.date_display);
        dateDisplay.setText("Data: ");

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                dateDisplay.setText("Data: " + i2 + " / " + i1 + " / " + i);

                Toast.makeText(getApplicationContext(), "Wybrana data:\n" + "Dzień = " + i2 + "\n" + "Miesiąc = " + i1 + "\n" + "Rok = " + i +  "\n" +"Brak zajęć w wybranym dniu", Toast.LENGTH_LONG).show();
            }
        });
    }
}