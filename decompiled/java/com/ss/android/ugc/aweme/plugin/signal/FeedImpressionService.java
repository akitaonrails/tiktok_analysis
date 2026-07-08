package com.ss.android.ugc.aweme.plugin.signal;

import X.C01GW;
import X.C04TD;
import X.C1191804lQ;
import X.C386801es;
import X.C452501pT;
import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedImpressionService implements IFeedImpressionService {
    public final Map<String, Integer> LIZ = new LinkedHashMap();
    public final C01GW LIZIZ;
    public final int LIZJ;
    public int LIZLLL;

    public static IFeedImpressionService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IFeedImpressionService.class, false);
        if (objLIZ != null) {
            return (IFeedImpressionService) objLIZ;
        }
        if (C04TD.f3 == null) {
            synchronized (IFeedImpressionService.class) {
                if (C04TD.f3 == null) {
                    C04TD.f3 = new FeedImpressionService();
                }
            }
        }
        return C04TD.f3;
    }

    public FeedImpressionService() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1191804lQ());
        this.LIZIZ = c01gwLIZIZ;
        this.LIZJ = ((Keva) c01gwLIZIZ.getValue()).getInt("total_impression_count", 0);
        this.LIZLLL = ((Keva) c01gwLIZIZ.getValue()).getInt("total_impression_count", 0);
    }

    @Override // com.ss.android.ugc.aweme.plugin.signal.IFeedImpressionService
    public final void LIZIZ(String str) {
        if (str == null || this.LIZLLL == Integer.MAX_VALUE || this.LIZ.containsKey(str)) {
            return;
        }
        this.LIZ.put(str, Integer.valueOf(this.LIZ.size()));
        this.LIZLLL++;
        ((Keva) this.LIZIZ.getValue()).storeInt("total_impression_count", this.LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.plugin.signal.IFeedImpressionService
    public final int LIZ(String str, boolean z) {
        if (z) {
            return this.LIZ.size();
        }
        if (str == null) {
            return -1;
        }
        Integer num = (Integer) ((LinkedHashMap) this.LIZ).get(str);
        if (num != null) {
            return num.intValue();
        }
        return C386801es.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.plugin.signal.IFeedImpressionService
    public final int LIZJ(String str, boolean z) {
        int iIntValue;
        if (z) {
            return this.LIZJ + this.LIZ.size();
        }
        if (str == null) {
            return this.LIZLLL;
        }
        Integer num = (Integer) ((LinkedHashMap) this.LIZ).get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = C386801es.DEFAULT;
        }
        return this.LIZJ + iIntValue;
    }
}
