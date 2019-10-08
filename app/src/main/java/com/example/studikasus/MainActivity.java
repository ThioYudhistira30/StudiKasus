package com.example.studikasus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();/*ini untuk mengaitkan fragmen layout ke halaman utama*/
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frm1, new FragmenSatu());
        ft.add(R.id.frm2, new FragmenDua());
        ft.commit(); /*harus di kommit agar terkait sempurna*/
    }
}
