package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TTLSLiveControlMessage_ProtoDecoder implements C0IMD<TTLSLiveControlMessage> {
    @Override // X.C0IMD
    public final void LIZ(TTLSLiveControlMessage tTLSLiveControlMessage) {
        CommonMessageData commonMessageData = tTLSLiveControlMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final TTLSLiveControlMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TTLSLiveControlMessage tTLSLiveControlMessage = new TTLSLiveControlMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        tTLSLiveControlMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        tTLSLiveControlMessage.actionType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        tTLSLiveControlMessage.productId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        tTLSLiveControlMessage.roomId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        tTLSLiveControlMessage.productPinTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        tTLSLiveControlMessage.productUnpinTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        tTLSLiveControlMessage.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tTLSLiveControlMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TTLSLiveControlMessage tTLSLiveControlMessage, List list) {
    }
}
