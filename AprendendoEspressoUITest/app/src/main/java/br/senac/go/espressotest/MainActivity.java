package br.senac.go.espressotest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button exBT = findViewById(R.id.bt_exemplo);
		exBT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Cliquei no botao", Toast.LENGTH_SHORT).show();
			}
		});
		Button abrirTela2BT = findViewById(R.id.bt_abrir_tela2);
		abrirTela2BT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Abrindo tela 2", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(MainActivity.this, Tela2Activity.class);
				startActivity(intent);
			}
		});
	}
}
