package com.mejbahuddin.quransharif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<SetsModel>list;
    SetsAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recyclerView);

        list = new ArrayList<>();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        list.add(new SetsModel("Para-1 آلم"));
        list.add(new SetsModel("Para-2 سيقول السفهاء"));
        list.add(new SetsModel("Para-3 تلك الرسل"));
        list.add(new SetsModel("Para-4 لن تنالوا"));
        list.add(new SetsModel("Para-5 والمحصنات"));
        list.add(new SetsModel("Para-6 لا يحب الله"));
        list.add(new SetsModel("Para-7 وإذا سمعوا"));
        list.add(new SetsModel("Para-8 ولو أننا"));
        list.add(new SetsModel("Para-9 قال الملأ"));
        list.add(new SetsModel("Para-10 واعلموا"));
        list.add(new SetsModel("Para-11 يعتذرون"));
        list.add(new SetsModel("Para-12 ومامن دابة"));
        list.add(new SetsModel("Para-13 وما أبرئ"));
        list.add(new SetsModel("Para-14 ربما"));
        list.add(new SetsModel("Para-15 سبحٰن الذیٓ"));
        list.add(new SetsModel("Para-16 قال ألم"));
        list.add(new SetsModel("Para-17 اقترب للناس"));
        list.add(new SetsModel("Para-18 قد أفلح"));
        list.add(new SetsModel("Para-19 وقال الذين"));
        list.add(new SetsModel("Para-20 امن خلق"));
        list.add(new SetsModel("Para-21 اتل مآ اوحی"));
        list.add(new SetsModel("Para-22 ومن يقنت"));
        list.add(new SetsModel("Para-23 ومالی"));
        list.add(new SetsModel("Para-24 فمن أظلم"));
        list.add(new SetsModel("Para-25 إليه يرد"));
        list.add(new SetsModel("Para-26 حـم"));
        list.add(new SetsModel("Para-27 قال فما خطبكم"));
        list.add(new SetsModel("Para-28 قد سمع"));
        list.add(new SetsModel("Para-29 تبٰرک الذی"));
        list.add(new SetsModel("Para-30 عمّ"));
        list.add(new SetsModel("Para-31 عمّ"));
        list.add(new SetsModel("Para-32 عمّ"));
        list.add(new SetsModel("Para-33 عمّ"));

        adapter = new SetsAdapter(list,this);
        recyclerView.setAdapter(adapter);

    }
}