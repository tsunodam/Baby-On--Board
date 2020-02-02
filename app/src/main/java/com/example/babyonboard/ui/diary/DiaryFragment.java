package com.example.babyonboard.ui.diary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.babyonboard.R;

public class DiaryFragment extends Fragment {

    private DiaryViewModel diaryViewModel;

    //private array

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        diaryViewModel =
                ViewModelProviders.of(this).get(DiaryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_diary, container, false);
        final CalendarView calendarView = root.findViewById(R.id.calendarView);

        // function for add to calendar
            // add to array
        // funtion for view
            // read array

        return root;
    }
}