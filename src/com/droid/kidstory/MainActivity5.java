package com.droid.kidstory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ToggleButton;

public class MainActivity5 extends Activity 
{
	Button vbutton8, vbutton9;
	MediaPlayer audioBackground;
	ToggleButton myToggle;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main5);
		addListenerOnButton();
		//Memberi definisi di onCreate untuk toggle
		myToggle = (ToggleButton) findViewById(R.id.toggleSound3); 
		//Memanggil file my_sound pada folder raw
		audioBackground = MediaPlayer.create(this, R.raw.my_sound4);
		//Set looping ke true untuk mengulang audio jika telah selesai
		audioBackground.setLooping(true);
		//Set volume audio agar berbunyi
		audioBackground.setVolume(1,1);
		//Memulai audios
		audioBackground.start();
				
	}
	
	public void onToggleClicked(View view) 
	{
		boolean on = ((ToggleButton) view).isChecked();
		if(on)
		{
			/*Mematikan suara audio*/
			audioBackground.setVolume(0, 0);
		} 
		else
		{
			/*Menghidupkan kembali audio background*/
			audioBackground.setVolume(1, 1);
		}
	}
 
    @Override
    public void onBackPressed()
    {
        // TODO Auto-generated method stub
        audioBackground.stop();
        MainActivity5.this.finish();
    }
	
	private void addListenerOnButton()
	{
		// TODO Auto-generated method stub
		final Context context = this;
		vbutton8 = (Button) findViewById(R.id.button8);
		vbutton8.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Intent Intent = new Intent(context, MainActivity4.class);
				startActivity(Intent);
			}
		});
		
		vbutton9 = (Button) findViewById(R.id.button9);
		vbutton9.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Intent Intent = new Intent(context, MainActivity6.class);
				startActivity(Intent);
			}
		});
	}	
}