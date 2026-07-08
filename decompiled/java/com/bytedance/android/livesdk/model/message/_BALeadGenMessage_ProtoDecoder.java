package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _BALeadGenMessage_ProtoDecoder implements C0IMD<BALeadGenMessage> {
    @Override // X.C0IMD
    public final void LIZ(BALeadGenMessage bALeadGenMessage) {
        CommonMessageData commonMessageData = bALeadGenMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final BALeadGenMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BALeadGenMessage bALeadGenMessage = new BALeadGenMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bALeadGenMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        bALeadGenMessage.op = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        bALeadGenMessage.pageId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        bALeadGenMessage.opTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        bALeadGenMessage.ctaText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        bALeadGenMessage.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        bALeadGenMessage.pinPeriod = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        bALeadGenMessage.cardIntro = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        bALeadGenMessage.cardButtonText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        bALeadGenMessage.cardTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bALeadGenMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BALeadGenMessage bALeadGenMessage, List list) {
    }
}
