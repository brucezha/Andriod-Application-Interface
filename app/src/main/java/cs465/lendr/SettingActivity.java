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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import cs465.lendr.EditButton;

public class SettingActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //step1 : create edit text variable
    private EditText loc;
    private EditButton b1;

    private EditText pn;
    private EditButton b2;

    private EditText cn;
    private EditButton b3;

    private EditText name;
    private EditButton b4;

    private EditText ba;
    private EditButton b5;

    private EditText ds;
    private EditButton b6;

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
        b1 = (EditButton) findViewById(R.id.EditButton1);

        b1.setEditText(loc);

        pn = (EditText) findViewById(R.id.PhoneNumber);
        b2 = (EditButton) findViewById(R.id.EditButton2);

        b2.setEditText(pn);

        cn = (EditText) findViewById(R.id.CardNumber);
        b3 = (EditButton) findViewById(R.id.EditButton3);

        b3.setEditText(cn);

        name = (EditText) findViewById(R.id.Name);
        b4 = (EditButton) findViewById(R.id.EditButton4);

        b4.setEditText(name);

        ba = (EditText) findViewById(R.id.BillingAddress2);
        b5 = (EditButton) findViewById(R.id.EditButton5);

        b5.setEditText(ba);

        ds = (EditText) findViewById(R.id.DeliverySetting2);
        b6 = (EditButton) findViewById(R.id.EditButton6);

        b6.setEditText(ds);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_settings) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
