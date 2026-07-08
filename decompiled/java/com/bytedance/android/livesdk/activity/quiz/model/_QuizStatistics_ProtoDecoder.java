package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.activity.quiz.model.QuizStatistics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizStatistics_ProtoDecoder implements C0IMD<QuizStatistics> {
    public static QuizStatistics LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizStatistics quizStatistics = new QuizStatistics();
        quizStatistics.optionCount = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    quizStatistics.optionCount.add(_QuizStatistics_OptionCountItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizStatistics;
            }
        }
    }

    public static void LJ(QuizStatistics quizStatistics) {
        List<QuizStatistics.OptionCountItem> list = quizStatistics.optionCount;
        if (list == null) {
            quizStatistics.optionCount = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<QuizStatistics.OptionCountItem> it2 = quizStatistics.optionCount.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuizStatistics quizStatistics) {
        LJ(quizStatistics);
    }

    @Override // X.C0IMD
    public final QuizStatistics LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizStatistics quizStatistics, List list) {
    }
}
