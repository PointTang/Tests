package com.point.tests;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Created by Point on 2017/1/19.
 */

public class WebViewSupportJS extends WebView {


	Context context;

	private Activity currentActiviy;

	public WebViewSupportJS(Context context) {
		super(context);
		init();
	}


	public WebViewSupportJS(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public WebViewSupportJS(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}

	public void setCurrentActiviy(Activity currentActiviy) {
		this.currentActiviy = currentActiviy;
	}


	@SuppressLint("SetJavaScriptEnabled")
	private void init() {
		requestFocusFromTouch();
		setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
		getSettings().setJavaScriptEnabled(true);
		getSettings().setAllowFileAccess(true);
		getSettings().setSupportZoom(true);
		getSettings().setBuiltInZoomControls(false);
		getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
		getSettings().setUserAgentString(getSettings().getUserAgentString());
		getSettings().setDomStorageEnabled(true);
		// mWebView.getSettings().setAppCachePath(appCachePath);
		getSettings().setAppCacheEnabled(false);

		getSettings().setTextZoom(100);

		setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
				return false;
			}
		});
		setWebChromeClient(new WebChromeClient());
	}
}
