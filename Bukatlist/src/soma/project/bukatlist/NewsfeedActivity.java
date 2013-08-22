package soma.project.bukatlist;

import java.util.ArrayList;

import soma.project.object.Feed;
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

public class NewsfeedActivity extends Activity {

	private ListView listView;
	private ArrayList<Feed> feed_list;
	private NewsfeedAdapter adapter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);
        listView = (ListView)findViewById(R.id.newsfeedList);
        feed_list = new ArrayList<Feed>();
        feed_list.add(new Feed("jaeeo", "jaeeo", "d", 0, 20, 0, "auther", "auther", "d", "demonicyb", "demonicyb", "d"));
        feed_list.add(new Feed("jaeeo", "jaeeo", "d", 0, 13, 1, "auther", "auther", "d"));
        feed_list.add(new Feed("jaeeo", "jaeeo", "d", 0, 2, 11));
        adapter = new NewsfeedAdapter(this, R.layout.list_newsfeed, 0, feed_list);
	    listView.setAdapter(adapter);

	    ImageView next = (ImageView)findViewById(R.id.rightButton);
        next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getBaseContext(), BookActivity.class);
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
    
	private class NewsfeedAdapter extends ArrayAdapter<Feed>{
		private ArrayList<Feed> items;
		private int rsrc;
		private LayoutInflater li;

		public NewsfeedAdapter(Context ctx, int rsrcId, int txtId, ArrayList<Feed> data){
			super(ctx, rsrcId, txtId, data);
			this.items = data;
			this.li = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);		
			this.rsrc = rsrcId;
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent){
			View v = convertView;
			if(v == null){
				v = li.inflate(rsrc, null);
			}
			Feed feed = items.get(position);
			if(feed != null){
				((TextView)v.findViewById(R.id.u_nickName)).setText(feed.getBookNickname());
				((TextView)v.findViewById(R.id.f_type)).setText(feed.getType());
				((TextView)v.findViewById(R.id.b_likeCount)).setText(""+feed.getLikecount());
				((TextView)v.findViewById(R.id.b_belongCount)).setText(""+feed.getBelongcount());
				if(!feed.getReviewNickname().equals("")){
					((TextView)v.findViewById(R.id.r_nickName)).setText(feed.getReviewNickname());
					((TextView)v.findViewById(R.id.r_review)).setText(feed.getReview());
				}
				else{
					v.findViewById(R.id.reviewType).setVisibility(View.GONE);
				}
				if(!feed.getCommentNickname().equals("")){
					((TextView)v.findViewById(R.id.cm_nickName)).setText(feed.getCommentNickname());
					((TextView)v.findViewById(R.id.cm_comment)).setText(feed.getComment());
				}
				else{
					v.findViewById(R.id.commentType).setVisibility(View.GONE);
				}
			}
			return v;
		}
	}
}
