package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipCardChangeMessage_ProtoDecoder implements C0IMD<PartnershipCardChangeMessage> {
    @Override // X.C0IMD
    public final void LIZ(PartnershipCardChangeMessage partnershipCardChangeMessage) {
        CommonMessageData commonMessageData = partnershipCardChangeMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final PartnershipCardChangeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PartnershipCardChangeMessage partnershipCardChangeMessage = new PartnershipCardChangeMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        partnershipCardChangeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        partnershipCardChangeMessage.changeMode = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        partnershipCardChangeMessage.sequenceId = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 4:
                        partnershipCardChangeMessage.taskId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        partnershipCardChangeMessage.gameId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        partnershipCardChangeMessage.taskType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipCardChangeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipCardChangeMessage partnershipCardChangeMessage, List list) {
    }
}
