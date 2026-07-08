package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizCallUpWebview_ProtoDecoder implements C0IMD<QuizCallUpWebview> {
    public static QuizCallUpWebview LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizCallUpWebview quizCallUpWebview = new QuizCallUpWebview();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        quizCallUpWebview.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        quizCallUpWebview.quizId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        quizCallUpWebview.quizType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        quizCallUpWebview.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        quizCallUpWebview.userDataVersion = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        quizCallUpWebview.sponsorCode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        quizCallUpWebview.displayDurationMs = c1516680pZS.LJIIJ();
                        break;
                    default:
                        switch (iLJI) {
                            case 51:
                                quizCallUpWebview.extra1 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 52:
                                quizCallUpWebview.extra2 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 53:
                                quizCallUpWebview.extra3 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 54:
                                quizCallUpWebview.extra4 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 55:
                                quizCallUpWebview.extra5 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizCallUpWebview;
            }
        }
    }

    @Override // X.C0IMD
    public final QuizCallUpWebview LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(QuizCallUpWebview quizCallUpWebview) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizCallUpWebview quizCallUpWebview, List list) {
    }
}
