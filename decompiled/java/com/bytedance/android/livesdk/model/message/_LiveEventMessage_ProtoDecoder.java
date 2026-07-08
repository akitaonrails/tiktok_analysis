package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.EventCard;
import webcast.data._EventCard_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveEventMessage_ProtoDecoder implements C0IMD<LiveEventMessage> {
    @Override // X.C0IMD
    public final void LIZ(LiveEventMessage liveEventMessage) {
        LiveEventInfo liveEventInfo;
        LiveEventMessage liveEventMessage2 = liveEventMessage;
        CommonMessageData commonMessageData = liveEventMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        EventCard eventCard = liveEventMessage2.card;
        if (eventCard != null && (liveEventInfo = eventCard.event) != null) {
            _LiveEventInfo_ProtoDecoder.LJ(liveEventInfo);
        }
    }

    @Override // X.C0IMD
    public final LiveEventMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LiveEventMessage liveEventMessage = new LiveEventMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            liveEventMessage.card = _EventCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        liveEventMessage.actionType = c1516680pZS.LJIIJ();
                    }
                } else {
                    liveEventMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveEventMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveEventMessage liveEventMessage, List list) {
    }
}
