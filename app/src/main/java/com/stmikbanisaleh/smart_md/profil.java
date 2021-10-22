package com.stmikbanisaleh.smart_md;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.stmikbanisaleh.smart_md.Model_Ok.Login.PreferenceManager;
import com.stmikbanisaleh.smart_md.Model_Ok.Login.ResponLogin;
import com.stmikbanisaleh.smart_md.Model_Ok.Login2.Common.UserPreferense;
import com.stmikbanisaleh.smart_md.Model_Ok.Login2.Entity.User;
import com.stmikbanisaleh.smart_md.Model_Ok.Login2.Entity.UserRespon;
import com.stmikbanisaleh.smart_md.remote_access.API;
import com.stmikbanisaleh.smart_md.remote_access.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class profil extends AppCompatActivity {

    private profil Context;

    private Button logout;
    private ResponLogin login;
    private PreferenceManager preferenceManager;
    private RetrofitClient retrofitClient;
    private  UserPreferense userPreferense;

    private TextView
            profilName,
            profilEmail,
            profilAddress,
            profilRole;

    private String name;
    private String email;
    private String address;
    private String role;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        preferenceManager = new PreferenceManager(this);

        logout = findViewById(R.id.logout);
        profilName = findViewById(R.id.profil_name);
        profilAddress = findViewById(R.id.profil_email);
        profilEmail = findViewById(R.id.profil_email);
        profilRole = findViewById(R.id.profil_role);
        profilEmail.setText(preferenceManager.getEmail());

        login = new ResponLogin();
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();

            }

        });
//        loadUser();



    }

    private  void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Are You Sure?")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {dialog.dismiss();

                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Intent intent = new Intent(profil.this, Login.class);
                        startActivity(intent);





                    }
                });
        AlertDialog dialog= builder.create();
        dialog.show();

    }


    private void loadUser(){
        API api =retrofitClient.getApi();

        UserPreferense.getUserId(profil.this);
        Call<UserRespon> call = api.getUser("authorization", "id");
        call.enqueue(new Callback<UserRespon>() {
            @Override
            public void onResponse(Call<UserRespon> call, Response<UserRespon> response) {
                User user = response.body().getData();

                name = user.getName();
                email = user.getEmail();
                address = user.getAddress();
                role = user.getRole();

                profilName.setText(name);
                profilEmail.setText(email);
                profilAddress.setText(address);
                profilRole.setText(role);

            }

            @Override
            public void onFailure(Call<UserRespon> call, Throwable t) {

                Toast.makeText(profil.this, "Gagal ambil data", Toast.LENGTH_SHORT).show();

            }
        });


    }
}