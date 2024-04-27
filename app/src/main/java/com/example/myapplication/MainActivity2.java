package com.example.myapplication;
import android.view.View;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText editText;
    private EditText editText2;
    public String[] arr=new String[2];
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView8);


    }


    public void goToActivity2(View view) {
        ((Button) view).setTextColor(Color.parseColor("#FFCCCCCC"));

        // Use a handler to revert the changes after 1 second (1000 milliseconds)
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ((Button) view).setTextColor(Color.parseColor("#FFFFFFFF"));
            }
        }, 100);
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("playerNames", arr);
        editText = findViewById(R.id.editTextText);
        String text = editText.getText().toString().trim();
        editText2 = findViewById(R.id.editTextText1);
        String text1 = editText2.getText().toString().trim();
        arr[0]=text;
        arr[1]=text1;
        if(TextUtils.isEmpty(text)||TextUtils.isEmpty(text1))
        {


            editText.setText("");
            editText.setHint("Maximum 8 characters");
            editText2.setText("");
            editText2.setHint("Maximum 8 characters");
            textView.setText("Fields should contain players name!");


        }
        else if(text.equals(text1))
        {
            textView.setText("Fields shouldn't contain same name!!");
        }
        else
        {
            textView.setText("");
            editText.setText("");
            editText2.setText("");
            startActivity(intent);

        }


    }
}