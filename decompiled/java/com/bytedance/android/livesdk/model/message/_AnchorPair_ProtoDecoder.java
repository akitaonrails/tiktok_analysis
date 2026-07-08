package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorPair_ProtoDecoder implements C0IMD<AnchorPair> {
    public static AnchorPair LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorPair anchorPair = new AnchorPair();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorPair.targetAnchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    anchorPair.sourceAnchorId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorPair;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorPair LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorPair anchorPair) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorPair anchorPair, List list) {
    }
}
