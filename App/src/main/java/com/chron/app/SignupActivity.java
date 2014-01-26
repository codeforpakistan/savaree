package com.chron.app;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.EditText;

public class SignupActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        View chips = (EditText) findViewById(R.id.name);
        Bitmap bkg = ((BitmapDrawable) getResources().getDrawable(R.drawable.plain_input)).getBitmap();
        BitmapDrawable bkgbt = new BitmapDrawable(getResources(),bkg);
        chips.setBackgroundDrawable((Drawable) bkgbt);

        View chips1 = (EditText) findViewById(R.id.email);
        Bitmap bkg1 = ((BitmapDrawable) getResources().getDrawable(R.drawable.plain_input)).getBitmap();
        BitmapDrawable bkgbt1 = new BitmapDrawable(getResources(),bkg1);
        chips1.setBackgroundDrawable((Drawable) bkgbt1);

        View chips2 = (EditText) findViewById(R.id.cnic);
        Bitmap bkg2 = ((BitmapDrawable) getResources().getDrawable(R.drawable.plain_input)).getBitmap();
        BitmapDrawable bkgbt2 = new BitmapDrawable(getResources(),bkg2);
        chips2.setBackgroundDrawable((Drawable) bkgbt2);

        View chips3 = (EditText) findViewById(R.id.address);
        Bitmap bkg3 = ((BitmapDrawable) getResources().getDrawable(R.drawable.plain_input)).getBitmap();
        BitmapDrawable bkgbt3 = new BitmapDrawable(getResources(),bkg3);
        chips3.setBackgroundDrawable((Drawable) bkgbt3);

        View chips4 = (EditText) findViewById(R.id.password);
        Bitmap bkg4 = ((BitmapDrawable) getResources().getDrawable(R.drawable.plain_input)).getBitmap();
        BitmapDrawable bkgbt4 = new BitmapDrawable(getResources(),bkg4);
        chips4.setBackgroundDrawable((Drawable) bkgbt4);

        View chips5 = (EditText) findViewById(R.id.conformpassword);
        Bitmap bkg5 = ((BitmapDrawable) getResources().getDrawable(R.drawable.plain_input)).getBitmap();
        BitmapDrawable bkgbt5 = new BitmapDrawable(getResources(),bkg5);
        chips5.setBackgroundDrawable((Drawable) bkgbt5);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.signup, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main3, container, false);
            return rootView;
        }
    }

}
