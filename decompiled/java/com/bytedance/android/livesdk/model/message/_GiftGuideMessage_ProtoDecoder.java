package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftGuideMessage_ProtoDecoder implements C0IMD<GiftGuideMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftGuideMessage giftGuideMessage) {
        GiftGuideMessage giftGuideMessage2 = giftGuideMessage;
        CommonMessageData commonMessageData = giftGuideMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = giftGuideMessage2.content;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        List<GuidePageResource> list = giftGuideMessage2.guidePageResources;
        if (list == null) {
            giftGuideMessage2.guidePageResources = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GuidePageResource guidePageResource : giftGuideMessage2.guidePageResources) {
                if (guidePageResource != null) {
                    _GuidePageResource_ProtoDecoder.LJ(guidePageResource);
                }
            }
        }
        if (giftGuideMessage2.tags == null) {
            giftGuideMessage2.tags = new ArrayList();
        }
        if (giftGuideMessage2.giftIds == null) {
            giftGuideMessage2.giftIds = new ArrayList();
        }
        StyleDictateParams styleDictateParams = giftGuideMessage2.styleDictateParams;
        if (styleDictateParams != null) {
            _StyleDictateParams_ProtoDecoder.LJ(styleDictateParams);
        }
    }

    @Override // X.C0IMD
    public final GiftGuideMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftGuideMessage giftGuideMessage = new GiftGuideMessage();
        giftGuideMessage.guidePageResources = new ArrayList();
        giftGuideMessage.giftIds = new ArrayList();
        giftGuideMessage.tags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftGuideMessage.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftGuideMessage.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        giftGuideMessage.hasSent = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        giftGuideMessage.guideType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftGuideMessage.displaySeconds = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        giftGuideMessage.triggerName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        giftGuideMessage.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftGuideMessage.shouldUseConfig = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftGuideMessage.guidePageResources.add(_GuidePageResource_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        giftGuideMessage.templateType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        giftGuideMessage.guideTarget = _GuideTarget_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        giftGuideMessage.biz = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        giftGuideMessage.tags.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 15:
                        giftGuideMessage.giftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 16:
                        giftGuideMessage.useServerConfig = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        giftGuideMessage.subTriggerName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        giftGuideMessage.styleDictate = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 19:
                        giftGuideMessage.styleDictateParams = _StyleDictateParams_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        giftGuideMessage.popUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        giftGuideMessage.styleId = c1516680pZS.LJIIJJI();
                        break;
                    case 22:
                        giftGuideMessage.guideMessageType = c1516680pZS.LJIIJ();
                        break;
                    case 23:
                        giftGuideMessage.recommendInfo = _RecommendInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftGuideMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftGuideMessage giftGuideMessage, List list) {
    }
}
