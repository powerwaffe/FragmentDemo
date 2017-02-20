package edu.dtcc.sean.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Sean on 2/20/2017.
 */

public class BottomPictureFragment extends android.support.v4.app.Fragment
{
    private static TextView etTopPictureText;
    private static TextView etBottomPictureText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        etTopPictureText = (TextView) view.findViewById(R.id.etTopPictureText);
        etBottomPictureText = (TextView) view.findViewById(R.id.etBottomPictureText);
        return view;
    }

    public void setPictureText(String top, String bottom)
    {
        etTopPictureText.setText(top);
        etBottomPictureText.setText(bottom);
    }
}
