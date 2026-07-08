package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestApplyInfo_ProtoDecoder implements C0IMD<GuestApplyInfo> {
    public static GuestApplyInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestApplyInfo guestApplyInfo = new GuestApplyInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guestApplyInfo.applyStatus = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        guestApplyInfo.applyTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        guestApplyInfo.permitTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        guestApplyInfo.permitExpireTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        guestApplyInfo.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        guestApplyInfo.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        guestApplyInfo.preLinkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        guestApplyInfo.ownerNickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestApplyInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GuestApplyInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuestApplyInfo guestApplyInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestApplyInfo guestApplyInfo, List list) {
    }
}
