package com.bytedance.android.livesdk.service.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftListExtra_ProtoDecoder implements C0IMD<GiftListExtra> {
    @Override // X.C0IMD
    public final GiftListExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftListExtra giftListExtra = new GiftListExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftListExtra.logId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftListExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftListExtra giftListExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftListExtra giftListExtra, List list) {
    }
}
