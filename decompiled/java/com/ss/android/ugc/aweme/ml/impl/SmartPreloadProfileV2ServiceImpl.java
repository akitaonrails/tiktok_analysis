package com.ss.android.ugc.aweme.ml.impl;

import X.C2188811AlT;
import X.C740120T1m;
import X.C740130T1n;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class SmartPreloadProfileV2ServiceImpl extends SmartPreloadProfileV2Service {
    public static final /* synthetic */ int LIZIZ = 0;
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service
    public final boolean enable() {
        return C740130T1n.LIZ.LIZ != null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public final boolean ensureEvaluatorAvailable() {
        C740130T1n.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public final float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2) {
        long jCurrentTimeMillis;
        if (aweme == null) {
            return -1.0f;
        }
        C740120T1m c740120T1m = SmartPreloadProfileV2Service.Companion;
        c740120T1m.getClass();
        if (enable()) {
            this.LIZ = false;
            try {
                c740120T1m.getClass();
                boolean z = SmartPreloadProfileV2Service.debug;
                long jCurrentTimeMillis2 = 0;
                if (z) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                } else {
                    jCurrentTimeMillis = 0;
                }
                c740120T1m.getClass();
                if (z) {
                    System.currentTimeMillis();
                }
                C740130T1n.LIZ.getClass();
                c740120T1m.getClass();
                if (z) {
                    System.currentTimeMillis();
                }
                if (map2.containsKey("label")) {
                    c740120T1m.getClass();
                    if (z) {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                    }
                    String str = (String) map2.get("label");
                    Object obj = map2.get("probability");
                    c740120T1m.getClass();
                    if (z) {
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SmartPreloadProfileV2Service aid:");
                        sbLIZ.append(aweme.getAid());
                        sbLIZ.append(" out:");
                        sbLIZ.append(str);
                        sbLIZ.append(" probability:");
                        sbLIZ.append(obj);
                        sbLIZ.append(" outCost:");
                        sbLIZ.append(jCurrentTimeMillis3);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (!(obj instanceof Float)) {
                        return -1.0f;
                    }
                    return ((Number) obj).floatValue();
                }
                this.LIZ = true;
                c740120T1m.getClass();
                if (z) {
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SmartPreloadProfileV2Service end cost:");
                    sbLIZ2.append(jCurrentTimeMillis4);
                    sbLIZ2.append(", aid:");
                    sbLIZ2.append(aweme.getAid());
                    sbLIZ2.append(" lastRunFailed:");
                    sbLIZ2.append(this.LIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return -1.0f;
                }
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    return -1.0f;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return -1.0f;
    }
}
