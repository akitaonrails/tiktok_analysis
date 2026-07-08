package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _MultiLiveAnchorPanelSettings_ProtoDecoder implements C0IMD<MultiLiveAnchorPanelSettings> {
    public static MultiLiveAnchorPanelSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = new MultiLiveAnchorPanelSettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        multiLiveAnchorPanelSettings.userId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        multiLiveAnchorPanelSettings.layoutType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        multiLiveAnchorPanelSettings.fixMicNumAction = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        multiLiveAnchorPanelSettings.allowViewerReq = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        multiLiveAnchorPanelSettings.onlyAllowFollowerReq = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 7:
                        multiLiveAnchorPanelSettings.applierSortSetting = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        multiLiveAnchorPanelSettings.allowRequestFromFriends = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        multiLiveAnchorPanelSettings.allowRequestFromFollowers = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        multiLiveAnchorPanelSettings.allowRequestFromOthers = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        multiLiveAnchorPanelSettings.enableShowMultiGuestLayout = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        multiLiveAnchorPanelSettings.disableVideoLinkmic = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        multiLiveAnchorPanelSettings.multiGuestApplyAutoApprove = c1516680pZS.LJIIJ();
                        break;
                    case 15:
                        multiLiveAnchorPanelSettings.multiGuestShareRevenueInfoVersion = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        multiLiveAnchorPanelSettings.showAvailableSpot = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        multiLiveAnchorPanelSettings.saveAsDefaultLayout = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        multiLiveAnchorPanelSettings.multiGuestAllowCohostInvitation = c1516680pZS.LJIIJ();
                        break;
                    case 19:
                        multiLiveAnchorPanelSettings.multiGuestAllowCohostInvitationOnce = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        multiLiveAnchorPanelSettings.disableGuestOpenCamera = c1516680pZS.LJIIJ();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiLiveAnchorPanelSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final MultiLiveAnchorPanelSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, List list) {
    }
}
