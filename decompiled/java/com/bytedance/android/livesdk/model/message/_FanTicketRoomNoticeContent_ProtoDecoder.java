package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FanTicketRoomNoticeContent_ProtoDecoder implements C0IMD<FanTicketRoomNoticeContent> {
    public static FanTicketRoomNoticeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent = new FanTicketRoomNoticeContent();
        fanTicketRoomNoticeContent.userFanTicket = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        fanTicketRoomNoticeContent.userFanTicket.add(_UserFanTicket_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        fanTicketRoomNoticeContent.totalLinkmicFanTicket = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        fanTicketRoomNoticeContent.matchId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        fanTicketRoomNoticeContent.eventTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        fanTicketRoomNoticeContent.fanTicketIconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        fanTicketRoomNoticeContent.playId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        fanTicketRoomNoticeContent.playScene = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        fanTicketRoomNoticeContent.version = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        fanTicketRoomNoticeContent.scoreType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fanTicketRoomNoticeContent;
            }
        }
    }

    public static void LJ(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        List<UserFanTicket> list = fanTicketRoomNoticeContent.userFanTicket;
        if (list == null) {
            fanTicketRoomNoticeContent.userFanTicket = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<UserFanTicket> it2 = fanTicketRoomNoticeContent.userFanTicket.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        LJ(fanTicketRoomNoticeContent);
    }

    @Override // X.C0IMD
    public final FanTicketRoomNoticeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FanTicketRoomNoticeContent fanTicketRoomNoticeContent, List list) {
    }
}
