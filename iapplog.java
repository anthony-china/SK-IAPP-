package com.example.application;

import android.content.Intent;

import android.app.Activity;

public class iapplog {

    public void message(Activity context,String msg) {

		

	Intent intent = new Intent("XW_Messenger_broadcast_ip");

		

	intent.setPackage("com.iapp.app");

		

	intent.putExtra("type", 1);

		

	intent.putExtra("log", msg);

		

	context.sendBroadcast(intent);}

    

  

}
