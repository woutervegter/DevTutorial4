package me.moop.scrollviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button mBtnCalculate;
	TextView mTxtvResult;
	EditText mEtxtNumber;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nicelayout);

		mBtnCalculate = (Button) findViewById(R.id.btnCalculate);
		mTxtvResult = (TextView) findViewById(R.id.txtvResult);
		mEtxtNumber = (EditText) findViewById(R.id.etxtNumber);
	}

	public void calculateTables(View view){
		if (view == mBtnCalculate){
			try {
				String allCalculationsResult = "";
				String numberString = mEtxtNumber.getText().toString();
				int number = Integer.parseInt(numberString);
	
				for (int counter = 0; counter < 60; counter++){
					int result;
					result = counter * number;
					String calculationResult;
					calculationResult = counter + " X " + number + " = " + result;
					allCalculationsResult = allCalculationsResult + "\n" + calculationResult;
				}
				mTxtvResult.setText(allCalculationsResult);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				Toast.makeText(this,"Voer een geheel getal in", Toast.LENGTH_LONG).show();
				e.printStackTrace();
			}
		}
	}
}