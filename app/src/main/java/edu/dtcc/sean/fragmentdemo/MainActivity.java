package edu.dtcc.sean.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This gets called by the Top Fragment when the user clicks the button
    @Override
    public void createPicture(String top, String bottom)
    {
       BottomPictureFragment bottomFragment = (BottomPictureFragment)
               getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setPictureText(top, bottom);
    }
}
