package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftLockInfo_ProtoDecoder implements C0IMD<GiftLockInfo> {
    public static GiftLockInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftLockInfo giftLockInfo = new GiftLockInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftLockInfo.mLock = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        giftLockInfo.mLockType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        giftLockInfo.giftLevel = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        giftLockInfo.highlightEnabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        giftLockInfo.unlockButtonText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftLockInfo.unlockSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftLockInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftLockInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftLockInfo giftLockInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftLockInfo giftLockInfo, List list) {
    }
}
