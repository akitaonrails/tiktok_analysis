package com.heytap.mcssdk;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class d {
    public static boolean a(Context context, Intent intent, Object obj) {
        String str;
        if (context == null) {
            str = "context is null , please check param of parseIntent()";
        } else if (intent == null) {
            str = "intent is null , please check param of parseIntent()";
        } else if (obj == null) {
            str = "callback is null , please check param of parseIntent()";
        } else {
            if (Utils.isSupportPushByClient(context)) {
                return false;
            }
            str = "push is null ,please check system has push";
        }
        e.e(str);
        return true;
    }

    public static void a(Context context, Intent intent, IDataMessageCallBackService iDataMessageCallBackService) {
        if (a(context, intent, (Object) iDataMessageCallBackService)) {
            return;
        }
        List<BaseMode> listA = com.heytap.mcssdk.d.d.a(context, intent, PushService.a.a.getParsers());
        if (listA != null && !listA.isEmpty()) {
            for (BaseMode baseMode : listA) {
                if (baseMode != null) {
                    for (com.heytap.mcssdk.e.c cVar : PushService.a.a.getProcessors()) {
                        if (cVar != null) {
                            cVar.a(context, intent, baseMode, iDataMessageCallBackService);
                        }
                    }
                }
            }
            return;
        }
        e.b("Empty message after parsing intent.");
    }
}
