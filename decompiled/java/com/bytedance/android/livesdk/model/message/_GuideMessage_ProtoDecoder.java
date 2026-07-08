package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideMessage_ProtoDecoder implements C0IMD<GuideMessage> {
    @Override // X.C0IMD
    public final void LIZ(GuideMessage guideMessage) {
        CommonMessageData commonMessageData = guideMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final GuideMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuideMessage guideMessage = new GuideMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        guideMessage.guideType = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        guideMessage.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        guideMessage.description = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        guideMessage.duration = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        guideMessage.displayStyle = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        guideMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        guideMessage.frequencyRule = _GuideMessageFrequencyRule_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guideMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideMessage guideMessage, List list) {
    }
}
