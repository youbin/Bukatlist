package soma.project.bukatlist;

import java.util.ArrayList;

import soma.project.object.Review;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class BookActivity extends Activity {

	private ListView listView;
	private ArrayList<Review> review_list;
	private ReviewAdapter adapter;
	private View header;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        listView = (ListView)findViewById(R.id.bookList);
        review_list = new ArrayList<Review>();
        review_list.add(new Review("jaeeo", "jaeeo", "d"));
        review_list.add(new Review("demonicyb", "demonicyb", "d"));
        review_list.add(new Review("arther", "arther", "d"));
        
        header = getLayoutInflater().inflate(R.layout.header_book, null, false);
        listView.addHeaderView(header);
        
        adapter = new ReviewAdapter(this, R.layout.list_book, 0, review_list);
	    listView.setAdapter(adapter);

	    ImageView next = (ImageView)findViewById(R.id.rightButton);
        next.setOnClickListener(new View.OnClickListener() {
			
        	@Override
			public void onClick(View v) {
				Intent intent = new Intent(getBaseContext(), ReviewActivity.class);
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
	private class ReviewAdapter extends ArrayAdapter<Review>{
		private ArrayList<Review> items;
		private int rsrc;
		
		public ReviewAdapter(Context ctx, int rsrcId, int txtId, ArrayList<Review> data){
			super(ctx, rsrcId, txtId, data);
			this.items = data;
			this.rsrc = rsrcId;
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent){
			View v = convertView;
			if(v == null){
				LayoutInflater li = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				v = li.inflate(rsrc, null);
			}
			Review review = items.get(position);
			if(review != null){
				((TextView)v.findViewById(R.id.u_nickName)).setText(review.getNickname());
				((TextView)v.findViewById(R.id.r_review)).setText(review.getReview());
			}
			return v;
		}
	}
}
