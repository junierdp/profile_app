package com.junierdp.profileapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    TextView usernameTextView;
    TextView passwordTextView;
    Button loginButton;

    List<Profile> profiles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.usernameTextView = findViewById(R.id.userNameTextView);
        this.passwordTextView = findViewById(R.id.passwordTextView);

        this.loginButton = findViewById(R.id.loginButton);
        this.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateForm()) {
                    Profile profileLogged = null;
                    for (Profile profile : profiles) {
                        String _username = usernameTextView.getText().toString();
                        String _password = passwordTextView.getText().toString();

                        if (profile.getUsername().equals(_username) && profile.getPassword().equals(_password)) {
                            profileLogged = profile;
                            break;
                        }
                    }
                    if (profileLogged != null) {
                        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                        intent.putExtra("PROFILE", profileLogged);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "User not registered.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Please enter your user name and password.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        this.profiles.add(
                new Profile(
                        R.drawable.junier,
                        "Junier Oniel",
                        "Damian Pimentel",
                        "junierdp",
                        "123456",
                        "Software Engineering",
                        R.drawable.intec,
                        "2017",
                        R.drawable.logo_mbg,
                        "Senior Mobile Developer",
                        "2018",
                        19,
                        1,
                        5,
                        "https://github.com/junierdp"
                )
        );
        this.profiles.add(
                new Profile(
                        R.drawable.junier,
                        "Oniel",
                        "Damian",
                        "onieldp",
                        "123456",
                        "Software Development Technologist",
                        R.drawable.itla,
                        "2014-2016",
                        R.drawable.logo_mbg,
                        "Web & Mobile Developer",
                        "2016-2018",
                        19,
                        1,
                        5,
                        "https://github.com/junierdp"
                )
        );
    }

    private Boolean validateForm() {
        Log.d("Username", this.usernameTextView.getText().toString());
        Log.d("Password", this.passwordTextView.getText().toString());
        if (this.usernameTextView.getText().toString().equals("") || this.passwordTextView.getText().toString().equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
