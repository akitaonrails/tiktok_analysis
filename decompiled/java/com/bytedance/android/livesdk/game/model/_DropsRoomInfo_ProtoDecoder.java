package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DropsRoomInfo_ProtoDecoder implements C0IMD<DropsRoomInfo> {
    public static DropsRoomInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DropsRoomInfo dropsRoomInfo = new DropsRoomInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        dropsRoomInfo.showClaimDropsGiftNotice = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        dropsRoomInfo.earliestGiftExpireTs = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        dropsRoomInfo.dropsListEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        dropsRoomInfo.showDropsTag = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        dropsRoomInfo.promotingDropsId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        dropsRoomInfo.promotingDropsGameId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        dropsRoomInfo.promotingDropsGameNameForReport = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return dropsRoomInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final DropsRoomInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(DropsRoomInfo dropsRoomInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DropsRoomInfo dropsRoomInfo, List list) {
    }
}
