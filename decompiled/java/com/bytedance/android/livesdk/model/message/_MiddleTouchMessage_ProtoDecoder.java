package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model._UnifyBaseActionData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MiddleTouchMessage_ProtoDecoder implements C0IMD<MiddleTouchMessage> {
    @Override // X.C0IMD
    public final void LIZ(MiddleTouchMessage middleTouchMessage) {
        MiddleTouchMessage middleTouchMessage2 = middleTouchMessage;
        CommonMessageData commonMessageData = middleTouchMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        MiddleTouchExtra middleTouchExtra = middleTouchMessage2.extra;
        if (middleTouchExtra != null) {
            _MiddleTouchExtra_ProtoDecoder.LJ(middleTouchExtra);
        }
    }

    @Override // X.C0IMD
    public final MiddleTouchMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MiddleTouchMessage middleTouchMessage = new MiddleTouchMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            middleTouchMessage.extra = _MiddleTouchExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        middleTouchMessage.actionData = _UnifyBaseActionData_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    middleTouchMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return middleTouchMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MiddleTouchMessage middleTouchMessage, List list) {
    }
}
