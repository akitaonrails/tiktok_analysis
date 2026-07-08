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

/* JADX INFO: loaded from: classes30.dex */
public final class _RealtimeUnifiedEntranceMessage_ProtoDecoder implements C0IMD<RealtimeUnifiedEntranceMessage> {
    @Override // X.C0IMD
    public final void LIZ(RealtimeUnifiedEntranceMessage realtimeUnifiedEntranceMessage) {
        CommonMessageData commonMessageData = realtimeUnifiedEntranceMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final RealtimeUnifiedEntranceMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RealtimeUnifiedEntranceMessage realtimeUnifiedEntranceMessage = new RealtimeUnifiedEntranceMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        realtimeUnifiedEntranceMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        realtimeUnifiedEntranceMessage.suggestionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        realtimeUnifiedEntranceMessage.suggestionTemplateId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        realtimeUnifiedEntranceMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        realtimeUnifiedEntranceMessage.context = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        realtimeUnifiedEntranceMessage.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        realtimeUnifiedEntranceMessage.icon = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        realtimeUnifiedEntranceMessage.ctaText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        realtimeUnifiedEntranceMessage.ctaSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        realtimeUnifiedEntranceMessage.subtitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        realtimeUnifiedEntranceMessage.tuxIconName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        realtimeUnifiedEntranceMessage.messageKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        realtimeUnifiedEntranceMessage.targetModule = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeUnifiedEntranceMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeUnifiedEntranceMessage realtimeUnifiedEntranceMessage, List list) {
    }
}
