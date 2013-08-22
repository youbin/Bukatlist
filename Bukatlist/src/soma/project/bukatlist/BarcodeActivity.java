package soma.project.bukatlist;

import soma.project.lib.HttpRequestManager;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class BarcodeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
    }


//    @Override
//	protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
//    	IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
//    	if (scanResult != null) {
//    		String contents = intent.getStringExtra("SCAN_RESULT");
//    		String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
//    		Log.d("test", "barcode : "+contents+" format : "+format);
//    		TextView title = (TextView)findViewById(R.id.title);
//    		title.setText(contents);
//    	}
//    	else{
//    		
//    	}
//     }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	private class GetReqeust extends AsyncTask<String, Void, String> {
		@Override
		protected String doInBackground(String... urls) {
			String response = HttpRequestManager.requestGet(urls[0]);

			return response;
		}
		
		@Override
		protected void onPostExecute(String result) {
			super.onPostExecute(result);
		}
	}
}
