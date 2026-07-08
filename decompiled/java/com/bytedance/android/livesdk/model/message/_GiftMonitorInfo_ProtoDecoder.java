package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftMonitorInfo_ProtoDecoder implements C0IMD<GiftMonitorInfo> {
    public static GiftMonitorInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftMonitorInfo giftMonitorInfo = new GiftMonitorInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftMonitorInfo.anchor_id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        giftMonitorInfo.profit_api_message_dur = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        giftMonitorInfo.send_gift_profit_api_start_ms = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        giftMonitorInfo.send_gift_profit_core_start_ms = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        giftMonitorInfo.send_gift_req_start_ms = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        giftMonitorInfo.send_gift_send_message_success_ms = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        giftMonitorInfo.send_profit_api_dur = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        giftMonitorInfo.to_user_id = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftMonitorInfo.sendGiftStartClientLocalMs = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftMonitorInfo.fromPlatform = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        giftMonitorInfo.fromVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftMonitorInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftMonitorInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftMonitorInfo giftMonitorInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftMonitorInfo giftMonitorInfo, List list) {
    }
}
