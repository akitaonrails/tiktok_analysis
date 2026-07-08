package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftKeywords_ProtoDecoder implements C0IMD<GiftKeywords> {
    public static GiftKeywords LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftKeywords giftKeywords = new GiftKeywords();
        giftKeywords.keywords = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftKeywords.keywords.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    giftKeywords.giftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftKeywords;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftKeywords giftKeywords) {
        GiftKeywords giftKeywords2 = giftKeywords;
        if (giftKeywords2.keywords == null) {
            giftKeywords2.keywords = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftKeywords LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftKeywords giftKeywords, List list) {
    }
}
