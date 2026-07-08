package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data._AnchorGrowLevelImMsgV2_ProtoDecoder;
import webcast.data._AnchorGrowLevelImMsg_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorGrowLevelMessage_ProtoDecoder implements C0IMD<AnchorGrowLevelMessage> {
    @Override // X.C0IMD
    public final void LIZ(AnchorGrowLevelMessage anchorGrowLevelMessage) {
        CommonMessageData commonMessageData = anchorGrowLevelMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final AnchorGrowLevelMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AnchorGrowLevelMessage anchorGrowLevelMessage = new AnchorGrowLevelMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            anchorGrowLevelMessage.anchorGrowLevelImMsgV2 = _AnchorGrowLevelImMsgV2_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        anchorGrowLevelMessage.anchorGrowLevelImMsg = _AnchorGrowLevelImMsg_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorGrowLevelMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorGrowLevelMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGrowLevelMessage anchorGrowLevelMessage, List list) {
    }
}
