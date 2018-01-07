package com.example.death.innovaday3;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Alert extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alert= new AlertDialog.Builder(Alert.this);
                String str = editText.getText().toString();
                if (str.length()!=5)
                {
                    alert.setMessage("wrong");
                }
                else
                {
                    alert.setMessage(str);
                }

                alert.create();
                alert.show();

            }
        });

    }
}
