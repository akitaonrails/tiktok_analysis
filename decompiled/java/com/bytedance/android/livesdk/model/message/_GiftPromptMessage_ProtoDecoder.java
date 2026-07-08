package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPromptMessage_ProtoDecoder implements C0IMD<GiftPromptMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftPromptMessage giftPromptMessage) {
        CommonMessageData commonMessageData = giftPromptMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final GiftPromptMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftPromptMessage giftPromptMessage = new GiftPromptMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftPromptMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftPromptMessage.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftPromptMessage.body = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        giftPromptMessage.blockNumDays = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 5:
                        giftPromptMessage.orderId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftPromptMessage.orderTimestamp = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 7:
                        giftPromptMessage.inUserGiftingAddictionExpr = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        giftPromptMessage.popUpSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPromptMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPromptMessage giftPromptMessage, List list) {
    }
}
