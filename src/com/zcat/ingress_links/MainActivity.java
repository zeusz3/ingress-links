package com.zcat.ingress_links;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void calculate(View view) {
    	EditText dETXT = (EditText) findViewById(R.id.distanceETXT);
    	Double d = Double.parseDouble(dETXT.getText().toString());
    	Spinner alSPNR = (Spinner) findViewById(R.id.linkAmpSPNR);
    	long la = alSPNR.getSelectedItemId();
    	double laValue = 1;
    	switch ((int) la) {
	    	case 0:
	    		laValue = 1;
	    		break;
	    	case 1:
	    		laValue = 2;
	    		break;
	    	case 2:
	    		laValue = 2.5;
	    		break;
	    	case 3:
	    		laValue = 2.75;
	    		break;
	    	case 4:
	    		laValue = 3;
	    		break;
    	}
    	double apl = Math.pow((1000*d)/(160*laValue), 0.25);
    	EditText aplETXT = (EditText) findViewById(R.id.aplETXT); 
    	aplETXT.setText(String.valueOf(apl));
    }
    
}
