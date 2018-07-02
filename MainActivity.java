package com.example.android.naturequizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score;
    {
        score = 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when Question one is answered
     *
     * @param view onRadioButtonClick
     */
    public void onRadioButtonQues1Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ques1_radio_button1:
                if (checked)
                    score = score;
                break;
            case R.id.ques1_radio_button2:
                if (checked)
                    score = score;
                break;
            case R.id.ques1_radio_button3:
                if (checked)
                    score = score;
                break;
            case R.id.ques1_radio_button4:
                if (checked)
                    score = score + 10;
                break;
        }
    }

    /**
     * This method is called when Question two is answered
     *
     * @param view onRadioButtonClick
     */
    public void onRadioButtonQues2Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ques2_radio_button1:
                if (checked)
                    score = score;
                break;
            case R.id.ques2_radio_button2:
                if (checked)
                    score = score;
                break;
            case R.id.ques2_radio_button3:
                if (checked)
                    score = score;
                break;
            case R.id.ques2_radio_button4:
                if (checked)
                    score = score + 10;
                break;
        }
    }
    /**
     * This method is called when Question Three is answered
     *
     * @param view onRadioButtonClick
     */
    public void onRadioButtonQues3Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ques3_radio_button1:
                if (checked)
                    score = score;
                break;
            case R.id.ques3_radio_button2:
                if (checked)
                    score = score;
                break;
            case R.id.ques3_radio_button3:
                if (checked)
                    score = score + 10;
                break;
            case R.id.ques3_radio_button4:
                if (checked)
                    score = score;
                break;
        }
    }
    /**
     * This method is called when Question Four is answered
     *
     * @param view onRadioButtonClick
     */
    public void onRadioButtonQues4Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ques4_radio_button1:
                if (checked)
                    score = score + 10;
                break;
            case R.id.ques4_radio_button2:
                if (checked)
                    score = score;
                break;
            case R.id.ques4_radio_button3:
                if (checked)
                    score = score;
                break;
            case R.id.ques4_radio_button4:
                if (checked)
                    score = score;
                break;
        }
    }
    /**
     * This method is called when Question Five is answered
     *
     * @param view onRadioButtonClick
     */
    public void onRadioButtonQues5Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ques5_radio_button1:
                if (checked)
                    score = score;
                break;
            case R.id.ques5_radio_button2:
                if (checked)
                    score = score + 10;
                break;
            case R.id.ques5_radio_button3:
                if (checked)
                    score = score;
                break;
            case R.id.ques5_radio_button4:
                if (checked)
                    score = score;
                break;
        }
    }
    /**
     * This method is called when Question Six is answered
     *
     * @param view onRadioButtonClick
     */
    public void onRadioButtonQues6Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ques6_radio_button1:
                if (checked)
                    score = score + 10;
                break;
            case R.id.ques6_radio_button2:
                if (checked)
                    score = score;
                break;
            case R.id.ques6_radio_button3:
                if (checked)
                    score = score;
                break;
            case R.id.ques6_radio_button4:
                if (checked)
                    score = score;
                break;
        }
    }
    /**
     * This method is called when Question Seven is answered
     *
     * @param view onRadioButtonClick
     */
    public void onRadioButtonQues7Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ques7_radio_button1:
                if (checked)
                    score = score;
                break;
            case R.id.ques7_radio_button2:
                if (checked)
                    score = score;
                break;
            case R.id.ques7_radio_button3:
                if (checked)
                    score = score + 10;
                break;
            case R.id.ques7_radio_button4:
                if (checked)
                    score = score;
                break;
        }
    }
    /**
     * This method is called when Question 9 is answered
     *
     * @param view onCheckboxClick
     */
    public void onCheckboxQues9Clicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.ques9_checkbox1:
                if (checked)
                    score = score;
                else
                    score = score;
                break;
            case R.id.ques9_checkbox2:
                if (checked)
                    score = score + 5;
                else
                    score = score;
                break;
            case R.id.ques9_checkbox3:
                if (checked)
                    score = score + 5;
                else
                    score = score;
                break;
            case R.id.ques9_checkbox4:
                if (checked)
                    score = score;
                else
                    score = score;
                break;
        }
    }
    /**
     * This method is called when Question 10 is answered
     *
     * @param view onCheckboxClick
     */
    public void onCheckboxQues10Clicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.ques10_checkbox1:
                if (checked)
                    score = score + 5;
                else
                    score = score;
                break;
            case R.id.ques10_checkbox2:
                if (checked)
                    score = score;
                else
                    score = score;
                break;
            case R.id.ques10_checkbox3:
                if (checked)
                    score = score;
                else
                    score = score;
                break;
            case R.id.ques10_checkbox4:
                if (checked)
                    score = score + 5;
                else
                    score = score;
                break;
        }
    }
    /**
     * This method is called when the Submit button is clicked.
     */
    public void submitButton(View view) {
        /**
         * Edit text view to capture the name of the App User
         */
        EditText nameOfUser = (EditText) findViewById(R.id.name_edit_view);
        String nameOfUserEntered = nameOfUser.getText().toString();
        /**
         * Edit View to capture the input at question 8
         */
        EditText ques8Answer = (EditText) findViewById(R.id.ques8_edit_view);
        String ques8Answered = ques8Answer.getText().toString();
        if (ques8Answered.equals(getString(R.string.peacock))) {
            score = score + 10;
        } else {
            score = score;
        }
        /**
         * Conditional statements for toast display
         */
        if (score < 50) {
            Toast.makeText(this, getString(R.string.sorry) + nameOfUserEntered + getString(R.string.score1) + score + getString(R.string.percentage), Toast.LENGTH_LONG).show();
        } else if (score < 70) {
            Toast.makeText(this, getString(R.string.you_did_great) + nameOfUserEntered + getString(R.string.score2) + score + getString(R.string.percentage), Toast.LENGTH_LONG).show();
        } else if (score >= 70) {
            Toast.makeText(this, getString(R.string.congratulations) + nameOfUserEntered + getString(R.string.score3) + score + getString(R.string.percentage), Toast.LENGTH_LONG).show();
        }
    }
    /**
     * This method restarts or "reset" the App.
     */
    public void resetButton(View view) {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}

