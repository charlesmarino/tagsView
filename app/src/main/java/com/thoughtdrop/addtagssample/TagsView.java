package com.thoughtdrop.addtagssample;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charlesmarino on 11/4/16.
 */

public class TagsView extends LinearLayout {
	private List<TextView> tags;
		public TagsView(Context context) {
			super(context);
			initializeViews(context);
		}

		public TagsView(Context context, AttributeSet attrs) {
			super(context, attrs);
			initializeViews(context);
		}

		public TagsView(Context context, AttributeSet attrs, int defStyleAttr) {
			super(context, attrs, defStyleAttr);
			initializeViews(context);
		}

		@TargetApi(Build.VERSION_CODES.LOLLIPOP)
		public TagsView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
			super(context, attrs, defStyleAttr, defStyleRes);
			initializeViews(context);
		}

		private void initializeViews(Context context) {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			inflater.inflate(R.layout.tags_view, this);
		}

	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		tags = new ArrayList<TextView>() {
			{
				add((TextView) findViewById(R.id.tagOneOne));
				add((TextView) findViewById(R.id.tagOneTwo));
				add((TextView) findViewById(R.id.tagOneThree));
				add((TextView) findViewById(R.id.tagTwoOne));
				add((TextView) findViewById(R.id.tagTwoTwo));
			}
		};
		this.setGravity(Gravity.CENTER_HORIZONTAL);
		this.setOrientation(VERTICAL);
	}

	public void setTags(List<String> tagStrings) {
		TextView tempTextView;
		for (int i = 0; i < tags.size() ; i++) {
			tempTextView = tags.get(i);
			if (i < tagStrings.size()) {
				tempTextView.setText(tagStrings.get(i));
				tempTextView.setVisibility(VISIBLE);
			} else {
				tempTextView.setVisibility(GONE);
			}
		}
	}

}
