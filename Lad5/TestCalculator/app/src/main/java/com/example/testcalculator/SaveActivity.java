package com.example.testcalculator;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SaveActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnCham;
    private Button btnBang;
    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;
    private Button btnDel;
    private EditText edtNhap;
    private TextView txtNhap;

    @Override
    public void onCreate(@Nullable Bundle savedInstanStaceState){
        super.onCreate(savedInstanStaceState);
        setContentView(R.layout.activity_main);

        edtNhap = (EditText) findViewById(R.id.edtNhap);
        txtNhap = (TextView) findViewById(R.id.txtKetQua);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnCham = (Button) findViewById(R.id.btnCham);
        btnBang = (Button) findViewById(R.id.btnBang);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        btnDel = (Button) findViewById(R.id.btnDel);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnCham.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnDel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn0:
                edtNhap.append("0");
                break;
            case R.id.btn1:
                edtNhap.append("1");
                break;
            case R.id.btn2:
                edtNhap.append("2");
                break;
            case R.id.btn3:
                edtNhap.append("3");
                break;
            case R.id.btn4:
                edtNhap.append("4");
                break;
            case R.id.btn5:
                edtNhap.append("5");
                break;
            case R.id.btn6:
                edtNhap.append("6");
                break;
            case R.id.btn7:
                edtNhap.append("7");
                break;
            case R.id.btn8:
                edtNhap.append("8");
                break;
            case R.id.btn9:
                edtNhap.append("9");
                break;
            case R.id.btnCham:
                edtNhap.append(".");
                break;
            case R.id.btnCong:
                edtNhap.append("+");
                break;
            case R.id.btnTru:
                edtNhap.append("-");
                break;
            case R.id.btnNhan:
                edtNhap.append("*");
                break;
            case R.id.btnChia:
                edtNhap.append("/");
                break;
            case R.id.btnDel:
                BaseInputConnection txtBaseInputConnection = new BaseInputConnection(edtNhap , true);
                txtBaseInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DEL));
                break;
        }
    }
}
