package com.narendra.dialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=findViewById(R.id.number);
    }
    public void delete(View view){
        String mynum=num.getText().toString();
        num.setText(mynum.substring(0,mynum.length()-1));
    }
    public void one(View view){ num.append("1"); }
    public void two(View view){ num.append("2"); }
    public void three(View view){ num.append("3"); }
    public void four(View view){ num.append("4"); }
    public void five(View view){ num.append("5"); }
    public void six(View view){ num.append("6"); }
    public void seven(View view){ num.append("7"); }
    public void eight(View view){ num.append("8"); }
    public void nine(View view){ num.append("9"); }
    public void dash(View view){ num.append("-"); }
    public void zero(View view){ num.append("0"); }
    public void hash(View view){ num.append("#"); }

    public void call(View view){
        String myNum=num.getText().toString();
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+myNum));
        startActivity(intent);
    }
    public void save(View view){
        String myNum=num.getText().toString();
        Intent intent=new Intent(Intent.ACTION_INSERT, ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra(ContactsContract.Intents.Insert.PHONE,myNum);
        startActivity(intent);
    }

}