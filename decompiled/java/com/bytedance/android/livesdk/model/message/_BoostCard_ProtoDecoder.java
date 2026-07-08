package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BoostCard_ProtoDecoder implements C0IMD<BoostCard> {
    public static BoostCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BoostCard boostCard = new BoostCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            boostCard.mTaskId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        boostCard.mTaskSource = c1516680pZS.LJIIJ();
                    }
                } else {
                    boostCard.mCardId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return boostCard;
            }
        }
    }

    @Override // X.C0IMD
    public final BoostCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BoostCard boostCard) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BoostCard boostCard, List list) {
    }
}
