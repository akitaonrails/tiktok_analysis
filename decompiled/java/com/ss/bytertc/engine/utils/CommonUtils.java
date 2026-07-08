package com.ss.bytertc.engine.utils;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CommonUtils {
    public static boolean isInForeground(Context context) throws Throwable {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> listLJII = C2204961BRm.LJII(activityManager, new C0WZX("dzBzEhEpEcjFQVIzURHKY0i/duFJK+IWVf8rKO45oLlEMqTOiOQK", null));
        if (listLJII == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listLJII) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }
}
