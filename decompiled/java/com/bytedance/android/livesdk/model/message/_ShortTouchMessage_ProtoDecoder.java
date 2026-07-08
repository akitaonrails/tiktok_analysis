package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model._ShortTouchTemplateData_ProtoDecoder;
import com.bytedance.android.livesdk.model._UnifyBaseActionData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShortTouchMessage_ProtoDecoder implements C0IMD<ShortTouchMessage> {
    @Override // X.C0IMD
    public final void LIZ(ShortTouchMessage shortTouchMessage) {
        CommonMessageData commonMessageData = shortTouchMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final ShortTouchMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ShortTouchMessage shortTouchMessage = new ShortTouchMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        shortTouchMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        shortTouchMessage.actionData = _UnifyBaseActionData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        shortTouchMessage.extra = _ShortTouchExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        shortTouchMessage.businessType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        shortTouchMessage.subBusinessType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        shortTouchMessage.customPayload = _CustomPayload_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        shortTouchMessage.templateData = _ShortTouchTemplateData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shortTouchMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShortTouchMessage shortTouchMessage, List list) {
    }
}
