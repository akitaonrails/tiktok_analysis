package com.bytedance.android.livesdk.boostcard;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BoostedUsersPoint_ProtoDecoder implements C0IMD<BoostedUsersPoint> {
    public static BoostedUsersPoint LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BoostedUsersPoint boostedUsersPoint = new BoostedUsersPoint();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        boostedUsersPoint.mTotalUsers = c1516680pZS.LJIIJJI();
                    }
                } else {
                    boostedUsersPoint.mPointTimeStamp = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return boostedUsersPoint;
            }
        }
    }

    @Override // X.C0IMD
    public final BoostedUsersPoint LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BoostedUsersPoint boostedUsersPoint) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BoostedUsersPoint boostedUsersPoint, List list) {
    }
}
