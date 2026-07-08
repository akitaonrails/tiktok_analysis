package com.bytedance.apm.agent.instrumentation;

import X.C08MZ;
import X.C2140508a3;
import X.C792400V6o;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ThreadMonitor {
    public static boolean isDebuggable() {
        Context context = C792400V6o.LIZ;
        Boolean bool = C08MZ.LIZIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            Boolean boolValueOf = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
            C08MZ.LIZIZ = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean isLocalChannel() {
        JSONObject jSONObject = C792400V6o.LJFF;
        if (jSONObject == null || jSONObject.optString("channel") == null) {
            return false;
        }
        return C792400V6o.LJFF.optString("channel").contains("local");
    }

    public static void sleepMonitor(long j) throws InterruptedException {
        if (C2140508a3.LIZ() && j > 10 && !isDebuggable()) {
            isLocalChannel();
        }
        Thread.sleep(j);
    }
}
