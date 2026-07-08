package com.bytedance.pitaya.inner.thridpart;

import X.C2188811AlT;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class DelegateCoreEventReport implements ReflectionCall {
    public static final DelegateCoreEventReport INSTANCE = new DelegateCoreEventReport();
    public static String appVer = "No Version";
    public static boolean sampled;

    static {
        sampled = Math.random() < 0.001d;
    }

    private final String getCurrentPageName() {
        return "unknown";
    }

    private final void reportEvent(String str, JSONObject jSONObject) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EventReportProvider not set, event not reported: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void notReadyCall$pitayacore_release(String str, String str2) throws JSONException {
        if (!sampled) {
            return;
        }
        JSONObject jSONObjectPut = new JSONObject().put("app_ver", appVer).put("sdk_ver", "2.13.0").put("sdk_build_ver", "2.14.132-bugfix-je-r21e").put("nm", str2).put("call", "api").put("aid", str).put("rst", PTYErrorCode.PITAYA_IMPL_NOT_READY.getCode()).put("pg", getCurrentPageName());
        if (Build.VERSION.SDK_INT >= 24) {
            jSONObjectPut.put("dur", (SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime()) / 1000.0d);
        }
        reportEvent("pitaya22_task", jSONObjectPut);
    }
}
