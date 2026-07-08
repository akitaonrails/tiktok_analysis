package com.bytedance.android.livesdk.model.message.ext;

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
public final class _BusinessLinksLiveMessage_ProtoDecoder implements C0IMD<BusinessLinksLiveMessage> {
    @Override // X.C0IMD
    public final void LIZ(BusinessLinksLiveMessage businessLinksLiveMessage) {
        CommonMessageData commonMessageData = businessLinksLiveMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final BusinessLinksLiveMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BusinessLinksLiveMessage businessLinksLiveMessage = new BusinessLinksLiveMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        businessLinksLiveMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        businessLinksLiveMessage.op = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        businessLinksLiveMessage.id = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        businessLinksLiveMessage.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        businessLinksLiveMessage.subtitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        businessLinksLiveMessage.url = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        businessLinksLiveMessage.f317pic = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        businessLinksLiveMessage.opTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        businessLinksLiveMessage.cardType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        businessLinksLiveMessage.gameUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        businessLinksLiveMessage.liveLogExtra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return businessLinksLiveMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BusinessLinksLiveMessage businessLinksLiveMessage, List list) {
    }
}
