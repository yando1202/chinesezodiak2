package com.KY.tugasmobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void openTikus(View v){
		Intent i = new Intent(getApplicationContext(),TikusActivity.class);
		startActivity(i);
	}
	public void openKerbau(View v){
		Intent i = new Intent(getApplicationContext(),Kerbau_Activity.class);
		startActivity(i);
	}
	public void openMacan(View v){
		Intent i = new Intent(getApplicationContext(),MacanActivity.class);
		startActivity(i);
	}
	public void openKelinci(View v){
		Intent i = new Intent(getApplicationContext(),KelinciActivity.class);
		startActivity(i);
	}
	public void openNaga(View v){
		Intent i = new Intent(getApplicationContext(),NagaActivity.class);
		startActivity(i);
	}
	public void openUlar(View v){
		Intent i = new Intent(getApplicationContext(),UlarActivity.class);
		startActivity(i);
	}
	public void openKuda(View v){
		Intent i = new Intent(getApplicationContext(),KudaActivity.class);
		startActivity(i);
	}
	public void openKambing(View v){
		Intent i = new Intent(getApplicationContext(),KambingActivity.class);
		startActivity(i);
	}
	public void openMonyet(View v){
		Intent i = new Intent(getApplicationContext(),MonyetActivity.class);
		startActivity(i);
	}
	public void openAyam(View v){
		Intent i = new Intent(getApplicationContext(),Ayam1Activity.class);
		startActivity(i);
	}
	public void openAnjing(View v){
		Intent i = new Intent(getApplicationContext(),AnjingActivity.class);
		startActivity(i);
	}
	public void openBabi(View v){
		Intent i = new Intent(getApplicationContext(),BabiActivity.class);
		startActivity(i);
	}
}
