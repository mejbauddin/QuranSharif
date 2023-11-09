package com.mejbahuddin.quransharif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewActivity extends AppCompatActivity {

    ImageView homeButton;
    PDFView pdfView;
    TextView para;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        getSupportActionBar().hide();

        pdfView = findViewById(R.id.pdfView);
        para = findViewById(R.id.para);
        homeButton = findViewById(R.id.homeButton);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(PdfViewActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });

        int pos = getIntent().getIntExtra("position",0);

        if (pos==0){
            pdfView.fromAsset("quranmajeed-(1).pdf").load();
            para.setText("Para-1 آلم");
        } else if (pos==1){
            pdfView.fromAsset("quranmajeed-(2).pdf").load();
            para.setText("Para-2 سيقول السفهاء");
        } else if (pos==2){
            pdfView.fromAsset("quranmajeed-(3).pdf").load();
            para.setText("Para-3 تلك الرسل");
        } else if (pos==3){
            pdfView.fromAsset("quranmajeed-(4).pdf").load();
            para.setText("Para-4 لن تنالوا");
        } else if (pos==4){
            pdfView.fromAsset("quranmajeed-(5).pdf").load();
            para.setText("Para-5 والمحصنات");
        } else if (pos==5){
            pdfView.fromAsset("quranmajeed-(6).pdf").load();
            para.setText("Para-6 لا يحب الله");
        }else if (pos==6){
            pdfView.fromAsset("quranmajeed-(7).pdf").load();
            para.setText("Para-7 وإذا سمعوا");
        } else if (pos==7){
            pdfView.fromAsset("quranmajeed-(8).pdf").load();
            para.setText("Para-8 ولو أننا");
        } else if (pos==8){
            pdfView.fromAsset("quranmajeed-(9).pdf").load();
            para.setText("Para-9 قال الملأ");
        } else if (pos==9){
            pdfView.fromAsset("quranmajeed-(10).pdf").load();
            para.setText("Para-10 واعلموا");
        } else if (pos==10){
            pdfView.fromAsset("quranmajeed-(11).pdf").load();
            para.setText("Para-11 يعتذرون");
        }else if (pos==11){
            pdfView.fromAsset("quranmajeed-(12).pdf").load();
            para.setText("Para-12 ومامن دابة");
        } else if (pos==12){
            pdfView.fromAsset("quranmajeed-(13).pdf").load();
            para.setText("Para-13 وما أبرئ");
        } else if (pos==13){
            pdfView.fromAsset("quranmajeed-(14).pdf").load();
            para.setText("Para-14 ربما");
        } else if (pos==14){
            pdfView.fromAsset("quranmajeed-(15).pdf").load();
            para.setText("Para-15 سبحٰن الذیٓ");
        } else if (pos==15){
            pdfView.fromAsset("quranmajeed-(16).pdf").load();
            para.setText("Para-16 قال ألم");
        }else if (pos==16){
            pdfView.fromAsset("quranmajeed-(17).pdf").load();
            para.setText("Para-17 اقترب للناس");
        } else if (pos==17){
            pdfView.fromAsset("quranmajeed-(18).pdf").load();
            para.setText("Para-18 قد أفلح");
        } else if (pos==18){
            pdfView.fromAsset("quranmajeed-(19).pdf").load();
            para.setText("Para-19 وقال الذين");
        } else if (pos==19){
            pdfView.fromAsset("quranmajeed-(20).pdf").load();
            para.setText("Para-20 امن خلق");
        } else if (pos==20){
            pdfView.fromAsset("quranmajeed-(21).pdf").load();
            para.setText("Para-21 اتل مآ اوحی");
        }else if (pos==21){
            pdfView.fromAsset("quranmajeed-(22).pdf").load();
            para.setText("Para-22 ومن يقنت");
        } else if (pos==22){
            pdfView.fromAsset("quranmajeed-(23).pdf").load();
            para.setText("Para-23 ومالی");
        } else if (pos==23){
            pdfView.fromAsset("quranmajeed-(24).pdf").load();
            para.setText("Para-24 فمن أظلم");
        } else if (pos==24){
            pdfView.fromAsset("quranmajeed-(25).pdf").load();
            para.setText("Para-25 إليه يرد");
        } else if (pos==25){
            pdfView.fromAsset("quranmajeed-(26).pdf").load();
            para.setText("Para-26 حـم");
        }else if (pos==26){
            pdfView.fromAsset("quranmajeed-(27).pdf").load();
            para.setText("Para-27 قال فما خطبكم");
        } else if (pos==27){
            pdfView.fromAsset("quranmajeed-(28).pdf").load();
            para.setText("Para-28 قد سمع");
        } else if (pos==28){
            pdfView.fromAsset("quranmajeed-(29).pdf").load();
            para.setText("Para-29 تبٰرک الذی");
        } else if (pos==29){
            pdfView.fromAsset("quranmajeed-(30).pdf").load();
            para.setText("Para-30 عمّ");
        } else if (pos==30){
            pdfView.fromAsset("quranmajeed-(30).pdf").load();
            para.setText("Para-30 عمّ");
        } else if (pos==31){
            pdfView.fromAsset("quranmajeed-(30).pdf").load();
            para.setText("Para-30 عمّ");
        } else if (pos==32){
            pdfView.fromAsset("quranmajeed-(30).pdf").load();
            para.setText("Para-30 عمّ");
        }
    }
}