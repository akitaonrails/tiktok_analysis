package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HotRoomMessage_ProtoDecoder implements C0IMD<HotRoomMessage> {
    @Override // X.C0IMD
    public final void LIZ(HotRoomMessage hotRoomMessage) {
        HotRoomMessage hotRoomMessage2 = hotRoomMessage;
        CommonMessageData commonMessageData = hotRoomMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        HotRoomData hotRoomData = hotRoomMessage2.data;
        if (hotRoomData != null) {
            _HotRoomData_ProtoDecoder.LJ(hotRoomData);
        }
    }

    @Override // X.C0IMD
    public final HotRoomMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HotRoomMessage hotRoomMessage = new HotRoomMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        hotRoomMessage.data = _HotRoomData_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    hotRoomMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hotRoomMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HotRoomMessage hotRoomMessage, List list) {
    }
}
