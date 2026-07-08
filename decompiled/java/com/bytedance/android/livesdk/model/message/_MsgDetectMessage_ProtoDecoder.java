package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MsgDetectMessage_ProtoDecoder implements C0IMD<MsgDetectMessage> {
    @Override // X.C0IMD
    public final void LIZ(MsgDetectMessage msgDetectMessage) {
        CommonMessageData commonMessageData = msgDetectMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final MsgDetectMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MsgDetectMessage msgDetectMessage = new MsgDetectMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        msgDetectMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        msgDetectMessage.detectType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        msgDetectMessage.triggerCondition = _MsgDetectMessage_TriggerCondition_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        msgDetectMessage.timeInfo = _MsgDetectMessage_TimeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        msgDetectMessage.triggerBy = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        msgDetectMessage.fromRegion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return msgDetectMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MsgDetectMessage msgDetectMessage, List list) {
    }
}
