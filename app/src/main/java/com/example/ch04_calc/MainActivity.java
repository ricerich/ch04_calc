package com.example.ch04_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1단계: Java(뷰)객체를 만든다
        //2단계: xml뷰객체를 java뷰 객체에 바인딩한다(연결)
        //3단계: java뷰객체에 이벤트 처리(방법은 리스너 만들어 연결)
        
        //1단계: Java(뷰)객체를 만든다
        EditText edt1, edt2;
        Button btn1, btn2, btn3, btn4;
        TextView tv1;
        
        //2단계: xml뷰객체를 java뷰 객체에 바인딩한다(연결)
        edt1 = (EditText) findViewById(R.id.Edit1);
        edt2 = (EditText) findViewById(R.id.Edit2);

        btn1 = (Button) findViewById(R.id.BtnAdd);
        btn2 = (Button) findViewById(R.id.BtnSub);
        btn3 = (Button) findViewById(R.id.BtnMul);
        btn4 = (Button) findViewById(R.id.BtnDiv);

        tv1 = (TextView) findViewById(R.id.TextResult);

        //3단계: java뷰객체에 이벤트 처리(방법은 리스너객체 만들어 연결)

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1단계- EditText1과 EditText2에서 값을 가져옴
                //2단계-가져온 값을 더함
                // 형변환 필요 (①EditText객체->②String->③Int)
                //3단계-계산결과를 TextView에 출력함

                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                int n1 = Integer.parseInt(str1);
                int n2 = Integer.parseInt(str2);

                int nResult = n1 + n2;

                tv1.setText("계산결과:"+nResult);
            }
        });

        
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1단계- EditText1과 EditText2에서 값을 가져옴
                //2단계-가져온 값을 더함
                // 형변환 필요 (①EditText객체->②String->③Int)
                //3단계-계산결과를 TextView에 출력함

                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                int n1 = Integer.parseInt(str1);
                int n2 = Integer.parseInt(str2);

                int nResult = n1 - n2;

                tv1.setText("계산결과:"+nResult);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1단계- EditText1과 EditText2에서 값을 가져옴
                //2단계-가져온 값을 더함
                // 형변환 필요 (①EditText객체->②String->③Int)
                //3단계-계산결과를 TextView에 출력함

                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                int n1 = Integer.parseInt(str1);
                int n2 = Integer.parseInt(str2);

                int nResult = n1 * n2;

                tv1.setText("계산결과:"+nResult);
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1단계- EditText1과 EditText2에서 값을 가져옴
                //2단계-가져온 값을 더함
                // 형변환 필요 (①EditText객체->②String->③Int)
                //3단계-계산결과를 TextView에 출력함

                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                int n1 = Integer.parseInt(str1);
                int n2 = Integer.parseInt(str2);

                int nResult = n1 / n2;

                tv1.setText("계산결과:"+nResult);
            }
        });
    }
}