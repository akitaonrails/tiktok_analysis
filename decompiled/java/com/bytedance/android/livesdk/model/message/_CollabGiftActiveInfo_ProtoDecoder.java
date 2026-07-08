package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CollabGiftActiveInfo_ProtoDecoder implements C0IMD<CollabGiftActiveInfo> {
    public static CollabGiftActiveInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CollabGiftActiveInfo collabGiftActiveInfo = new CollabGiftActiveInfo();
        collabGiftActiveInfo.contributors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        collabGiftActiveInfo.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        collabGiftActiveInfo.currentTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        collabGiftActiveInfo.expireTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        collabGiftActiveInfo.currentScore = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        collabGiftActiveInfo.maxScore = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        collabGiftActiveInfo.currentStage = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        collabGiftActiveInfo.maxStage = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        collabGiftActiveInfo.contributors.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return collabGiftActiveInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CollabGiftActiveInfo collabGiftActiveInfo) {
        CollabGiftActiveInfo collabGiftActiveInfo2 = collabGiftActiveInfo;
        if (collabGiftActiveInfo2.contributors == null) {
            collabGiftActiveInfo2.contributors = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final CollabGiftActiveInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CollabGiftActiveInfo collabGiftActiveInfo, List list) {
    }
}
