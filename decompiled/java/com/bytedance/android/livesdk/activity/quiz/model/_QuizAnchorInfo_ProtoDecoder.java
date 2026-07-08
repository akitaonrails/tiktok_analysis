package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizAnchorInfo_ProtoDecoder implements C0IMD<QuizAnchorInfo> {
    public static QuizAnchorInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizAnchorInfo quizAnchorInfo = new QuizAnchorInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        quizAnchorInfo.uid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        quizAnchorInfo.userName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        quizAnchorInfo.roomId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        quizAnchorInfo.category = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        quizAnchorInfo.description = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        quizAnchorInfo.avatar = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        quizAnchorInfo.backgroundImage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        quizAnchorInfo.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizAnchorInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final QuizAnchorInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(QuizAnchorInfo quizAnchorInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizAnchorInfo quizAnchorInfo, List list) {
    }
}
