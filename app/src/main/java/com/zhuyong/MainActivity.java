package com.zhuyong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zhuyong.countdownciew.CountDownView;
import com.zhuyong.countdownview.R;

public class MainActivity extends AppCompatActivity {

    private CountDownView mCdView1;
    private CountDownView mCdView2;
    private CountDownView mCdView3;
    private CountDownView mCdView4;
    private CountDownView mCdView5;
    private CountDownView mCdView6;
    private CountDownView mCdView7;
    private CountDownView mCdView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCdView1 = (CountDownView) findViewById(R.id.cd_view1);
        mCdView1.setOnLoadingFinishListener(new CountDownView.OnLoadingFinishListener() {
            @Override
            public void finish() {
                Toast.makeText(MainActivity.this, "加载动画执行结束", Toast.LENGTH_SHORT).show();
            }
        });

        mCdView2 = (CountDownView) findViewById(R.id.cd_view2);
        mCdView3 = (CountDownView) findViewById(R.id.cd_view3);
        mCdView4 = (CountDownView) findViewById(R.id.cd_view4);
        mCdView5 = (CountDownView) findViewById(R.id.cd_view5);
        mCdView6 = (CountDownView) findViewById(R.id.cd_view6);
        mCdView7 = (CountDownView) findViewById(R.id.cd_view7);
        mCdView8 = (CountDownView) findViewById(R.id.cd_view8);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCdView1.start();
                mCdView2.start();
                mCdView3.start();
                mCdView4.start();
                mCdView5.start();
                mCdView6.start();
                mCdView7.start();
                mCdView8.start();
            }
        });
    }

}
