package cs465.lendr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class SettingActivity extends AppCompatActivity {
    //step1 : create edit text variable
    private EditText et;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step2 : fetch edit text from xml file.
        et = (EditText) findViewById(R.id.Location);
        b = (Button) findViewById(R.id.button1);

        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //step3 : set the text to edit text by using setText function
                //et.setText("Button is clicked..");
                et.setFocusable(true);
                et.setCursorVisible(true);
                et.setClickable(true);
                et.isEnabled();
                et.setFocusableInTouchMode(true);
            }
        });
    }

}
