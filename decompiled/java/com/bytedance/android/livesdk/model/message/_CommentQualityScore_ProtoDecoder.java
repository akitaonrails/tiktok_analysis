package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CommentQualityScore_ProtoDecoder implements C0IMD<CommentQualityScore> {
    public static CommentQualityScore LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CommentQualityScore commentQualityScore = new CommentQualityScore();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        commentQualityScore.score = c1516680pZS.LJIIJJI();
                    }
                } else {
                    commentQualityScore.version = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commentQualityScore;
            }
        }
    }

    @Override // X.C0IMD
    public final CommentQualityScore LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CommentQualityScore commentQualityScore) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommentQualityScore commentQualityScore, List list) {
    }
}
