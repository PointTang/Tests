package com.point.tests;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Point on 2017/1/19.
 */

public class WebViewActivity extends Activity {


	WebViewSupportJS w;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		w = (WebViewSupportJS) findViewById(R.id.webview);
		w.loadUrl("http://szcc.bz/test/goods.html");
		w.loadUrl("http://192.168.1.91:8080/webpage/helloJS.html");
//		w.loadUrl("http://38.121.64.162:8099/tv/");

	}


}
