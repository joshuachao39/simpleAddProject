package tests;

import android.test.ActivityInstrumentationTestCase2;

import com.example.joshuachao.lab3exercise.MainActivity;

/**
 * Created by joshuachao on 4/13/16.
 */
public class testSum extends  ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;

    public testSum() {
        super(MainActivity.class);
    }

    public void test_sum() {
        mainActivity = getActivity();
        assertEquals(mainActivity.sum(1, 1), 2);
    }

}
