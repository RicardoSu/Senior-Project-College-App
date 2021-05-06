package com.example.finalprojectpromo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class SecondFragment extends Fragment {

    private Button bntmenu1;
    private Button bntmenu2;
    private Button bntmenu3;
    private Button bntmenu4;
    private Button bntmenu5;
    private Button bntmenu6;

    String[] urls= new String[6];

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        // Website URLS
        urls[0]="https://www.fmuniv.edu/";
        urls[1]="https://fmufs.fmuniv.edu/adfs/ls/?client-request-id=bba3c1a9-039f-4c56-8b37-601505499ab0&wa=wsignin1.0&wtrealm=urn%3afederation%3aMicrosoftOnline&wctx=LoginOptions%3D3%26estsredirect%3d2%26estsrequest%3drQIIAeNisNLJKCkpKLbS1y_ILypJzNHLzUwuyi_OTyvJz8vJzEvVS87P1csvSs9MAbGKhLgEVh5cvHs-c5hPt3mCKKvnrA2rGJUJG6F_gZHxBSPjLSZB_6J0z5TwYrfUlNSixJLM_LxHzMJFxaWJBkaG5g5puaV5mWV6qSmlF1gEXrHwGDBbcXBwCTBIMCgw_GBhXMQKtD84fd0ipokzXWZ82z__8RQOhlOs-vnFHm6h3s7hppFlZvq-Po4m3n7JuVn67k6luSWVmQYF-pZOHmGmnh7m2Ra2ZlaGE9iEJrAxnWJj-MDG2MHOMIud4QAn4y0uESOgG3QNjHUNDRUMzKxMLKwMLaIO8DIAAA2&cbcxt=&username=rsua0217%40fmuniv.edu&mkt=&lc=";
        urls[2]="https://selfservice.fmuniv.edu/SelfService9/Home/LogIn?ReturnUrl=%2FSelfService9%2F";
        urls[3]="https://ecampus.fmuniv.edu/";
        urls[4]="https://www.fmuniv.edu/campus-directory/";
        urls[5]="https://www.fmuniv.edu/fmu-cyberzone/schedule-online/";



        //edit button 1 of Profile
        bntmenu1 = (Button) getActivity().findViewById(R.id.bntmenu1);
        bntmenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[0]);
                getActivity().startActivity(intent);
            }
        });

        //edit button 2 of Profile
        bntmenu2 = (Button) getActivity().findViewById(R.id.bntmenu2);
        bntmenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[1]);
                getActivity().startActivity(intent);
            }
        });

        //edit button 3 of Profile
        bntmenu3 = (Button) getActivity().findViewById(R.id.bntmenu3);
        bntmenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[2]);
                getActivity().startActivity(intent);
            }
        });

        //edit button 4 of Profile
        bntmenu4 = (Button) getActivity().findViewById(R.id.bntmenu4);
        bntmenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[3]);
                getActivity().startActivity(intent);
            }
        });

        //edit button 5 of Profile
        bntmenu5 = (Button) getActivity().findViewById(R.id.bntmenu5);
        bntmenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[4]);
                getActivity().startActivity(intent);
            }
        });

        //edit button 6  of Profile
        bntmenu6 = (Button) getActivity().findViewById(R.id.bntmenu6);
        bntmenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[5]);
                getActivity().startActivity(intent);
            }
        });



    }

}

