package com.tutsplus.code.android.droidintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_show);

    Bundle extras = getIntent().getExtras();
    String inputFirstName = extras.getString("firstNameString");
    String inputLastName = extras.getString("lastNameString");

    TextView showFirstName = (TextView) findViewById(R.id.show_first_name);
    TextView showLastName = (TextView) findViewById(R.id.show_last_name);

    showFirstName.setText(inputFirstName);
    showLastName.setText(inputLastName);
  }
}
