package com.yan.co.grape;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // [今日动态]按钮取得
        final Button dynamic = (Button) findViewById(R.id.dynamic);
        // [今日动态]添加监听器：向【今日动态】画面进行迁移
        dynamic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 迁移动作
                Log.v("debug", "++++++++++++++++++++++++++++Test++++++++++++++:今日动态");
                Intent intent = new Intent(MainActivity.this,Dynamic.class);

                startActivity(intent);
            }
        });

        // [产品管理]按钮取得
        final Button productManagement = (Button) findViewById(R.id.productManagement);
        // [产品管理]添加监听器：向【产品管理】画面进行迁移
        productManagement.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 迁移动作
                Log.v("debug", "++++++++++++++++++++++++++++Test++++++++++++++:产品管理");

            }
        });

        // [客户管理]按钮取得
        final Button customerManagement = (Button) findViewById(R.id.customerManagement);
        // [客户管理]添加监听器：向【客户管理】画面进行迁移
        customerManagement.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 迁移动作
                Log.v("debug", "++++++++++++++++++++++++++++Test++++++++++++++:客户管理");

            }
        });

        // [查看评价]按钮取得
        final Button evaluate = (Button) findViewById(R.id.evaluate);
        // [查看评价]添加监听器：向【查看评价】画面进行迁移
        evaluate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 迁移动作
                Log.v("debug", "++++++++++++++++++++++++++++Test++++++++++++++:查看评价");

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
