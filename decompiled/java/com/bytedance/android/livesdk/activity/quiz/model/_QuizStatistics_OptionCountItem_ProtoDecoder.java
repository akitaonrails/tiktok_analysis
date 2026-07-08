package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.activity.quiz.model.QuizStatistics;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizStatistics_OptionCountItem_ProtoDecoder implements C0IMD<QuizStatistics.OptionCountItem> {
    public static QuizStatistics.OptionCountItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizStatistics.OptionCountItem optionCountItem = new QuizStatistics.OptionCountItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        optionCountItem.count = c1516680pZS.LJIIJ();
                    }
                } else {
                    optionCountItem.optionId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return optionCountItem;
            }
        }
    }

    @Override // X.C0IMD
    public final QuizStatistics.OptionCountItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(QuizStatistics.OptionCountItem optionCountItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizStatistics.OptionCountItem optionCountItem, List list) {
    }
}
