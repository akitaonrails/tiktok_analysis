package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizQuestionOption_ProtoDecoder implements C0IMD<QuizQuestionOption> {
    public static QuizQuestionOption LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizQuestionOption quizQuestionOption = new QuizQuestionOption();
        quizQuestionOption.image = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            quizQuestionOption.image.add(_QuizImage_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        quizQuestionOption.content = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    quizQuestionOption.optionId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizQuestionOption;
            }
        }
    }

    public static void LJ(QuizQuestionOption quizQuestionOption) {
        List<QuizImage> list = quizQuestionOption.image;
        if (list == null) {
            quizQuestionOption.image = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<QuizImage> it2 = quizQuestionOption.image.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuizQuestionOption quizQuestionOption) {
        LJ(quizQuestionOption);
    }

    @Override // X.C0IMD
    public final QuizQuestionOption LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizQuestionOption quizQuestionOption, List list) {
    }
}
