package com.example.tiki;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TopFragment extends Fragment {
    int quatity=0;

    sendData sendingData;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";


    // TODO: Rename and change types of parameters
    private String mParam1;


    public TopFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        sendingData=(sendData)context;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.

     * @return A new instance of fragment TopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TopFragment newInstance(String param1) {
        TopFragment fragment = new TopFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_top, container, false);

        TextView txtview= view.findViewById(R.id.tvQualifyAbove);

        ImageButton imgbtnadd= view.findViewById(R.id.imgBtnAdd);
        ImageButton imgbtnminus= view.findViewById(R.id.imgBtnMinus);

        imgbtnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quatity>=50){
                    quatity=50;
                }else{
                    quatity++;
                }
                txtview.setText(String.valueOf(quatity));
                sendingData.sendData(String.valueOf(quatity));

            }
        });

        imgbtnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quatity<=0){
                    quatity=0;
                }else{
                    quatity--;
                }
                txtview.setText(String.valueOf(quatity));
                sendingData.sendData(String.valueOf(quatity));

            }
        });

        return view;
    }
}