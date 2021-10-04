package fr.isep.assignment1b;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    /**
     * This is the entry point to the activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is referred to in the layout.
     * Called when .. button is clicked.
     * @param v a view, the button.
     */
    public void buttonIsClicked(View v){
        Log.d("A1","buttonIsClicked start"); // Adding some log for the logcat
        EditText editText = findViewById(R.id.et );   // getting reference of java object created from xml layout
        String t = editText.getText().toString();     // getting its content as a String
        TextView tv = findViewById(R.id.tv);          // getting reference of java object created from xml layout
        tv.setText( t );                              // setting text

        Log.d("A1","buttonIsClicked stops");// Adding some log for the logcat
    }
}