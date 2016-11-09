package com.yan.co.grape;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.yan.co.grape.adapter.NewsListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yanbin on 2016/11/07.
 */
public class NewsActivity extends AppCompatActivity {

    private List<Map<String, Object>> productInfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_main);

//        productInfos = getProductInfo();

        NewsListAdapter newsList = new NewsListAdapter(this);
        ListView lv = (ListView)findViewById(R.id.testListView);
        lv.setAdapter(newsList);

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

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

}
