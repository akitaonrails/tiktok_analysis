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

/* JADX INFO: loaded from: classes18.dex */
public final class _BottomMessage_ProtoDecoder implements C0IMD<BottomMessage> {
    @Override // X.C0IMD
    public final void LIZ(BottomMessage bottomMessage) {
        CommonMessageData commonMessageData = bottomMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final BottomMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BottomMessage bottomMessage = new BottomMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bottomMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        bottomMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        bottomMessage.showType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        bottomMessage.textType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        bottomMessage.duration = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        bottomMessage.bizType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        bottomMessage.violationUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        bottomMessage.punishInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        bottomMessage.style = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        bottomMessage.detailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        bottomMessage.floatStyle = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        bottomMessage.floatIconType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bottomMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BottomMessage bottomMessage, List list) {
    }
}
