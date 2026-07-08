package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPickWithScore_ProtoDecoder implements C0IMD<GiftPickWithScore> {
    public static GiftPickWithScore LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPickWithScore giftPickWithScore = new GiftPickWithScore();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftPickWithScore.score = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftPickWithScore.giftPick = _GiftPick_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPickWithScore;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPickWithScore giftPickWithScore) {
        GiftPick giftPick = giftPickWithScore.giftPick;
        if (giftPick != null) {
            _GiftPick_ProtoDecoder.LJ(giftPick);
        }
    }

    @Override // X.C0IMD
    public final GiftPickWithScore LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPickWithScore giftPickWithScore, List list) {
    }
}
