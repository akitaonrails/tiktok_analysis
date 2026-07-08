package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizImage_ProtoDecoder implements C0IMD<QuizImage> {
    public static QuizImage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizImage quizImage = new QuizImage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    quizImage.url = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizImage;
            }
        }
    }

    @Override // X.C0IMD
    public final QuizImage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(QuizImage quizImage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizImage quizImage, List list) {
    }
}
