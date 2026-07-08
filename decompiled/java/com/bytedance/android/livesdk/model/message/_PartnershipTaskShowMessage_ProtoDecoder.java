package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipTaskShowMessage_ProtoDecoder implements C0IMD<PartnershipTaskShowMessage> {
    @Override // X.C0IMD
    public final void LIZ(PartnershipTaskShowMessage partnershipTaskShowMessage) {
        CommonMessageData commonMessageData = partnershipTaskShowMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final PartnershipTaskShowMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PartnershipTaskShowMessage partnershipTaskShowMessage = new PartnershipTaskShowMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        partnershipTaskShowMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        partnershipTaskShowMessage.changeMode = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        partnershipTaskShowMessage.taskId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        partnershipTaskShowMessage.hasShowTask = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        partnershipTaskShowMessage.gameId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        partnershipTaskShowMessage.taskType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipTaskShowMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipTaskShowMessage partnershipTaskShowMessage, List list) {
    }
}
