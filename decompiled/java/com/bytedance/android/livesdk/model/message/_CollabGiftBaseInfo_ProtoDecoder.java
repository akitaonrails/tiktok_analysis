package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _CollabGiftBaseInfo_ProtoDecoder implements C0IMD<CollabGiftBaseInfo> {
    public static CollabGiftBaseInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CollabGiftBaseInfo collabGiftBaseInfo = new CollabGiftBaseInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        collabGiftBaseInfo.collabSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        collabGiftBaseInfo.triggerReceiverId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        collabGiftBaseInfo.triggerSenderId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        collabGiftBaseInfo.appId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        collabGiftBaseInfo.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        collabGiftBaseInfo.triggerGiftId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        collabGiftBaseInfo.fuelGiftId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        collabGiftBaseInfo.liveId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return collabGiftBaseInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final CollabGiftBaseInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CollabGiftBaseInfo collabGiftBaseInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CollabGiftBaseInfo collabGiftBaseInfo, List list) {
    }
}
