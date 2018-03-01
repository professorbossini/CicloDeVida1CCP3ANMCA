package br.com.bossini.ciclodevida1ccp3anmca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("meuapp", "Act1: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("meuapp", "Act1: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("meuapp", "Act1: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("meuapp", "Act1: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("meuapp", "Act1: onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("meuapp", "Act1: onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("meuapp", "Act1: onDestroy");
    }

    public void irParaASegundaActivity(View view) {
        Intent intent = new Intent (this, SegundaActivity.class);
        startActivity(intent);
    }
}
