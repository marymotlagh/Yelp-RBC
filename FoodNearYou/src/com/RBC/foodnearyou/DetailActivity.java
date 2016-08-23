package com.RBC.foodnearyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		
		TextView name = (TextView) findViewById(R.id.txvName);
		TextView address = (TextView) findViewById(R.id.txvAddress);
		TextView review = (TextView) findViewById(R.id.txvReview);
		
		Intent intent = getIntent();
		
		name.setText(intent.getStringExtra("name"));
		address.setText(intent.getStringExtra("address"));
		review.setText(intent.getStringExtra("review"));
		String url = intent.getStringExtra("imageUrl");
		
		new DownloadImageTask((ImageView) findViewById(R.id.imgImage)).execute(url);

	}
}
