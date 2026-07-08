package com.ss.android.ugc.aweme.ml.impl;

import X.C0T1B;
import X.C0T1U;
import X.C0T1X;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.model.PreloadCommentMLModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class SmartPreloadCommentV2ServiceImpl extends SmartPreloadCommentV2Service {
    public static final /* synthetic */ int LIZIZ = 0;
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service
    public final boolean enable(String str) {
        if (((LinkedHashMap) C0T1U.LIZ.LIZ).get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final boolean ensureEvaluatorAvailable(String str) {
        C0T1U.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final float getClientAIThreshold(String str) {
        PreloadCommentMLModel preloadCommentMLModel;
        C0T1X c0t1x = (C0T1X) ((LinkedHashMap) C0T1U.LIZ.LIZ).get(str);
        if (c0t1x != null && (preloadCommentMLModel = c0t1x.LIZ) != null) {
            return preloadCommentMLModel.getClientAIThreshold();
        }
        return Float.MAX_VALUE;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final float smartJudge(String str, Aweme aweme, Map<String, Object> map, Map<String, Object> map2) {
        long jCurrentTimeMillis;
        if (aweme == null) {
            return -1.0f;
        }
        C0T1B c0t1b = SmartPreloadCommentV2Service.Companion;
        c0t1b.getClass();
        if (enable(str)) {
            this.LIZ = false;
            try {
                c0t1b.getClass();
                boolean z = SmartPreloadCommentV2Service.debug;
                long jCurrentTimeMillis2 = 0;
                if (z) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                } else {
                    jCurrentTimeMillis = 0;
                }
                c0t1b.getClass();
                if (z) {
                    System.currentTimeMillis();
                }
                c0t1b.getClass();
                if (z) {
                    System.currentTimeMillis();
                }
                if (map2.containsKey("label")) {
                    c0t1b.getClass();
                    if (z) {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                    }
                    String str2 = (String) map2.get("label");
                    Object obj = map2.get("probability");
                    c0t1b.getClass();
                    if (z) {
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SmartPreloadCommentV2Service aid:");
                        sbLIZ.append(aweme.getAid());
                        sbLIZ.append(" out:");
                        sbLIZ.append(str2);
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
                c0t1b.getClass();
                if (z) {
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SmartPreloadCommentV2Service end cost:");
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
