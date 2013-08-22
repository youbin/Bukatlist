package soma.project.bukatlist;

import java.util.ArrayList;

import soma.project.lib.SeparatedListAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class OptionActivity extends Activity {

	private SeparatedListAdapter adapter;
	private ListView listView;
	private ArrayAdapter<String> version_adapter;
	private ArrayAdapter<String> option_adapter;
	private ArrayList<String> version_list;
	private ArrayList<String> option_list;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        listView = (ListView)findViewById(R.id.optionList);
        version_list = new ArrayList<String>();
        version_list.add("d");
        version_list.add("d");
        option_list = new ArrayList<String>();
        option_list.add("Notification");
        option_list.add("Login with Facebook");
        option_list.add("Logout");
        adapter = new SeparatedListAdapter(this, R.layout.header_option, R.id.content);
   		version_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, version_list);
		option_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, option_list);  
        adapter.addSection("Version", version_adapter);  
        adapter.addSection("Option", option_adapter);  
	    listView.setAdapter(adapter);

	    ImageView next = (ImageView)findViewById(R.id.rightButton);
        next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getBaseContext(), BarcodeActivity.class);
				startActivity(intent);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
