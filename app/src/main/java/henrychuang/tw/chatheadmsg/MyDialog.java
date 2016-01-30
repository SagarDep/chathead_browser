package henrychuang.tw.chatheadmsg;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;


public class MyDialog extends Activity {
	public static boolean active = false;
	public static Activity myDialog;
	
	WebView webView;
	View top;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.dialog);
		webView = (WebView) findViewById(R.id.wv);
         webView.loadUrl(getIntent().getStringExtra(Utils.EXTRA_MSG));

		myDialog = MyDialog.this;
		

//				if(true) {
////					ChatHeadService.showMsg(MyDialog.this, str);
//					Intent it = new Intent(MyDialog.this, ChatHeadService.class);
//					it.putExtra(Utils.EXTRA_MSG, str);
//					startService(it);
//				}
		
		
		top.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
	}
		
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		active = true;
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		active = false;
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		active = false;
	}

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		webView.loadUrl(intent.getStringExtra(Utils.EXTRA_MSG));
	}
}
