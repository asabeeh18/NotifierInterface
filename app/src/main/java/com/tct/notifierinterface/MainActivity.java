package com.tct.notifierinterface;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    TextView sendingText;
    Button sendingButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendRequest(View view)
    {
       // Log.d("stat","IN");
        new Sender(this).execute("");

    }
    public void SendText(View view)
    {
        sendingText = (TextView)findViewById(R.id.text);
        sendingText.setVisibility(View.VISIBLE);
        sendingButton=(Button)findViewById(R.id.sendingButton);
        sendingButton.setVisibility(View.VISIBLE);
    }

    public void Send(View view)
    {
        String txt=sendingText.getText().toString();
        new Sender(this).execute(txt);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
