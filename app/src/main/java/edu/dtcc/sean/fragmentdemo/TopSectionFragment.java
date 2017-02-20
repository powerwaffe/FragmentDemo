package edu.dtcc.sean.fragmentdemo;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by Sean on 2/20/2017.
 */

public class TopSectionFragment extends Fragment
{
    private static EditText etTopinput;
    private static EditText etBottomInput;

    TopSectionListener activityCommander;

    public interface TopSectionListener
    {
        public void createPicture(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try
        {
            activityCommander = (TopSectionListener) activity;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        etTopinput = (EditText) view.findViewById(R.id.etTopInput);
        etBottomInput = (EditText) view.findViewById(R.id.etBottomInput);
        final Button btnGeneratePicture = (Button) view.findViewById(R.id.btnGeneratePicture);

        btnGeneratePicture.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }

    // Gets called when the button is clicked
    public void buttonClicked(View view)
    {
        activityCommander.createPicture(etTopinput.getText().toString(),
                etBottomInput.getText().toString());
    }
}
