package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_PortraitInfo_UserMetrics_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.PortraitInfo.UserMetrics> {
    public static PublicAreaMessageCommon.PortraitInfo.UserMetrics LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.PortraitInfo.UserMetrics userMetrics = new PublicAreaMessageCommon.PortraitInfo.UserMetrics();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        userMetrics.metricsValue = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    userMetrics.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userMetrics;
            }
        }
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.PortraitInfo.UserMetrics LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PublicAreaMessageCommon.PortraitInfo.UserMetrics userMetrics) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.PortraitInfo.UserMetrics userMetrics, List list) {
    }
}
