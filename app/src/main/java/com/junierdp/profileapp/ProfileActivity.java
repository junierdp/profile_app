package com.junierdp.profileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    ImageView profileImage;
    TextView name;
    TextView jobTitle;
    ImageView careerImage;
    TextView careerTitle;
    TextView careerYear;
    ImageView jobImage;
    TextView jobPosition;
    TextView jobYear;
    TextView repositoryNum;
    TextView starNum;
    TextView followersNum;

    Button shareButton;

    Profile profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        this.profileImage = findViewById(R.id.profileImageView);
        this.name = findViewById(R.id.nameTextView);
        this.jobTitle = findViewById(R.id.jobTitleTextView);
        this.careerImage = findViewById(R.id.careerImageView);
        this.careerTitle = findViewById(R.id.careerTextView);
        this.careerYear = findViewById(R.id.careerYearTextView);
        this.jobImage = findViewById(R.id.jobImageView);
        this.jobPosition = findViewById(R.id.jobTextView);
        this.jobYear = findViewById(R.id.jobYearTexView);
        this.repositoryNum = findViewById(R.id.repositoryNumTextView);
        this.starNum = findViewById(R.id.starNumTextView);
        this.followersNum = findViewById(R.id.followerNumTextView);
        this.shareButton = findViewById(R.id.shareProfileButton);

        if (getIntent().hasExtra("PROFILE")) {
            this.profile = (Profile) getIntent().getSerializableExtra("PROFILE");
            this.setUpViewData();
        }

        this.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent();

                String textToShare = profile.getFirstName() + " " + profile.getLastName() + "\n" + profile.getJobTitle() + "\n" + "GitHub: " + profile.getGitHubLink();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, textToShare);
                shareIntent.setType("text/plain");

                startActivity(shareIntent);
            }
        });
    }

    private void setUpViewData() {
        this.profileImage.setImageResource(this.profile.getProfileImage());
        this.name.setText(this.profile.getFirstName() + " " + this.profile.getLastName());
        this.jobTitle.setText(this.profile.getJobTitle());
        this.careerImage.setImageResource(this.profile.getUniversityImage());
        this.careerTitle.setText(this.profile.getCareer());
        this.careerYear.setText(this.profile.getUniversityYear());
        this.jobImage.setImageResource(this.profile.getJobImage());
        this.jobPosition.setText(this.profile.getJobTitle());
        this.jobYear.setText(this.profile.getJobYear());
        this.repositoryNum.setText(Integer.toString(this.profile.getGitHubRepositories()));
        this.starNum.setText(Integer.toString(this.profile.getGitHubStars()));
        this.followersNum.setText(Integer.toString(this.profile.getGitHubFollowers()));
    }
}
