package com.bytedance.android.livesdk.goody_bag.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoodyBagCommonDetail_ProtoDecoder implements C0IMD<GoodyBagCommonDetail> {
    public static GoodyBagCommonDetail LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoodyBagCommonDetail goodyBagCommonDetail = new GoodyBagCommonDetail();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        goodyBagCommonDetail.winnerHeadcount = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        goodyBagCommonDetail.joinedHeadcount = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        goodyBagCommonDetail.participateMethod = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        goodyBagCommonDetail.participateMethodContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        goodyBagCommonDetail.openAt = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        goodyBagCommonDetail.countDownMinutes = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        goodyBagCommonDetail.participateThresholdSelected = _ParticipateThresholdSelected_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goodyBagCommonDetail;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GoodyBagCommonDetail goodyBagCommonDetail) {
    }

    @Override // X.C0IMD
    public final GoodyBagCommonDetail LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoodyBagCommonDetail goodyBagCommonDetail, List list) {
    }
}
