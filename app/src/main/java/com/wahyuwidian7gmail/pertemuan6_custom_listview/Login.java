package com.wahyuwidian7gmail.pertemuan6_custom_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    //TODO 1: Untuk memanggil intent login dan register agar ketika di klik akan langsung masuk ke dalam project register
    }
    public void onClick (View v){
        Intent login=new Intent(getApplicationContext(),MainActivity.class);

        //TODO 2 : script untuk dapat memasukan username dan password didalam project
        EditText username= (EditText) findViewById(R.id.editText);
        EditText password= (EditText) findViewById(R.id.editText3);

        //TODO 3 : Untuk mengambil inputan user dari username dan password
        String username1=username.getText().toString();
        String password1=password.getText().toString();

        //TODO 4 : untuk inputan username dengan nama Widian dan Password 165410033 fungsinya agar dapat masuk ke dalam project ketika data sudah diinputkan
        if (username1.equals("Widian") && password1.equals("165410033")){
            startActivity(login);
        }

        //TODO 5 : apabila terjadi gagal login ke dalam project maka akan muncul pemberitahuan Username dan Password salah
        else {
            Toast.makeText(getApplicationContext(), "Username dan Password Salah", Toast.LENGTH_SHORT).show();
        }
    }

    // TODO 6 : script untuk bagian register fungsinya dapat masuk ketika data sudah benar dan ketika diklik langsung masuk ke bagian register project
    public void onClick2 (View v){
        Intent register=new Intent(getApplicationContext(),Register.class);
        startActivity(register);
    }
}
