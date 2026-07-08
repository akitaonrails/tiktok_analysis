package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CollabGiftStage_ProtoDecoder implements C0IMD<CollabGiftStage> {
    public static CollabGiftStage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CollabGiftStage collabGiftStage = new CollabGiftStage();
        collabGiftStage.contributors = new ArrayList();
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
                                collabGiftStage.campaignBonusScore = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            collabGiftStage.contributors.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        collabGiftStage.maxScore = c1516680pZS.LJIIJJI();
                    }
                } else {
                    collabGiftStage.score = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return collabGiftStage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CollabGiftStage collabGiftStage) {
        CollabGiftStage collabGiftStage2 = collabGiftStage;
        if (collabGiftStage2.contributors == null) {
            collabGiftStage2.contributors = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final CollabGiftStage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CollabGiftStage collabGiftStage, List list) {
    }
}
