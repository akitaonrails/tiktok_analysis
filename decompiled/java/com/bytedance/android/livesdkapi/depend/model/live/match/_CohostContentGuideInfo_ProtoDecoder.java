package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostContentGuideInfo_ProtoDecoder implements C0IMD<CohostContentGuideInfo> {
    public static CohostContentGuideInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostContentGuideInfo cohostContentGuideInfo = new CohostContentGuideInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    cohostContentGuideInfo.recommendedBattleType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostContentGuideInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final CohostContentGuideInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CohostContentGuideInfo cohostContentGuideInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostContentGuideInfo cohostContentGuideInfo, List list) {
    }
}
