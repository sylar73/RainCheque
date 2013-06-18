package com.xteam.raincheque;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

<<<<<<< HEAD
// test
// This was edited by sylar

=======
>>>>>>> 2cd5fc9af057014f7e891146625459829f8265d1
public class ControlBoardActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.control_board);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.control_board, menu);
		return true;
	}

}
