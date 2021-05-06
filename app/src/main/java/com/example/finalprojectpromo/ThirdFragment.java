package com.example.finalprojectpromo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;


public class ThirdFragment extends Fragment {

    private Button bnt1;
    private Button bnt2;
    private Button bnt3;
    private Button bnt4;

    private TextView txtName;

    String[] urls= new String[4];

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_third, container, false);
        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        txtName.setText(GlobalVar.currentUser.getName());

        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Website URLS
        urls[0]="https://www.fmuniv.edu/";
        urls[1]="https://selfservice.fmuniv.edu/SelfService9/Grades/GradeReport";
        urls[2]="https://selfservice.fmuniv.edu/SelfService9/Registration/Schedule";
        urls[3]="https://www.fmuniv.edu/registrars-office/";

        //edit button 1 of Profile
        bnt1 = (Button) getActivity().findViewById(R.id.bnt1);
        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[0]);
                getActivity().startActivity(intent);
            }
        });


        //edit button 2 of Profile
        bnt2 = (Button) getActivity().findViewById(R.id.bnt2);
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[1]);
                getActivity().startActivity(intent);
            }
        });


        //edit button 3 of Profile
        bnt3 = (Button) getActivity().findViewById(R.id.bnt3);
        bnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[2]);
                getActivity().startActivity(intent);

            }
        });


        //edit button 4 of Profile
        bnt4 = (Button) getActivity().findViewById(R.id.bnt4);
        bnt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[3]);
                getActivity().startActivity(intent);
            }
        });

    }
}