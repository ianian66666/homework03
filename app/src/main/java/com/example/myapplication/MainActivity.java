package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText h;                //宣告全域變數
    EditText w;                //宣告全域變數
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h = (EditText)findViewById(R.id.et1);                           // 取得身高物件
        Button submit = (Button)findViewById(R.id.button);             // 取得按鈕物件 如果ID有誤請回到res->Layout查看預設Button是多少

        submit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                //判斷條件 身高 跟 體重 都有輸入值才執行
                if ( !("".equals(h.getText().toString()) ))
                {
                    float fh = Float.parseFloat(h.getEditableText().toString());      // 取得 身高輸入值
                    float fresult;                                     // BMI值 計算結果
                    TextView result = (TextView)findViewById(R.id.et2);// 取得 顯示結果 物

                    NumberFormat nf = NumberFormat.getInstance();   // 數字格式
                    nf.setMaximumFractionDigits(2);
                    fresult = (float) (fh*9.0/5.0+32);                                // 計算BMI
                    result.setText(nf.format(fh*9.0/5.0+32) +"");           // 顯示BMI計算結果
                    TextView dia = (TextView)findViewById(R.id.et2);// 取得 顯示診斷 物件

                    // 診斷結果 顯示

                }
            }
        });
    }
}
