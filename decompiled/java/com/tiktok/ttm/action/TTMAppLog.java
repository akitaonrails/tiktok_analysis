package com.tiktok.ttm.action;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.ttm.TTMCore;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class TTMAppLog {
    public static TTMCore.SendAppLog appLogCallBack;

    public static void initAppLogCallBack(TTMCore.SendAppLog sendAppLog) {
        appLogCallBack = sendAppLog;
    }

    public static boolean jniSendAppLog(String str, Map<String, Object> map) {
        try {
            if (TextUtils.isEmpty(str) || map == null) {
                return false;
            }
            sendAppLog(str, new JSONObject(map));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void sendAppLog(String str, JSONObject jSONObject) {
        TTMCore.SendAppLog sendAppLog = appLogCallBack;
        if (sendAppLog != null) {
            sendAppLog.sendAppLog(str, jSONObject);
        }
    }
}
