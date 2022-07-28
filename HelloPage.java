package com.mycompany.myapp4;
import android.app.*;
import android.os.*;
import android.content.*;

public class HelloPage extends Activity 
{
	Handler hand=new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		//加载界面布局文件
		setContentView(R.layout.hellopage);
		hand.postDelayed(new Runnable(){
				@Override
				public void run()
				{
					// TODO: Implement this method
					Intent intent=new Intent(HelloPage.this,MainActivity.class);
					startActivity(intent);
					finish();
				}
			},8000);
	}
	
}
