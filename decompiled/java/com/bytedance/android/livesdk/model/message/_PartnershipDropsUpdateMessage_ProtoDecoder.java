package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipDropsUpdateMessage_ProtoDecoder implements C0IMD<PartnershipDropsUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(PartnershipDropsUpdateMessage partnershipDropsUpdateMessage) {
        CommonMessageData commonMessageData = partnershipDropsUpdateMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final PartnershipDropsUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PartnershipDropsUpdateMessage partnershipDropsUpdateMessage = new PartnershipDropsUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        partnershipDropsUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        partnershipDropsUpdateMessage.changeMode = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        partnershipDropsUpdateMessage.dropsId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        partnershipDropsUpdateMessage.taskId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        partnershipDropsUpdateMessage.eventId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        partnershipDropsUpdateMessage.anchorUid = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipDropsUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipDropsUpdateMessage partnershipDropsUpdateMessage, List list) {
    }
}
