package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalExtraInfo_ReserveInfo_ProtoDecoder implements C0IMD<RivalExtraInfo.ReserveInfo> {
    public static RivalExtraInfo.ReserveInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalExtraInfo.ReserveInfo reserveInfo = new RivalExtraInfo.ReserveInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        reserveInfo.reservationId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        reserveInfo.replyStatus = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        reserveInfo.bubbleTip = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        reserveInfo.responseTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        reserveInfo.isReservationSender = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        reserveInfo.createdTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        reserveInfo.viewed = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return reserveInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final RivalExtraInfo.ReserveInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RivalExtraInfo.ReserveInfo reserveInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalExtraInfo.ReserveInfo reserveInfo, List list) {
    }
}
