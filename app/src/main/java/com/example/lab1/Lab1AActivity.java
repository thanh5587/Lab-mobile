package com.example.lab1;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lab1AActivity extends AppCompatActivity {

    private LinearLayout llNameContainer, llAddressContainer, llParentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Bài 1A - LinearLayout (Code)");

        createNameContainer();
        createAddressContainer();
        createParentContainer();

        setContentView(llParentContainer);
    }

    private void createNameContainer() {
        llNameContainer = new LinearLayout(this);
        llNameContainer.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        llNameContainer.setOrientation(LinearLayout.HORIZONTAL);

        TextView tvName = new TextView(this);
        tvName.setText("Name: ");
        llNameContainer.addView(tvName);

        TextView tvNameValue = new TextView(this);
        tvNameValue.setText("John Doe");
        llNameContainer.addView(tvNameValue);
    }

    private void createAddressContainer() {
        llAddressContainer = new LinearLayout(this);
        llAddressContainer.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        llAddressContainer.setOrientation(LinearLayout.HORIZONTAL);

        TextView tvAddress = new TextView(this);
        tvAddress.setText("Address: ");
        llAddressContainer.addView(tvAddress);

        TextView tvAddressValue = new TextView(this);
        tvAddressValue.setText("911 Hollywood Blvd");
        llAddressContainer.addView(tvAddressValue);
    }

    private void createParentContainer() {
        llParentContainer = new LinearLayout(this);
        llParentContainer.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        llParentContainer.setOrientation(LinearLayout.VERTICAL);
        llParentContainer.setPadding(20, 20, 20, 20);

        llParentContainer.addView(llNameContainer);
        llParentContainer.addView(llAddressContainer);
    }
}
