package com.yan.co.grape.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yan.co.grape.R;
import com.yan.co.grape.entity.NewsInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yanbin on 2016/11/09.
 */
public class NewsListAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private Context mContext;
    private List<Map<String, Object>> mData;


    public NewsListAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mData = getProductInfo();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        System.out.println("getView: " + position + " " + convertView + " End");//调试语句

        NewsInfo newsInfo;

        if (null == convertView) {
            newsInfo = new NewsInfo();

            convertView = mInflater.inflate(R.layout.news_inflater, null);

            newsInfo.setProductImg((ImageView) convertView.findViewById(R.id.productImg));
            newsInfo.setProductTitle((TextView) convertView.findViewById(R.id.productTitle));
            newsInfo.setProductInfo((TextView) convertView.findViewById(R.id.productInfo));

            convertView.setTag(newsInfo);

        } else {
            newsInfo = (NewsInfo) convertView.getTag();
        }

        newsInfo.productImg.setImageDrawable(ContextCompat.getDrawable(mContext,(Integer) mData.get(position).get("img")));
        newsInfo.productTitle.setText(mData.get(position).get("title").toString());
        newsInfo.productInfo.setText(mData.get(position).get("info").toString());

        return convertView;
    }

    private List<Map<String, Object>> getProductInfo() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "产品①");
        map.put("info", "产品说明：XXXXXXXXXXXXXXXXXXXXXXXXXX");
        map.put("img", R.drawable.cute0);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "产品②");
        map.put("info", "产品说明：YYYYYYYYYYYYYYYYYY");
        map.put("img", R.drawable.cute0);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "产品③");
        map.put("info", "产品说明：XXXXXXXXXZZZZZZZZZ");
        map.put("img", R.drawable.cute0);
        list.add(map);

        return list;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
