package soma.project.bukatlist;

import java.util.ArrayList;

import soma.project.bukatlist.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FollowActivity extends Activity {
	private ArrayList<Follow> list;
	DataAdapter adapter;
	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_follow);
		
		listView = (ListView) findViewById(R.id.listView1);
		list = new ArrayList<Follow>();
		
		View header = getLayoutInflater().inflate(R.layout.header_follow, null, false);
		listView.addHeaderView(header);
		
		adapter = new DataAdapter(this, list);
		
		listView.setAdapter(adapter);
		adapter.add(new Follow(getApplicationContext(), 1, "模备1", R.drawable.follow));
		adapter.add(new Follow(getApplicationContext(), 1, "模备2", R.drawable.follow));
		adapter.add(new Follow(getApplicationContext(), 1, "模备3", R.drawable.follow));
		adapter.add(new Follow(getApplicationContext(), 1, "模备4", R.drawable.follow));
		adapter.add(new Follow(getApplicationContext(), 1, "模备5", R.drawable.follow));
		adapter.add(new Follow(getApplicationContext(), 1, "模备6", R.drawable.follow));
		adapter.add(new Follow(getApplicationContext(), 1, "模备7", R.drawable.follow));
		adapter.add(new Follow(getApplicationContext(), 1, "模备8", R.drawable.follow));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.book, menu);
		return true;
	}
	
	private class DataAdapter extends ArrayAdapter<Follow> {
		private LayoutInflater inflater;
		
		public DataAdapter(Context context, ArrayList<Follow> object) {
			super(context, 0, object);
			inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			// TODO Auto-generated constructor stub
		}

		public View getView(int position, View v, ViewGroup parent) {
			View view = null;
			
			if(v == null){
				view = inflater.inflate(R.layout.listview_follow, null);
			} else {
				view = v;
			}
			
			final Follow data = this.getItem(position);
			
			if (data != null) {
				TextView tView1 = (TextView) view.findViewById(R.id.textView1);
				tView1.setText(data.getU_name());
				
				ImageView iView1 = (ImageView) view.findViewById(R.id.imageView1);
//				ImageView iView2 = (ImageView) view.findViewById(R.id.imageView2);
				
				iView1.setImageResource((Integer) data.getFollower());
//				iView2.setImageResource((Integer) data.getFollowing());
			}
			return view;
		}
	}

}
