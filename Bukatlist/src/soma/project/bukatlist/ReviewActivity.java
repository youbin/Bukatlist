package soma.project.bukatlist;

import java.util.ArrayList;

import soma.project.object.Comment;
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

public class ReviewActivity extends Activity {

	private ListView listView;
	private ArrayList<Comment> comment_list;
	private CommentAdapter adapter;
	private View header;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        listView = (ListView)findViewById(R.id.reviewList);
        comment_list = new ArrayList<Comment>();
        comment_list.add(new Comment("jaeeo", "jaeeo", "d"));
        comment_list.add(new Comment("arther", "arther", "d"));
        comment_list.add(new Comment("demonicyb", "demonicyb", "d"));
        
        header = getLayoutInflater().inflate(R.layout.header_review, null, false);
        listView.addHeaderView(header);
        
        adapter = new CommentAdapter(this, R.layout.list_review, 0, comment_list);
	    listView.setAdapter(adapter);

	    ImageView next = (ImageView)findViewById(R.id.rightButton);
        next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getBaseContext(), MyPageActivity.class);
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
	private class CommentAdapter extends ArrayAdapter<Comment>{
		private ArrayList<Comment> items;
		private int rsrc;
		
		public CommentAdapter(Context ctx, int rsrcId, int txtId, ArrayList<Comment> data){
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
			Comment comment = items.get(position);
			if(comment != null){
				((TextView)v.findViewById(R.id.u_nickName)).setText(comment.getNickname());
				((TextView)v.findViewById(R.id.cm_comment)).setText(comment.getComment());
			}
			return v;
		}
	}
}
