package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveGiftBoostCardRoomStatus_ProtoDecoder implements C0IMD<LiveGiftBoostCardRoomStatus> {
    public static LiveGiftBoostCardRoomStatus LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus = new LiveGiftBoostCardRoomStatus();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveGiftBoostCardRoomStatus.mIsBoosting = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        liveGiftBoostCardRoomStatus.mExpiredTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        liveGiftBoostCardRoomStatus.mCardId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        liveGiftBoostCardRoomStatus.mCardIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        liveGiftBoostCardRoomStatus.mTaskId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveGiftBoostCardRoomStatus.mTaskSource = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        liveGiftBoostCardRoomStatus.mImagePath = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveGiftBoostCardRoomStatus;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveGiftBoostCardRoomStatus LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus, List list) {
    }
}
