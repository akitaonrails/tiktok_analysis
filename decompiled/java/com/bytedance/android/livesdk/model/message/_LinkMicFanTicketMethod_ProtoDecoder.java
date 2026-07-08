package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicFanTicketMethod_ProtoDecoder implements C0IMD<LinkMicFanTicketMethod> {
    public static LinkMicFanTicketMethod LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkMicFanTicketMethod linkMicFanTicketMethod = new LinkMicFanTicketMethod();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        linkMicFanTicketMethod.fanTicketRoomNotice = _FanTicketRoomNoticeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkMicFanTicketMethod.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicFanTicketMethod;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkMicFanTicketMethod linkMicFanTicketMethod) {
        LinkMicFanTicketMethod linkMicFanTicketMethod2 = linkMicFanTicketMethod;
        CommonMessageData commonMessageData = linkMicFanTicketMethod2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent = linkMicFanTicketMethod2.fanTicketRoomNotice;
        if (fanTicketRoomNoticeContent != null) {
            _FanTicketRoomNoticeContent_ProtoDecoder.LJ(fanTicketRoomNoticeContent);
        }
    }

    @Override // X.C0IMD
    public final LinkMicFanTicketMethod LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicFanTicketMethod linkMicFanTicketMethod, List list) {
    }
}
