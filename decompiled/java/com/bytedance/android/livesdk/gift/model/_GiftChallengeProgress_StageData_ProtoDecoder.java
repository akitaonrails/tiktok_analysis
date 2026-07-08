package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftChallengeProgress;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftChallengeProgress_StageData_ProtoDecoder implements C0IMD<GiftChallengeProgress.StageData> {
    public static GiftChallengeProgress.StageData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftChallengeProgress.StageData stageData = new GiftChallengeProgress.StageData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        stageData.giftId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    stageData.totalPoints = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return stageData;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftChallengeProgress.StageData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftChallengeProgress.StageData stageData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftChallengeProgress.StageData stageData, List list) {
    }
}
