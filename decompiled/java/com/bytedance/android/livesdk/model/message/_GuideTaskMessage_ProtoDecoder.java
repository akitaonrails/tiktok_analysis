package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideTaskMessage_ProtoDecoder implements C0IMD<GuideTaskMessage> {
    @Override // X.C0IMD
    public final void LIZ(GuideTaskMessage guideTaskMessage) {
        GuideTaskMessage guideTaskMessage2 = guideTaskMessage;
        CommonMessageData commonMessageData = guideTaskMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (guideTaskMessage2.operationTypes == null) {
            guideTaskMessage2.operationTypes = new ArrayList();
        }
        Text text = guideTaskMessage2.remindAreaText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final GuideTaskMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuideTaskMessage guideTaskMessage = new GuideTaskMessage();
        guideTaskMessage.operationTypes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guideTaskMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        guideTaskMessage.bizName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        guideTaskMessage.operationTypes.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        break;
                    case 4:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 5:
                        guideTaskMessage.remindAreaText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        guideTaskMessage.remindType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        guideTaskMessage.displaySecond = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        guideTaskMessage.taskType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        guideTaskMessage.icon = _TPTuxImage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guideTaskMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideTaskMessage guideTaskMessage, List list) {
    }
}
