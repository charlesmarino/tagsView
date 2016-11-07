package com.thoughtdrop.addtagssample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AddTagsActivity extends AppCompatActivity {
	private List<TextView> tags;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_tags);
		TagsView tagsView = (TagsView) findViewById(R.id.tags_view);
		tagsView.setTags(new ArrayList<String>()  {
			{
				add("facebook");
				add("facebook");
				add("facebook");
				add("facebook");
				add("facebook");
			}
		});
		TagsView tagsView2 = (TagsView) findViewById(R.id.tags_view2);
		tagsView2.setTags(new ArrayList<String>()  {
			{
				add("facebook");
				add("facebook");
				add("facebook");
				add("facebook");
			}
		});
		TagsView tagsView3 = (TagsView) findViewById(R.id.tags_view3);
		tagsView3.setTags(new ArrayList<String>()  {
			{
				add("facebook");
				add("facebook");
				add("facebook");
			}
		});
		TagsView tagsView4 = (TagsView) findViewById(R.id.tags_view4);
		tagsView4.setTags(new ArrayList<String>()  {
			{
				add("facebook");
				add("facebook");
			}
		});

	}
}
