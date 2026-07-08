package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.MarqueeAnnouncementMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MarqueeAnnouncementMessage_MessageEntity_ProtoDecoder implements C0IMD<MarqueeAnnouncementMessage.MessageEntity> {
    public static MarqueeAnnouncementMessage.MessageEntity LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MarqueeAnnouncementMessage.MessageEntity messageEntity = new MarqueeAnnouncementMessage.MessageEntity();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    messageEntity.notifyMessage = _RoomNotifyMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return messageEntity;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MarqueeAnnouncementMessage.MessageEntity messageEntity) {
        RoomNotifyMessage roomNotifyMessage = messageEntity.notifyMessage;
        if (roomNotifyMessage != null) {
            _RoomNotifyMessage_ProtoDecoder.LJ(roomNotifyMessage);
        }
    }

    @Override // X.C0IMD
    public final MarqueeAnnouncementMessage.MessageEntity LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MarqueeAnnouncementMessage.MessageEntity messageEntity, List list) {
    }
}
