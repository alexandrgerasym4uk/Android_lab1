package com.example.lab1;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.graphics.Typeface;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextInput = findViewById(R.id.text_edit);
        Button buttonOk = findViewById(R.id.button_ok);
        Button buttonClear = findViewById(R.id.button_cancel);
        TextView textViewOutput = findViewById(R.id.text_view);
        RadioGroup radioGroupFonts = findViewById(R.id.radioGroup_fonts);

        buttonOk.setOnClickListener(v -> {
            String inputText = editTextInput.getText().toString();
            textViewOutput.setText(inputText);

            int selectedFontId = radioGroupFonts.getCheckedRadioButtonId();
            if (selectedFontId == R.id.rb_normal) {
                textViewOutput.setTypeface(null, Typeface.NORMAL);
            } else if (selectedFontId == R.id.rb_bold) {
                textViewOutput.setTypeface(null, Typeface.BOLD);
            } else if (selectedFontId == R.id.rb_italic) {
                textViewOutput.setTypeface(null, Typeface.ITALIC);
            }
        });
        
        buttonClear.setOnClickListener(v -> textViewOutput.setText(""));
    }
}