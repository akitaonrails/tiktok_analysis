package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.activity.quiz.model.QuizRewardRule;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizRewardRule_RewardItem_ProtoDecoder implements C0IMD<QuizRewardRule.RewardItem> {
    public static QuizRewardRule.RewardItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizRewardRule.RewardItem rewardItem = new QuizRewardRule.RewardItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        rewardItem.rewardAmount = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    rewardItem.rewardName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rewardItem;
            }
        }
    }

    @Override // X.C0IMD
    public final QuizRewardRule.RewardItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(QuizRewardRule.RewardItem rewardItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizRewardRule.RewardItem rewardItem, List list) {
    }
}
