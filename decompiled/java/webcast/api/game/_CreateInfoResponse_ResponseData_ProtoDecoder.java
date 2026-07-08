package webcast.api.game;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.GameRevenueTipsMessage;
import com.bytedance.android.livesdk.model.message._GameRevenueTipsMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._EnlargeViewInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.api.game.CreateInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _CreateInfoResponse_ResponseData_ProtoDecoder implements C0IMD<CreateInfoResponse.ResponseData> {
    public static CreateInfoResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CreateInfoResponse.ResponseData responseData = new CreateInfoResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.tnsReportIntervalMs = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        responseData.cliTnsCollectIntervalMs = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        responseData.openLsNotify = _OpenLsNotifyInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        responseData.serverTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        responseData.hasLiveStudioLogin = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        responseData.haveMutilGuestPermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        responseData.haveDualDeviceCamera = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        responseData.haveScreenshotRecord = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        responseData.tips = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        responseData.inGameInfo = _InGameInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        responseData.useCustomCover = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        responseData.allowMultiStream = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        responseData.enableLiveStudioMonitor = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 14:
                        responseData.revenueTips = _GameRevenueTipsMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        responseData.bannerData = _GameBannerContainer_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        responseData.monetizationTipsConfig = _MonetizationTipsConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        responseData.anchorFirstGameGoLiveTs = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        responseData.isGameAnchor = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 19:
                        responseData.userSettingDetail = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        responseData.guessResultNoticeTime = c1516680pZS.LJIIJJI();
                        break;
                    case 21:
                        responseData.enablePhoneAsCamera = c1516680pZS.LJIIJJI();
                        break;
                    case 22:
                        responseData.noiceReductionInfo = _NoiceReductionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 23:
                        responseData.tnsLidLanguage = _TnsLidLanguage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        responseData.extendedChatPenetrationPromotionInfo = _ExtendedChatPenetrationPromotionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 25:
                        responseData.haveSuperFansPermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 26:
                        responseData.haveAiScriptPermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 27:
                        responseData.enlargeView = _EnlargeViewInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 28:
                        responseData.enableEnlargeTips = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 29:
                        responseData.audioViolationsInfo = _AudioViolationsInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 30:
                        responseData.haveCueScriptPermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 31:
                        responseData.hasOralAbilityForAiScript = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(CreateInfoResponse.ResponseData responseData) {
        Text text = responseData.tips;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        InGameInfo inGameInfo = responseData.inGameInfo;
        if (inGameInfo != null && inGameInfo.allowGuideGametagIds == null) {
            inGameInfo.allowGuideGametagIds = new ArrayList();
        }
        GameRevenueTipsMessage gameRevenueTipsMessage = responseData.revenueTips;
        if (gameRevenueTipsMessage != null) {
            _GameRevenueTipsMessage_ProtoDecoder.LJ(gameRevenueTipsMessage);
        }
        GameBannerContainer gameBannerContainer = responseData.bannerData;
        if (gameBannerContainer != null) {
            _GameBannerContainer_ProtoDecoder.LJ(gameBannerContainer);
        }
        MonetizationTipsConfig monetizationTipsConfig = responseData.monetizationTipsConfig;
        if (monetizationTipsConfig != null && monetizationTipsConfig.revenueTipsTriggerTime == null) {
            monetizationTipsConfig.revenueTipsTriggerTime = new ArrayList();
        }
        TnsLidLanguage tnsLidLanguage = responseData.tnsLidLanguage;
        if (tnsLidLanguage != null && tnsLidLanguage.predictLanguage == null) {
            tnsLidLanguage.predictLanguage = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CreateInfoResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final CreateInfoResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CreateInfoResponse.ResponseData responseData, List list) {
    }
}
