package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._LinkerMediaChangeOperator_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkLayoutMessage_ProtoDecoder implements C0IMD<LinkLayoutMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkLayoutMessage linkLayoutMessage) {
        CommonMessageData commonMessageData = linkLayoutMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final LinkLayoutMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkLayoutMessage linkLayoutMessage = new LinkLayoutMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkLayoutMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkLayoutMessage.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        linkLayoutMessage.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        linkLayoutMessage.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        linkLayoutMessage.layoutId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkLayoutMessage.maxPosition = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        linkLayoutMessage.operatorUserInfo = _LinkerMediaChangeOperator_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        linkLayoutMessage.layoutStyle = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkLayoutMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkLayoutMessage linkLayoutMessage, List list) {
    }
}
