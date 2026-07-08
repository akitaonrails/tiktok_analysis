package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data._BagItemPreUpdateInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _BackpackInfo_ProtoDecoder implements C0IMD<BackpackInfo> {
    public static BackpackInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BackpackInfo backpackInfo = new BackpackInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        backpackInfo.itemType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        backpackInfo.itemId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        backpackInfo.count = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        backpackInfo.minExpireAt = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        backpackInfo.available = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        backpackInfo.preUpdateInfo = _BagItemPreUpdateInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        backpackInfo.battleId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return backpackInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BackpackInfo backpackInfo) {
    }

    @Override // X.C0IMD
    public final BackpackInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BackpackInfo backpackInfo, List list) {
    }
}
