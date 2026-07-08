package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipDownloadCountMessage_ProtoDecoder implements C0IMD<PartnershipDownloadCountMessage> {
    @Override // X.C0IMD
    public final void LIZ(PartnershipDownloadCountMessage partnershipDownloadCountMessage) {
        CommonMessageData commonMessageData = partnershipDownloadCountMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final PartnershipDownloadCountMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PartnershipDownloadCountMessage partnershipDownloadCountMessage = new PartnershipDownloadCountMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            partnershipDownloadCountMessage.gameId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        partnershipDownloadCountMessage.downloadedCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    partnershipDownloadCountMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipDownloadCountMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipDownloadCountMessage partnershipDownloadCountMessage, List list) {
    }
}
