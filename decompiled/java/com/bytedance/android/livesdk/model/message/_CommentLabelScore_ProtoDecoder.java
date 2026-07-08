package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CommentLabelScore_ProtoDecoder implements C0IMD<CommentLabelScore> {
    public static CommentLabelScore LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CommentLabelScore commentLabelScore = new CommentLabelScore();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        commentLabelScore.score = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                    }
                } else {
                    commentLabelScore.labelName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commentLabelScore;
            }
        }
    }

    @Override // X.C0IMD
    public final CommentLabelScore LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CommentLabelScore commentLabelScore) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommentLabelScore commentLabelScore, List list) {
    }
}
