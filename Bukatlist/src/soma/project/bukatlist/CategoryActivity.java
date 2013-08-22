package soma.project.bukatlist;

import java.util.ArrayList;

import soma.project.bukatlist.R;
import soma.project.object.Category;
import soma.project.object.Category;
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

public class CategoryActivity extends Activity {
	private ArrayList<Category> list;
	DataAdapter adapter;
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category);

		listView = (ListView) findViewById(R.id.listView1);
		list = new ArrayList<Category>();

		View header = getLayoutInflater().inflate(R.layout.header_book, null, false);
		listView.addHeaderView(header);

		adapter = new DataAdapter(this, list);

		listView.setAdapter(adapter);
		adapter.add(new Category(getApplicationContext(), 1, R.drawable.book, R.drawable.book2, R.drawable.book3));
		adapter.add(new Category(getApplicationContext(), 1, R.drawable.book, R.drawable.book2, R.drawable.book3));
		adapter.add(new Category(getApplicationContext(), 1, R.drawable.book, R.drawable.book2, R.drawable.book3));
		adapter.add(new Category(getApplicationContext(), 1, R.drawable.book, R.drawable.book2, R.drawable.book3));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.book, menu);
		return true;
	}

	private class DataAdapter extends ArrayAdapter<Category> {
		private LayoutInflater inflater;

		public DataAdapter(Context context, ArrayList<Category> object) {
			super(context, 0, object);
			inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			// TODO Auto-generated constructor stub
		}

		public View getView(int position, View v, ViewGroup parent) {
			View view = null;

			if(v == null){
				view = inflater.inflate(R.layout.list_category, null);
			} else {
				view = v;
			}

			final Category data = this.getItem(position);

			if (data != null) {
//				TextView tView1 = (TextView) view.findViewById(R.id.textView1);

//				tView1.setText(data.getC_id());

				ImageView iView1 = (ImageView) view.findViewById(R.id.imageView1);
				ImageView iView2 = (ImageView) view.findViewById(R.id.imageView2);
				ImageView iView3 = (ImageView) view.findViewById(R.id.imageView3);

//				iView1.setImageResource((Integer) data.getC_book1());
//				iView1.setImageResource((Integer) data.getC_book2());
//				iView1.setImageResource((Integer) data.getC_book3());

			}
			return view;
		}


	}

}