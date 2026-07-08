package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftChallengeProgress;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftChallengeProgress_ProtoDecoder implements C0IMD<GiftChallengeProgress> {
    public static GiftChallengeProgress LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftChallengeProgress giftChallengeProgress = new GiftChallengeProgress();
        giftChallengeProgress.stageData = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                giftChallengeProgress.challengeId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            giftChallengeProgress.stageData.add(_GiftChallengeProgress_StageData_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        giftChallengeProgress.currentPoints = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftChallengeProgress.status = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftChallengeProgress;
            }
        }
    }

    public static void LJ(GiftChallengeProgress giftChallengeProgress) {
        List<GiftChallengeProgress.StageData> list = giftChallengeProgress.stageData;
        if (list == null) {
            giftChallengeProgress.stageData = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<GiftChallengeProgress.StageData> it2 = giftChallengeProgress.stageData.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftChallengeProgress giftChallengeProgress) {
        LJ(giftChallengeProgress);
    }

    @Override // X.C0IMD
    public final GiftChallengeProgress LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftChallengeProgress giftChallengeProgress, List list) {
    }
}
