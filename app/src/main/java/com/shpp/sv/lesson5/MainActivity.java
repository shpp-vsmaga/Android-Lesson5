package com.shpp.sv.lesson5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log();
    }


    @Override
    protected void onStart() {
        super.onStart();
        log();
    }

    @Override
    protected void onResume() {
        super.onResume();
        log();
    }

    @Override
    protected void onPause() {
        super.onPause();
        log();
    }

    @Override
    protected void onStop() {
        super.onStop();
        log();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log();
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void onClickNewDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.helloText)
                .setCancelable(true)
                .setPositiveButton(R.string.okText,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();

    }

    private void log(){
        Throwable t = new Throwable();
        StackTraceElement trace[] = t.getStackTrace();

        if (trace.length > 1){
            StackTraceElement element = trace[1];
            Log.d("MYLOG", this.getClass().getSimpleName() +
                     "  " + element.getMethodName() +
                     "() - executed!!!");
        }

    }
}

