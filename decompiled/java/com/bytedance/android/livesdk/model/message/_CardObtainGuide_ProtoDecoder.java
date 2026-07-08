package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CardObtainGuide_ProtoDecoder implements C0IMD<CardObtainGuide> {
    public static CardObtainGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CardObtainGuide cardObtainGuide = new CardObtainGuide();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    cardObtainGuide.notInUse = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cardObtainGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final CardObtainGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CardObtainGuide cardObtainGuide) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CardObtainGuide cardObtainGuide, List list) {
    }
}
