package tests;

import android.test.ActivityInstrumentationTestCase2;
import com.example.sharmaine.lab3.MainActivity;
import com.example.sharmaine.lab3.R;

/**
 * Created by sharmaine on 4/15/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.textView1);
        
        String tester = textView.getText().toString();
        assertEquals("Bye World", tester);
    }

}

