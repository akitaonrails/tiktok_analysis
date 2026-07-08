package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _AnchorLevelPermission_ProtoDecoder implements C0IMD<AnchorLevelPermission> {
    public static AnchorLevelPermission LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorLevelPermission anchorLevelPermission = new AnchorLevelPermission();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        anchorLevelPermission.beauty = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        anchorLevelPermission.effects = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        anchorLevelPermission.share = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        anchorLevelPermission.moderatorSetting = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        anchorLevelPermission.commentSetting = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        anchorLevelPermission.commentFilter = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        anchorLevelPermission.pauseLive = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        anchorLevelPermission.flip = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        anchorLevelPermission.mirror = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        anchorLevelPermission.hearYourOwnVoice = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        anchorLevelPermission.donationSticker = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        anchorLevelPermission.fullScreenMode = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        anchorLevelPermission.liveCenter = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        anchorLevelPermission.topic = c1516680pZS.LJIIJ();
                        break;
                    case 15:
                        anchorLevelPermission.sticker = c1516680pZS.LJIIJ();
                        break;
                    case 16:
                        anchorLevelPermission.voiceEffect = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        anchorLevelPermission.liveIntro = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        anchorLevelPermission.webcastDataInteractionQuestion = c1516680pZS.LJIIJ();
                        break;
                    case 19:
                        anchorLevelPermission.poll = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        anchorLevelPermission.pin = c1516680pZS.LJIIJ();
                        break;
                    case 21:
                        anchorLevelPermission.pictionary = c1516680pZS.LJIIJ();
                        break;
                    case 22:
                        anchorLevelPermission.viewerRankList = c1516680pZS.LJIIJ();
                        break;
                    case 23:
                        anchorLevelPermission.promote = c1516680pZS.LJIIJ();
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        anchorLevelPermission.customizablePoll = c1516680pZS.LJIIJ();
                        break;
                    case 25:
                        anchorLevelPermission.goodyBag = c1516680pZS.LJIIJ();
                        break;
                    case 26:
                        anchorLevelPermission.karaoke = c1516680pZS.LJIIJ();
                        break;
                    case 27:
                        anchorLevelPermission.treasureBox = c1516680pZS.LJIIJ();
                        break;
                    case 28:
                        anchorLevelPermission.portal = c1516680pZS.LJIIJ();
                        break;
                    case 29:
                        anchorLevelPermission.liveBackground = c1516680pZS.LJIIJ();
                        break;
                    case 30:
                        anchorLevelPermission.playTogether = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorLevelPermission;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorLevelPermission LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorLevelPermission anchorLevelPermission) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorLevelPermission anchorLevelPermission, List list) {
    }
}
