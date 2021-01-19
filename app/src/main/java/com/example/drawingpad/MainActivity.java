package com.example.drawingpad;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button subBtn=(Button) findViewById(R.id.button2);
        Button subBtn1=(Button) findViewById(R.id.button3);
        Button subBtn2=(Button) findViewById(R.id.button4);
        Button subBtn3=(Button) findViewById(R.id.button6);
        Button subBtn4=(Button) findViewById(R.id.button5);
        EditText number1=(EditText) findViewById(R.id.editTextNumber);
        EditText number2=(EditText) findViewById(R.id.editTextNumber2);
        EditText result1=(EditText) findViewById(R.id.textView2);
        EditText result2=(EditText) findViewById(R.id.textView3);
        EditText result3=(EditText) findViewById(R.id.textView4);
        EditText result4=(EditText) findViewById(R.id.textView5);



            subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=Integer.parseInt(number1.getText().toString())+
                        Integer.parseInt(number2.getText().toString());
                result1.setText(Integer.toString(sum));
                Toast.makeText(getBaseContext(),"덧셈 결과",Toast.LENGTH_SHORT).show();
            }
        });
            subBtn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int sub=Integer.parseInt(number1.getText().toString())-
                            Integer.parseInt(number2.getText().toString());
                    result2.setText(Integer.toString(sub));
                    Toast.makeText(getBaseContext(),"뺄셈 결과",Toast.LENGTH_SHORT).show();
                }
            });

            subBtn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int mul=Integer.parseInt(number1.getText().toString())*
                            Integer.parseInt(number2.getText().toString());
                    result3.setText(Integer.toString(mul));
                    Toast.makeText(getBaseContext(),"곱셈 결과",Toast.LENGTH_SHORT).show();
                }
            });


            subBtn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int div=Integer.parseInt(number1.getText().toString())/
                            Integer.parseInt(number2.getText().toString());
                    result4.setText(Integer.toString(div));
                    Toast.makeText(getBaseContext(),"나눗셈 결과",Toast.LENGTH_SHORT).show();
                }
            });

            subBtn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("리셋");
                    builder.setMessage("숫자를 리셋하시겠습니까?");
                    builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    number1.setText(null);
                                    number2.setText(null);
                                    result1.setText(null);
                                    result3.setText(null);
                                    result2.setText(null);
                                    result4.setText(null);
                                }
                            });
                            builder.setNegativeButton("아니오", null);
                    builder.create().show();
                }
            });

}
}