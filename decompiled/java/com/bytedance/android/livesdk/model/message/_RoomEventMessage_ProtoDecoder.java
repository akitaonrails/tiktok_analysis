package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.EventUserInfo;
import webcast.data._EventUserInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomEventMessage_ProtoDecoder implements C0IMD<RoomEventMessage> {
    public static RoomEventMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomEventMessage roomEventMessage = new RoomEventMessage();
        roomEventMessage.eventUserInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        roomEventMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        roomEventMessage.eventId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        roomEventMessage.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        roomEventMessage.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        roomEventMessage.posX = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        roomEventMessage.posY = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        roomEventMessage.subscribedCount = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        roomEventMessage.configOpt = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        roomEventMessage.eventUserInfo.add(_EventUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomEventMessage;
            }
        }
    }

    public static void LJ(RoomEventMessage roomEventMessage) {
        CommonMessageData commonMessageData = roomEventMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<EventUserInfo> list = roomEventMessage.eventUserInfo;
        if (list == null) {
            roomEventMessage.eventUserInfo = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<EventUserInfo> it2 = roomEventMessage.eventUserInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomEventMessage roomEventMessage) {
        LJ(roomEventMessage);
    }

    @Override // X.C0IMD
    public final RoomEventMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomEventMessage roomEventMessage, List list) {
    }
}
