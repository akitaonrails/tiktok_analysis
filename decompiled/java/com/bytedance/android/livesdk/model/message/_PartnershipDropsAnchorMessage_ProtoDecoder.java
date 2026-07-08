package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipDropsAnchorMessage_ProtoDecoder implements C0IMD<PartnershipDropsAnchorMessage> {
    @Override // X.C0IMD
    public final void LIZ(PartnershipDropsAnchorMessage partnershipDropsAnchorMessage) {
        CommonMessageData commonMessageData = partnershipDropsAnchorMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final PartnershipDropsAnchorMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PartnershipDropsAnchorMessage partnershipDropsAnchorMessage = new PartnershipDropsAnchorMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        partnershipDropsAnchorMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        partnershipDropsAnchorMessage.changeMode = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        partnershipDropsAnchorMessage.dropsId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        partnershipDropsAnchorMessage.anchorUid = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        partnershipDropsAnchorMessage.anchorJoinDropsNoticeType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        partnershipDropsAnchorMessage.dropsName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipDropsAnchorMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipDropsAnchorMessage partnershipDropsAnchorMessage, List list) {
    }
}
