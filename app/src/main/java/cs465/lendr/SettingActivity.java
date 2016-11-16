package cs465.lendr;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //step1 : create edit text variable
    private EditText loc;
    private Button b1;

    private EditText pn;
    private Button b2;

    private EditText cn;
    private Button b3;

    private EditText name;
    private Button b4;

    private EditText ba;
    private Button b5;

    private EditText ds;
    private Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //step2 : fetch edit text from xml file.

        loc = (EditText) findViewById(R.id.Location);
        b1 = (Button) findViewById(R.id.button1);
        pn = (EditText) findViewById(R.id.PhoneNumber);
        b2 = (Button) findViewById(R.id.button2);


        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //step3 : set the text to edit text by using setText function
                //et.setText("Button is clicked..");
                loc.setFocusable(true);
                loc.setCursorVisible(true);
                loc.setClickable(true);
                loc.isEnabled();
                loc.setFocusableInTouchMode(true);
            }
        });


        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //step3 : set the text to edit text by using setText function
                //et.setText("Button is clicked..");
                pn.setFocusable(true);
                pn.setCursorVisible(true);
                pn.setClickable(true);
                pn.isEnabled();
                pn.setFocusableInTouchMode(true);
            }
        });

        cn = (EditText) findViewById(R.id.CardNumber);
        b3 = (Button) findViewById(R.id.button3);

        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //step3 : set the text to edit text by using setText function
                //et.setText("Button is clicked..");
                cn.setFocusable(true);
                cn.setCursorVisible(true);
                cn.setClickable(true);
                cn.isEnabled();
                cn.setFocusableInTouchMode(true);
            }
        });

        name = (EditText) findViewById(R.id.Name);
        b4 = (Button) findViewById(R.id.button4);

        b4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //step3 : set the text to edit text by using setText function
                //et.setText("Button is clicked..");
                name.setFocusable(true);
                name.setCursorVisible(true);
                name.setClickable(true);
                name.isEnabled();
                name.setFocusableInTouchMode(true);
            }
        });

        ba = (EditText) findViewById(R.id.BillingAddress2);
        b5 = (Button) findViewById(R.id.button5);

        b5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //step3 : set the text to edit text by using setText function
                //et.setText("Button is clicked..");
                ba.setFocusable(true);
                ba.setCursorVisible(true);
                ba.setClickable(true);
                ba.isEnabled();
                ba.setFocusableInTouchMode(true);
            }
        });

        ds = (EditText) findViewById(R.id.DeliverySetting2);
        b6 = (Button) findViewById(R.id.button6);

        b6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //step3 : set the text to edit text by using setText function
                //et.setText("Button is clicked..");
                ds.setFocusable(true);
                ds.setCursorVisible(true);
                ds.setClickable(true);
                ds.isEnabled();
                ds.setFocusableInTouchMode(true);
            }
        });
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_profile) {
            // TODO start profile activity
            //Intent intent = new Intent(this, ProfileActivity.class);
            //startActivity(intent);
        } else if (id == R.id.nav_settings) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
