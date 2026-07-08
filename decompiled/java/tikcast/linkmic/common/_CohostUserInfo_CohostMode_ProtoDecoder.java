package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common.CohostUserInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostUserInfo_CohostMode_ProtoDecoder implements C0IMD<CohostUserInfo.CohostMode> {
    public static CohostUserInfo.CohostMode LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostUserInfo.CohostMode cohostMode = new CohostUserInfo.CohostMode();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        cohostMode.highestTakeTheStageVersionSupported = c1516680pZS.LJIIJJI();
                    }
                } else {
                    cohostMode.isTakeTheStageV2Supported = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostMode;
            }
        }
    }

    @Override // X.C0IMD
    public final CohostUserInfo.CohostMode LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CohostUserInfo.CohostMode cohostMode) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostUserInfo.CohostMode cohostMode, List list) {
    }
}
