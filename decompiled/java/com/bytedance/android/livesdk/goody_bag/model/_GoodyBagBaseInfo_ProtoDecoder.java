package com.bytedance.android.livesdk.goody_bag.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoodyBagBaseInfo_ProtoDecoder implements C0IMD<GoodyBagBaseInfo> {
    public static GoodyBagBaseInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoodyBagBaseInfo goodyBagBaseInfo = new GoodyBagBaseInfo();
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
                                    goodyBagBaseInfo.coinDetail = _GoodyBagCoinDetail_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                goodyBagBaseInfo.commonDetail = _GoodyBagCommonDetail_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            goodyBagBaseInfo.roomId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        goodyBagBaseInfo.biz = c1516680pZS.LJIIJ();
                    }
                } else {
                    goodyBagBaseInfo.goodyBagId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goodyBagBaseInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GoodyBagBaseInfo goodyBagBaseInfo) {
    }

    @Override // X.C0IMD
    public final GoodyBagBaseInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoodyBagBaseInfo goodyBagBaseInfo, List list) {
    }
}
