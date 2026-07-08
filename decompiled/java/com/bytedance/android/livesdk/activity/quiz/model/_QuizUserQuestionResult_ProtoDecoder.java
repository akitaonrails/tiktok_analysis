package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizUserQuestionResult_ProtoDecoder implements C0IMD<QuizUserQuestionResult> {
    public static QuizUserQuestionResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizUserQuestionResult quizUserQuestionResult = new QuizUserQuestionResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        quizUserQuestionResult.correctAnswer = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        quizUserQuestionResult.userAnswer = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        quizUserQuestionResult.questionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        quizUserQuestionResult.questionNo = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        quizUserQuestionResult.simpleUserAnswer = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        quizUserQuestionResult.isUseRespawn = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizUserQuestionResult;
            }
        }
    }

    @Override // X.C0IMD
    public final QuizUserQuestionResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(QuizUserQuestionResult quizUserQuestionResult) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizUserQuestionResult quizUserQuestionResult, List list) {
    }
}
