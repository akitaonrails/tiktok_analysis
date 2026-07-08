package com.ss.android.ugc.aweme.commercialize.engagement.trace;

import X.C04TD;
import X.C2097608Jq;
import X.C583160Mu2;
import com.ss.android.ugc.aweme.commercialize.service.AdOmSdkManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class EngagementTraceImpl implements EngagementTrace {
    public final AdOmSdkManagerService LIZ = (AdOmSdkManagerService) ServiceManager.get().getService(AdOmSdkManagerService.class);

    @Override // com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTrace
    public final synchronized Map<String, Object> LIZ() {
        Pair[] pairArr;
        pairArr = new Pair[2];
        long currentPosition = this.LIZ.getCurrentPosition();
        if (currentPosition < 0) {
            currentPosition = this.LIZ.LIZ() < 0 ? this.LIZ.LIZIZ() : this.LIZ.LIZ();
        }
        pairArr[0] = new Pair("duration", Long.valueOf(currentPosition));
        pairArr[1] = new Pair("play_order", Integer.valueOf(C583160Mu2.LIZLLL ? C583160Mu2.LIZ() + 1 : this.LIZ.LJJLIL()));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static EngagementTrace LIZIZ() {
        Object objLIZ = C04TD.LIZ(EngagementTrace.class, false);
        if (objLIZ != null) {
            return (EngagementTrace) objLIZ;
        }
        if (C04TD.LLLFF == null) {
            synchronized (EngagementTrace.class) {
                if (C04TD.LLLFF == null) {
                    C04TD.LLLFF = new EngagementTraceImpl();
                }
            }
        }
        return C04TD.LLLFF;
    }
}
