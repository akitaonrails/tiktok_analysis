package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FlareInfo_ProtoDecoder implements C0IMD<FlareInfo> {
    public static FlareInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FlareInfo flareInfo = new FlareInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        flareInfo.taskId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    flareInfo.isFlare = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return flareInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final FlareInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FlareInfo flareInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FlareInfo flareInfo, List list) {
    }
}
