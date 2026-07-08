package com.bytedance.android.livesdk.impl.revenue.strategy.guide;

import X.C098200Yq;
import X.C0IJT;
import X.C183100n7;
import X.C189200o6;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class LiveAlgoPkgLogSendMessageHandler implements PTYMessageHandler {
    public static final LiveAlgoPkgLogSendMessageHandler INSTANCE = new LiveAlgoPkgLogSendMessageHandler();
    public static final AtomicBoolean registered = new AtomicBoolean(false);
    public static final int $stable = 8;

    public final void register() {
        if (registered.compareAndSet(false, true)) {
            LivePitayaEnv.LJIIL().registerMessageHandler("live_algo_pkg_log_send", this);
        }
    }

    public final void unregister() {
        if (registered.compareAndSet(true, false)) {
            LivePitayaEnv.LJIIL().removeMessageHandler("live_algo_pkg_log_send");
        }
    }

    @Override // com.bytedance.pitaya.api.PTYMessageHandler
    public JSONObject onMessage(JSONObject jSONObject) {
        try {
            String strLIZJ = C183100n7.LIZJ("event_name", jSONObject);
            int iLIZIZ = C183100n7.LIZIZ(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            if (!a0.LJJJIL(strLIZJ) && iLIZIZ > 0) {
                if ((iLIZIZ & 1) != 0) {
                    reportToALog(strLIZJ, jSONObjectOptJSONObject);
                }
                if ((iLIZIZ & 2) != 0) {
                    reportToTea(strLIZJ, jSONObjectOptJSONObject);
                }
                if ((iLIZIZ & 4) != 0) {
                    reportToSlardar(strLIZJ, jSONObjectOptJSONObject);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    private final void reportToALog(String str, JSONObject jSONObject) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ttlive_client_ai]");
            sbLIZ.append(str);
            C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(jSONObject));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    private final void reportToSlardar(String str, JSONObject jSONObject) {
        try {
            C1CC2.LIZJ(str, new JSONObject(), null, jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    private final void reportToTea(String str, JSONObject jSONObject) {
        try {
            C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
            c474500IjALIZ.LJJIIJZLJL(jSONObject);
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
