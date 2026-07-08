package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftRecordCapsuleMessage_ProtoDecoder implements C0IMD<GiftRecordCapsuleMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftRecordCapsuleMessage giftRecordCapsuleMessage) {
        CommonMessageData commonMessageData = giftRecordCapsuleMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final GiftRecordCapsuleMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftRecordCapsuleMessage giftRecordCapsuleMessage = new GiftRecordCapsuleMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftRecordCapsuleMessage.extra = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftRecordCapsuleMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftRecordCapsuleMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftRecordCapsuleMessage giftRecordCapsuleMessage, List list) {
    }
}
