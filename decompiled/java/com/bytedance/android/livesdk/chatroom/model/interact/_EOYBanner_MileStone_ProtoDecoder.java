package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.EOYBanner;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EOYBanner_MileStone_ProtoDecoder implements C0IMD<EOYBanner.MileStone> {
    public static EOYBanner.MileStone LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EOYBanner.MileStone mileStone = new EOYBanner.MileStone();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        mileStone.bonusTimes = c1516680pZS.LJIIJJI();
                    }
                } else {
                    mileStone.targetValue = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mileStone;
            }
        }
    }

    @Override // X.C0IMD
    public final EOYBanner.MileStone LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EOYBanner.MileStone mileStone) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EOYBanner.MileStone mileStone, List list) {
    }
}
