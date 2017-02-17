package com.makingdevs.ui

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import com.getbase.floatingactionbutton.FloatingActionButton
import com.makingdevs.service.BankAccountManagerDBImpl
import com.makingdevs.transaction.appservice.R
import groovy.transform.CompileStatic

@CompileStatic
class BankAccountListActivity extends AppCompatActivity {

    @Override
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)
        FragmentManager fm =  getSupportFragmentManager()
        Fragment fragment = fm.findFragmentById(R.id.container)
        if(!fragment)
            fm.beginTransaction().add(R.id.container, createFragment()).commit()


    }

    Fragment createFragment() {
         new BankAccountFragment()
    }

}