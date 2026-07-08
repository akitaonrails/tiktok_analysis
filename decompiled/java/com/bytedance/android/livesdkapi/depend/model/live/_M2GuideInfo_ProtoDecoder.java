package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _M2GuideInfo_ProtoDecoder implements C0IMD<M2GuideInfo> {
    public static M2GuideInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        M2GuideInfo m2GuideInfo = new M2GuideInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        m2GuideInfo.showAccountRecover = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    m2GuideInfo.showM2Guide = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return m2GuideInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final M2GuideInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(M2GuideInfo m2GuideInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, M2GuideInfo m2GuideInfo, List list) {
    }
}
