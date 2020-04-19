package com.example.mytestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    Button btnSubmit;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life cycle event", "In onCreate()");

        etID = findViewById(R.id.etID);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResults = findViewById(R.id.tvResults);

        tvResults.setVisibility(View.INVISIBLE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idNumber = etID.getText().toString().trim();

                String dob = idNumber.substring(0,6);

                int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));

                String sGender;

                if (gender < 5)
                    sGender = getString(R.string.female);
                else
                    sGender = getString(R.string.male);

                int nationality = Integer.parseInt(Character.toString(idNumber.charAt(10)));

                String sNationality;

                if (nationality == 0)
                    sNationality = getString(R.string.saCitizen);
                else
                    sNationality = getString(R.string.permanentCitizen);

                String text = getString(R.string.dob) + dob + getString(R.string.newLine) +
                        getString(R.string.sGender) + sGender + getString(R.string.newLine) +
                        getString(R.string.sNationality) + sNationality;

                tvResults.setText(text);
                tvResults.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle event", "In onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle event", "In onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle event", "In onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle event", "In onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle event", "In onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle event", "In onRestart()");
    }
}
