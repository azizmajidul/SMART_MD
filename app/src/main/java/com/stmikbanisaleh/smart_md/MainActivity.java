package com.stmikbanisaleh.smart_md;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.stmikbanisaleh.smart_md.Ui.StoreList;
import com.stmikbanisaleh.smart_md.Ui.Store_visit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView audit_card, profil_card, schedule_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find card by id
        audit_card = (CardView) findViewById(R.id.audit_card);
//        dashborad_card = (CardView) findViewById(R.id.dashborad_card);
        profil_card = (CardView) findViewById(R.id.profil_card);
        schedule_card = (CardView) findViewById(R.id.schedule_card);

        //add on click
        audit_card.setOnClickListener(this);
//        dashborad_card.setOnClickListener(this);
        profil_card.setOnClickListener(this);
        schedule_card.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        Intent i;
        switch (v.getId()){
            case R.id.audit_card : i = new Intent(this, StoreList.class);startActivity(i); break;
            case R.id.profil_card : i = new Intent(this, profil.class); startActivity(i);break;
            case R.id.schedule_card : i = new Intent(this, Store_visit.class); startActivity(i);break;
            default:break;

        }


    }
}