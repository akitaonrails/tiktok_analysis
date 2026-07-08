package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DonationInfoMessage_ProtoDecoder implements C0IMD<DonationInfoMessage> {
    @Override // X.C0IMD
    public final void LIZ(DonationInfoMessage donationInfoMessage) {
        CommonMessageData commonMessageData = donationInfoMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final DonationInfoMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        DonationInfoMessage donationInfoMessage = new DonationInfoMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        donationInfoMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        donationInfoMessage.totalMoney = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        donationInfoMessage.currency = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        donationInfoMessage.totalUser = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        donationInfoMessage.goalAmount = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        donationInfoMessage.fundraiserId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return donationInfoMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DonationInfoMessage donationInfoMessage, List list) {
    }
}
