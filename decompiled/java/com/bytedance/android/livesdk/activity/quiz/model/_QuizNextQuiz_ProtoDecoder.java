package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizNextQuiz_ProtoDecoder implements C0IMD<QuizNextQuiz> {
    public static QuizNextQuiz LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizNextQuiz quizNextQuiz = new QuizNextQuiz();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    quizNextQuiz.endTime = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                quizNextQuiz.liveEventId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            quizNextQuiz.quizId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        quizNextQuiz.rewardAmount = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    quizNextQuiz.time = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizNextQuiz;
            }
        }
    }

    @Override // X.C0IMD
    public final QuizNextQuiz LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(QuizNextQuiz quizNextQuiz) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizNextQuiz quizNextQuiz, List list) {
    }
}
