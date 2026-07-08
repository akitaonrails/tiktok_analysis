package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _LivePodcastResponse_ResponseData_ProtoDecoder implements C0IMD<LivePodcastResponse.ResponseData> {
    public static LivePodcastResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LivePodcastResponse.ResponseData responseData = new LivePodcastResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.canBeLivePodcast = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        responseData.canBeSocialLive = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        responseData.liveScenario = _LiveScenario_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        responseData.livePermissionApply = _LivePermissionApply_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        responseData.showLiveStudio = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        responseData.anchorLevelPermission = _AnchorLevelPermission_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        responseData.canBePicoLivePodcast = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        responseData.tryMode = _TryMode_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        responseData.liveStudioPermissionStatus = _LiveStudioPermissionStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        responseData.stream = _Stream_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        responseData.canCache = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        responseData.showMockLiveTab = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        responseData.conditionsPopup = _EntranceConditionsPopup_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        responseData.goliveLocaleRestricted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 15:
                        responseData.goLiveEventTracing = _GoLiveEventTracing_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        responseData.isProAnchor = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        responseData.isFirstTimeHavingLivePermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        responseData.watchedLiveForThePastNDays = C1516700pZU.LIZ(c1516680pZS);
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

    @Override // X.C0IMD
    public final void LIZ(LivePodcastResponse.ResponseData responseData) {
        EntranceConditionsPopup entranceConditionsPopup = responseData.conditionsPopup;
        if (entranceConditionsPopup != null) {
            _EntranceConditionsPopup_ProtoDecoder.LJ(entranceConditionsPopup);
        }
    }

    @Override // X.C0IMD
    public final LivePodcastResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LivePodcastResponse.ResponseData responseData, List list) {
    }
}
