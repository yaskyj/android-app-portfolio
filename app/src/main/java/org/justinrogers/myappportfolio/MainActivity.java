package org.justinrogers.myappportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final String LOG_TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.spotifyButton)
    Button spotifyButton;
    @Bind(R.id.scoresButton)
    Button scoresButton;
    @Bind(R.id.libraryButton)
    Button libraryButton;
    @Bind(R.id.buildItButton)
    Button buildItButton;
    @Bind(R.id.xyzButton)
    Button xyzButton;
    @Bind(R.id.capstoneButton)
    Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        spotifyButton.setOnClickListener(this);
        scoresButton.setOnClickListener(this);
        libraryButton.setOnClickListener(this);
        buildItButton.setOnClickListener(this);
        xyzButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);

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

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.spotifyButton:
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("org.justinrogers.spotifystreamer");
                startActivity(launchIntent);
                break;
            case R.id.scoresButton:
                createToast(view);
                break;
            case R.id.libraryButton:
                createToast(view);
                break;
            case R.id.buildItButton:
                createToast(view);
                break;
            case R.id.xyzButton:
                createToast(view);
                break;
            case R.id.capstoneButton:
                createToast(view);
                break;
            default:
                break;
        }
    }
    public void createToast(View view) {
        Button b = (Button)view;
        String buttonText = b.getText().toString();

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + buttonText;
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

}
