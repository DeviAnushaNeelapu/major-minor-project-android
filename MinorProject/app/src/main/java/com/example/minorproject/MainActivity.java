package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity {
    TextView displaytext,screen;
    private EditText editdata;
    String Operator="",res="",displaydata="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=findViewById(R.id.edit1);
        screen.setText(displaydata);
        editdata=findViewById(R.id.edit1);
        displaytext=findViewById(R.id.result_box);
        findViewById(R.id.butdelet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete();
            }
        });

    }
 private void appendToLast(String str){
    this.editdata.getText().append(str);
    }
    private void delete() {
        this.editdata.getText().delete(getinputdata().length() -1,getinputdata().length());
    }
    private String getinputdata(){

    return this.editdata.getText().toString();
    }
    private boolean endsWith(){
        return getinputdata().endsWith("+") ||
                getinputdata().endsWith("-") ||
                getinputdata().endsWith("/")||
                getinputdata().endsWith("x");
    }
    private void replace(String str){
        editdata.getText().replace(getinputdata().length() -1,getinputdata().length(),str);
    }

    public void Number(View view) {
        Button b=(Button) view;
        displaydata +=b.getText();
        appendToLast(displaydata);
        displaydata="";


    }

    public void Operator(View view) {
        Button b1 = (Button) view;
        displaydata += b1.getText();
        if (endsWith()) {
            replace(displaydata);
            Operator = b1.getText().toString();
            displaydata = "";
        } else {
            appendToLast(displaydata);
            Operator =b1.getText().toString();
            displaydata = "";
        }
    }

    public void onClearButton(View view) {
        editdata.getText().clear();
        displaytext.setText("");
    }

    public void equalresult(View view) {
    String userdata=getinputdata();
    if(!endsWith()) {
        if (userdata.contains("x")) {
            userdata = userdata.replaceAll("x", "*");
        }
        if (userdata.contains("\u00F7")) {
            userdata = userdata.replaceAll("\u00F7", "/");
        }
        Expression ex = new ExpressionBuilder(userdata).build();
        double re1 = ex.evaluate();
        displaytext.setText(String.valueOf(re1));
    }
    else displaytext.setText("");
    System.out.println(res);

    }
    }
