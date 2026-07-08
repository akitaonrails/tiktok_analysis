package com.heytap.mcssdk.utils;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.PushService;

/* JADX INFO: loaded from: classes14.dex */
public class DataMessageUtil {
    public static final String TYPE = "type";

    public void appArrive(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(PushService.a.a.getReceiveSdkAction(context));
            intent.setPackage(PushService.a.a.getMcsPackageName(context));
            intent.putExtra("appPackage", context.getPackageName());
            intent.putExtra("messageID", str);
            intent.putExtra("type", 12312);
            C786410Ut5.s3(context, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("statisticMessage--Exception");
            sbLIZ.append(e.getMessage());
            e.e(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
