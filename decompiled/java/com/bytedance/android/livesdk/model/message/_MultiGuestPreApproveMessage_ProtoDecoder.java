package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestPreApproveMessage_ProtoDecoder implements C0IMD<MultiGuestPreApproveMessage> {
    @Override // X.C0IMD
    public final void LIZ(MultiGuestPreApproveMessage multiGuestPreApproveMessage) {
        CommonMessageData commonMessageData = multiGuestPreApproveMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final MultiGuestPreApproveMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestPreApproveMessage multiGuestPreApproveMessage = new MultiGuestPreApproveMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        multiGuestPreApproveMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        multiGuestPreApproveMessage.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        multiGuestPreApproveMessage.peopleAheadNum = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        multiGuestPreApproveMessage.recipientType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        multiGuestPreApproveMessage.hostUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        multiGuestPreApproveMessage.audienceUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        multiGuestPreApproveMessage.preApproveSource = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestPreApproveMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestPreApproveMessage multiGuestPreApproveMessage, List list) {
    }
}
