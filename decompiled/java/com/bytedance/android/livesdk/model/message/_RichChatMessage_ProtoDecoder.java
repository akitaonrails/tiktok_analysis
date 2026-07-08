package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RichChatMessage_ProtoDecoder implements C0IMD<RichChatMessage> {
    @Override // X.C0IMD
    public final void LIZ(RichChatMessage richChatMessage) {
        RichChatMessage richChatMessage2 = richChatMessage;
        CommonMessageData commonMessageData = richChatMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = richChatMessage2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final RichChatMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RichChatMessage richChatMessage = new RichChatMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        richChatMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        richChatMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        richChatMessage.color = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        richChatMessage.traceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        richChatMessage.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        richChatMessage.actionContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        richChatMessage.actionType = String.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 8:
                        richChatMessage.pushDisplayTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return richChatMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RichChatMessage richChatMessage, List list) {
    }
}
