package com.example.babyonboard;

import androidx.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CareFragment1 extends Fragment {
//    Button button3 = (Button) findViewById(R.id.button3);
//    button3.setOnClickListener

    private CareFragment1ViewModel mViewModel;

    public static CareFragment1 newInstance() {
        return new CareFragment1();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_care, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CareFragment1ViewModel.class);
        // TODO: Use the ViewModel
    }

}
