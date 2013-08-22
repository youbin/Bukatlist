package soma.project.bukatlist;

import soma.project.lib.HttpRequestManager;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        Intent intent = getIntent();
        String user_id = intent.getExtras().getString("user_id");
        String uri = "http://14.63.185.160:8009/users/" + user_id;
	    GetReqeust prequest = new GetReqeust();
        prequest.execute(new String[]{uri});
    }


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
