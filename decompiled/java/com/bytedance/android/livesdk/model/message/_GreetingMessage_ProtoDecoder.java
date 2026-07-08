package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data._UserIdentity_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GreetingMessage_ProtoDecoder implements C0IMD<GreetingMessage> {
    @Override // X.C0IMD
    public final void LIZ(GreetingMessage greetingMessage) {
        GreetingMessage greetingMessage2 = greetingMessage;
        CommonMessageData commonMessageData = greetingMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = greetingMessage2.greetingText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = greetingMessage2.guideText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final GreetingMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GreetingMessage greetingMessage = new GreetingMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        greetingMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        greetingMessage.userIdentity = _UserIdentity_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        greetingMessage.enterMsgId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        greetingMessage.greetingText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        greetingMessage.guideText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        greetingMessage.waveAlgorithmData = _WaveAlgorithmData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return greetingMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GreetingMessage greetingMessage, List list) {
    }
}
