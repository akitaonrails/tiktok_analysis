package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostABInfo_ProtoDecoder implements C0IMD<CohostABInfo> {
    public static CohostABInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostABInfo cohostABInfo = new CohostABInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    cohostABInfo.isMatchPlaybookOptimisationEnabled = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                cohostABInfo.isCohostDuringMultiguestEnabled = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            cohostABInfo.isMatchPlaybookEnabled = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        cohostABInfo.isCohostMultiguest = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    cohostABInfo.liveMatchButtonOpt = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostABInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final CohostABInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CohostABInfo cohostABInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostABInfo cohostABInfo, List list) {
    }
}
