package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.MarqueeAnnouncementMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MarqueeAnnouncementMessage_ProtoDecoder implements C0IMD<MarqueeAnnouncementMessage> {
    @Override // X.C0IMD
    public final void LIZ(MarqueeAnnouncementMessage marqueeAnnouncementMessage) {
        RoomNotifyMessage roomNotifyMessage;
        MarqueeAnnouncementMessage marqueeAnnouncementMessage2 = marqueeAnnouncementMessage;
        CommonMessageData commonMessageData = marqueeAnnouncementMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<MarqueeAnnouncementMessage.MessageEntity> list = marqueeAnnouncementMessage2.messageEntity;
        if (list == null) {
            marqueeAnnouncementMessage2.messageEntity = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (MarqueeAnnouncementMessage.MessageEntity messageEntity : marqueeAnnouncementMessage2.messageEntity) {
            if (messageEntity != null && (roomNotifyMessage = messageEntity.notifyMessage) != null) {
                _RoomNotifyMessage_ProtoDecoder.LJ(roomNotifyMessage);
            }
        }
    }

    @Override // X.C0IMD
    public final MarqueeAnnouncementMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MarqueeAnnouncementMessage marqueeAnnouncementMessage = new MarqueeAnnouncementMessage();
        marqueeAnnouncementMessage.messageEntity = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            marqueeAnnouncementMessage.messageEntity.add(_MarqueeAnnouncementMessage_MessageEntity_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        marqueeAnnouncementMessage.messageScene = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    marqueeAnnouncementMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return marqueeAnnouncementMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MarqueeAnnouncementMessage marqueeAnnouncementMessage, List list) {
    }
}
