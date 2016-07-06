package hotfix.liyeyu.com.hotfix;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.util.Log;

import java.io.File;

import cn.jiajixin.nuwa.Nuwa;

/**
 * Created by Liyeyu on 2016/6/23.
 */
public class FixApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Nuwa.init(this);
        String path = Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar");
        Log.i("path",path+" -- "+new File(path).exists());
        Nuwa.loadPatch(this, path);
    }
}
