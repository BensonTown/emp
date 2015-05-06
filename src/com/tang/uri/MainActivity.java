package com.tang.uri;

import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class MainActivity extends Activity {
public TextView text1;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    text1=(TextView)findViewById(R.id.text1);
    ListView lv=(ListView)findViewById(R.id.listView);
    List<Map<String, Object>> data=new ArrayList<Map<String,Object>>();
   
    for (int i = 0; i < 30; i++) {
      Map<String, Object> itme=new HashMap<String, Object>();
      itme.put("name", "1");
      itme.put("image", R.drawable.ic_launcher);
      data.add(itme);
    }
   
    
    SimpleAdapter adapter=new SimpleAdapter(this, data, R.layout.itme, new String[]{"name","image"}, new int[]{R.id.tv,R.id.iv});
    lv.setAdapter(adapter);
    lv.setOnItemClickListener(new OnItemClickListenerImpl());
    }
  private class OnItemClickListenerImpl implements OnItemClickListener {


    @SuppressWarnings("unchecked")
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int arg2,
    long id) {
      text1.setText("点击第"+arg2+"个项目");
      setTitle("点击第"+arg2+"个项目");
//      Intent intent = new Intent(MainActivity.this,Tb.class);
//      Bundle bundle=new Bundle();
//      bundle.putInt("id", arg2);
//      System .out .println(arg2);
//      intent.putExtras(bundle);
//              startActivity(intent);
      
//      setTitle("点击第"+arg2+"个项目");  
         
    }
  }
}
  


