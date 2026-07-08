package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NewAnchorGuideMessage_ProtoDecoder implements C0IMD<NewAnchorGuideMessage> {
    @Override // X.C0IMD
    public final void LIZ(NewAnchorGuideMessage newAnchorGuideMessage) {
        NewAnchorGuideConfig newAnchorGuideConfig;
        NewAnchorGuideMessage newAnchorGuideMessage2 = newAnchorGuideMessage;
        CommonMessageData commonMessageData = newAnchorGuideMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        NewAnchorGuideMsgInfo newAnchorGuideMsgInfo = newAnchorGuideMessage2.guideMsg;
        if (newAnchorGuideMsgInfo != null && (newAnchorGuideConfig = newAnchorGuideMsgInfo.guideConfig) != null) {
            _NewAnchorGuideConfig_ProtoDecoder.LJ(newAnchorGuideConfig);
        }
    }

    @Override // X.C0IMD
    public final NewAnchorGuideMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        NewAnchorGuideMessage newAnchorGuideMessage = new NewAnchorGuideMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        newAnchorGuideMessage.guideMsg = _NewAnchorGuideMsgInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    newAnchorGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return newAnchorGuideMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NewAnchorGuideMessage newAnchorGuideMessage, List list) {
    }
}
