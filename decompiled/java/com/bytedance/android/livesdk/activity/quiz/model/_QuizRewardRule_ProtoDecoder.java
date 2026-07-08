package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.activity.quiz.model.QuizRewardRule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizRewardRule_ProtoDecoder implements C0IMD<QuizRewardRule> {
    public static QuizRewardRule LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizRewardRule quizRewardRule = new QuizRewardRule();
        quizRewardRule.rewardList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            quizRewardRule.rewardList.add(_QuizRewardRule_RewardItem_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        quizRewardRule.sendAmount = c1516680pZS.LJIIJ();
                    }
                } else {
                    quizRewardRule.settlerCode = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizRewardRule;
            }
        }
    }

    public static void LJ(QuizRewardRule quizRewardRule) {
        List<QuizRewardRule.RewardItem> list = quizRewardRule.rewardList;
        if (list == null) {
            quizRewardRule.rewardList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<QuizRewardRule.RewardItem> it2 = quizRewardRule.rewardList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuizRewardRule quizRewardRule) {
        LJ(quizRewardRule);
    }

    @Override // X.C0IMD
    public final QuizRewardRule LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizRewardRule quizRewardRule, List list) {
    }
}
