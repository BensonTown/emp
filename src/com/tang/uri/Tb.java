package com.tang.uri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tb extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
  // TODO Auto-generated method stub
  super.onCreate(savedInstanceState);
  setContentView(R.layout.tb);
  TextView te=(TextView)findViewById(R.id.tb);
  Bundle bundle = this.getIntent().getExtras();
  int id = bundle.getInt("id");
  
  te.setText("点击了"+id+"条目");
  
}
}
