package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api.SubWaveImMsg;
import com.bytedance.android.livesdk.chatroom.api._SubWaveImMsg_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubWaveMessage_ProtoDecoder implements C0IMD<SubWaveMessage> {
    @Override // X.C0IMD
    public final void LIZ(SubWaveMessage subWaveMessage) {
        SubWaveMessage subWaveMessage2 = subWaveMessage;
        CommonMessageData commonMessageData = subWaveMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        SubWaveImMsg subWaveImMsg = subWaveMessage2.subWaveImMsg;
        if (subWaveImMsg != null) {
            _SubWaveImMsg_ProtoDecoder.LJ(subWaveImMsg);
        }
    }

    @Override // X.C0IMD
    public final SubWaveMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SubWaveMessage subWaveMessage = new SubWaveMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        subWaveMessage.subWaveImMsg = _SubWaveImMsg_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    subWaveMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subWaveMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubWaveMessage subWaveMessage, List list) {
    }
}
