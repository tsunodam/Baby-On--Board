package com.example.babyonboard.ui.diary;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.babyonboard.R;

import java.util.List;
import java.util.ListIterator;


public class DiaryFragment extends Fragment {

    private DiaryViewModel diaryViewModel;

    //private array

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        diaryViewModel =
                ViewModelProviders.of(this).get(DiaryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_diary, container, false);
        final CalendarView calendarView = root.findViewById(R.id.calendarView);


        Button btn_add = root.findViewById(R.id.buttonAdd);

        CalendarView cln = root.findViewById(R.id.calendarView);

        // Array with date and symptoms, first element is date and second element is symptoms
        final String[] calendarData = new String[2];
        final String[] showData = new String[2];

        cln.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                calendarData[0] = month + "/" + dayOfMonth + "/" + year ;

            }
        });

        EditText symptoms = root.findViewById(R.id.symptoms);



        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String confirmation = "Added Symptoms for " + calendarData[0];
                Toast.makeText(getActivity(), confirmation, Toast.LENGTH_SHORT).show();
                showData[0] = calendarData[0];
                calendarData[0] = "";

            }

        });


        Button btn_view = root.findViewById(R.id.buttonView);

        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendarData[1] = symptoms.getText().toString();
                showData[1] = calendarData[1];
                calendarData[1] = "";
                String data = "Symptoms for " + showData[0] + " are: " + "\n" + showData[1];
                Toast.makeText(getActivity(), data, Toast.LENGTH_LONG).show();
            }
        });

        return root;
    }
}