package br.com.bossini.ciclodevida1ccp3anmca;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Log.i("meuapp", "Act2: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("meuapp", "Act2: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("meuapp", "Act2: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("meuapp", "Act2: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("meuapp", "Act2: onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("meuapp", "Act2: onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("meuapp", "Act2: onDestroy");
    }

    public void voltarParaAPrimeira(View view) {
       finish();
    }
}
