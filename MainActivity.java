package com.mycompany.myapp4;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;


public class MainActivity extends Activity 
{
	//声明存储控件对象的变量
	Button bu0;
	Button bu1;
	Button bu2;
	Button bu3;
	Button bu4;
	Button bu5;
	Button bu6;
	Button bu7;
	Button bu8;
	Button bu9;
	Button bujia;
	Button bujian;
	Button buchen;
	Button buchu;
	Button buden;
	TextView atv;
	TextView atvout;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//获取控件对象
		Button cb0=(Button)findViewById(R.id.bu0);
		Button cb1=(Button)findViewById(R.id.bu1);
		Button cb2=(Button)findViewById(R.id.bu2);
		Button cb3=(Button)findViewById(R.id.bu3);
		Button cb4=(Button)findViewById(R.id.bu4);
		Button cb5=(Button)findViewById(R.id.bu5);
		Button cb6=(Button)findViewById(R.id.bu6);
		Button cb7=(Button)findViewById(R.id.bu7);
		Button cb8=(Button)findViewById(R.id.bu8);
		Button cb9=(Button)findViewById(R.id.bu9);
		Button cbjia=(Button)findViewById(R.id.bujia);
		final TextView ctvout=(TextView)findViewById(R.id.atvout);
		//绑定监听器
		cb0.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String text = ctvout.getText().toString();
					ctvout.setText(text+"0");
					return;
				}
			});
		cb1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String text1 = ctvout.getText().toString();
					ctvout.setText(text1+"1");
					return;
				}
			});
		cb2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String text2 = ctvout.getText().toString();
					ctvout.setText(text2+"2");
					return;
				}
			});
		cb3.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String text3 = ctvout.getText().toString();
					ctvout.setText(text3+"3");
					return;
				}
			});
		cb4.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String text4 = ctvout.getText().toString();
					ctvout.setText(text4+"4");
					return;
				}
			});
		cb5.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String text5 = ctvout.getText().toString();
					ctvout.setText(text5+"5");
					return;
				}
			});
		cb6.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String text6 = ctvout.getText().toString();
					ctvout.setText(text6+"6");
					return;
				}
			});
		cb7.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String text7 = ctvout.getText().toString();
					ctvout.setText(text7+"7");
					return;
				}
			});
		cb8.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String text8 = ctvout.getText().toString();
					ctvout.setText(text8+"8");
					return;
				}
			});
		cb9.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String text9 = ctvout.getText().toString();
					ctvout.setText(text9+"9");
					return;
				}
			});
		cbjia.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					String t1=ctvout.getText().toString();
					ctvout.setText("");
					String t2=ctvout.getText().toString();
					/**int a=Integer.parseInt(t1);
					int b=Integer.parseInt(t2);*/
				}
				
			
		});
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this menu
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu,menu);
		return true;
	}
	public void onExitButtonClick(View view)
	{
		finish();
	}
}
