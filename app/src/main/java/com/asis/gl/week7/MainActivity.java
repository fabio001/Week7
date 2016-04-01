package com.asis.gl.week7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText uName;
    private EditText passw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        uName = (EditText)findViewById(R.id.userName);
        passw = (EditText)findViewById(R.id.password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("btnbtn", "Onclik works");
                String usrStr = uName.getText().toString();
                String usrPass = passw.getText().toString();
                if (usrStr == "" || usrPass == "") {
                    //warn USer to enter a username
                } else if (usrStr.equals("admin") && usrPass.equals("admin")) {
                    // goto second Activity
                    Log.v("btnbtn", "User-Password is OK");
                    Intent intent = new Intent(MainActivity.this, RealMain.class);

                    //add extra info
                    intent.putExtra("uName",usrStr.toString());
                    Random rnd = new Random();
                    intent.putExtra("randomNumber",rnd.nextInt(100));
                    startActivity(intent);

                } else {
                    Log.v("btnbtn","Wrong access");
                }

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
