package henrychuang.tw.chatheadmsg;


import android.content.Context;
import android.os.Build;
import android.provider.Settings;

public class Utils {
	public static String LogTag = "henrytest";
	public static String EXTRA_MSG = "extra_msg";
	public static  String FAV_URL = "fav_url";


	public static boolean canDrawOverlays(Context context){
//		if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
//			return true;
//		}else{
//			return Settings.canDrawOverlays(context);
//		}

return  true;
	}


}
