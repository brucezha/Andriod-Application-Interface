package cs465.lendr;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class ProfileActivity extends AppCompatActivity
    implements BookIconView.BookIconListener {

    private static final String TAG = "ProfileActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }


    public void onBookClicked(BookIconView book) {
        // TODO start book detail activity
        Log.d(TAG, "Book clicked");
    }
}
