package com.bytedance.codecx.base;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dalvik.system.BaseDexClassLoader;

/* JADX INFO: loaded from: classes4.dex */
public class CodecXContextUtils {
    public static Context applicationContext;

    public static String getAppPath() {
        return C786410Ut5.y2(applicationContext, "").toString();
    }

    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static String getAppLibPath(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String strFindLibrary = ((BaseDexClassLoader) applicationContext.getClassLoader()).findLibrary(str);
            if (strFindLibrary == null) {
                return "";
            }
            return strFindLibrary;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAppLibPath Exception : ");
            sbLIZ.append(e.getMessage());
            CodecXLogging.e("realx Utils", C2188811AlT.LIZIZ(sbLIZ));
            throw e;
        }
    }

    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
            return;
        }
        throw new IllegalArgumentException("Application context cannot be null for CodecXContextUtils.initialize.");
    }
}
