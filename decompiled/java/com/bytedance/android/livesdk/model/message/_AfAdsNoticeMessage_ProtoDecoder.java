package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _AfAdsNoticeMessage_ProtoDecoder implements C0IMD<AfAdsNoticeMessage> {
    @Override // X.C0IMD
    public final AfAdsNoticeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AfAdsNoticeMessage afAdsNoticeMessage = new AfAdsNoticeMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        afAdsNoticeMessage.adsetId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        afAdsNoticeMessage.appId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        afAdsNoticeMessage.country = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        afAdsNoticeMessage.channel = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        afAdsNoticeMessage.appIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        afAdsNoticeMessage.appName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        afAdsNoticeMessage.appsflyerDeviceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        afAdsNoticeMessage.campaignId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        afAdsNoticeMessage.campaign = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        afAdsNoticeMessage.clickUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        afAdsNoticeMessage.conversionType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        afAdsNoticeMessage.eventName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        afAdsNoticeMessage.eventTime = c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        afAdsNoticeMessage.idfv = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        afAdsNoticeMessage.idfa = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        afAdsNoticeMessage.googleAid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        afAdsNoticeMessage.androidId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        afAdsNoticeMessage.sub5 = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                        afAdsNoticeMessage.installTime = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        afAdsNoticeMessage.mediaSource = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        afAdsNoticeMessage.platform = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return afAdsNoticeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AfAdsNoticeMessage afAdsNoticeMessage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AfAdsNoticeMessage afAdsNoticeMessage, List list) {
    }
}
