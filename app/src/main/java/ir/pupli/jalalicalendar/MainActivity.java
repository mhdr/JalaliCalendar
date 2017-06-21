package ir.pupli.jalalicalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.GregorianCalendar;

import ir.pupli.jalalicalendarlib.JCalendar;

public class MainActivity extends AppCompatActivity {

    TextView textViewDate1;
    TextView textViewDate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewDate1 = (TextView) findViewById(R.id.textViewDate1);
        textViewDate2 = (TextView) findViewById(R.id.textViewDate2);


        JCalendar jCalendar = new JCalendar(1396, 3, 31);
        textViewDate1.setText(jCalendar.toGregorianDate().toString());


        JCalendar jCalendar2 = new JCalendar(2017, 6, 21, true);
        textViewDate2.setText(jCalendar2.toString());
    }
}
