package com.kenennethtucker.taoteching;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class TaoActivity extends AppCompatActivity {

    // Declare the UI components
    private ListView TaoTeChingListView;

    // Declare an array to store data to fill the list
    private String [] TaoTeChingArray;

    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tao);


        // Initialize the UI components
        TaoTeChingListView = (ListView) findViewById(R.id.TaoTeChingListView);
        res = getResources();
        TaoTeChingArray = res.getStringArray(R.array.tao_te_ching);

        TaoTeChingListView.setAdapter(new CircularArrayAdapter<String>(this, android.R.layout.simple_list_item_1, TaoTeChingArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView textView = (TextView) super.getView(position, convertView, parent);

                textView.setTextColor(Color.WHITE);
                textView.setBackgroundColor(Color.BLACK);
                textView.setPadding(20, 30, 20, 30);
                textView.setTypeface(Typeface.SANS_SERIF);
                textView.setGravity(Gravity.FILL_HORIZONTAL);
                return textView;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tao, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
