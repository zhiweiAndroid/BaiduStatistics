package com.example.user.baidustatistics;

import android.view.View;
import android.widget.Toast;
import com.baidu.mobstat.StatService;
import java.util.HashMap;
import java.util.Map;

public class Main3Activity extends BaseActivity {


    @Override
    public int getLayout() {
        return R.layout.activity_main3;
    }

    @Override
    protected void initView() {
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatService.setUserId(Main3Activity.this,"1804176300005");
                Map<String, String> attributes = new HashMap<String, String>();
                attributes.put("name", "8888888");
                attributes.put("time", System.currentTimeMillis()+"");
                attributes.put("phone", "18888888888");
                attributes.put("age", "20");
                attributes.put("type", "777");
                StatService.onEvent(Main3Activity.this, "1003", "借钱", 1);
                Toast.makeText(Main3Activity.this,"sucess",Toast.LENGTH_LONG).show();
            }
        });

    }
}
