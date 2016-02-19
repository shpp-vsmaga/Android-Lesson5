package com.shpp.sv.lesson5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by SV on 19.02.2016.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

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

    public void onClickMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
