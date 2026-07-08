package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipDropsCardChangeMessage_ProtoDecoder implements C0IMD<PartnershipDropsCardChangeMessage> {
    @Override // X.C0IMD
    public final void LIZ(PartnershipDropsCardChangeMessage partnershipDropsCardChangeMessage) {
        CommonMessageData commonMessageData = partnershipDropsCardChangeMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final PartnershipDropsCardChangeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PartnershipDropsCardChangeMessage partnershipDropsCardChangeMessage = new PartnershipDropsCardChangeMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        partnershipDropsCardChangeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        partnershipDropsCardChangeMessage.changeMode = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        partnershipDropsCardChangeMessage.dropsId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        partnershipDropsCardChangeMessage.cardShowDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        partnershipDropsCardChangeMessage.gameId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        partnershipDropsCardChangeMessage.gameName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipDropsCardChangeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipDropsCardChangeMessage partnershipDropsCardChangeMessage, List list) {
    }
}
