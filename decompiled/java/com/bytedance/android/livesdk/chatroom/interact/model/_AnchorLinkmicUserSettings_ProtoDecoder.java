package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact._SubtitleSettings_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _AnchorLinkmicUserSettings_ProtoDecoder implements C0IMD<AnchorLinkmicUserSettings> {
    public static AnchorLinkmicUserSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorLinkmicUserSettings anchorLinkmicUserSettings = new AnchorLinkmicUserSettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        anchorLinkmicUserSettings.isTurnOn = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        anchorLinkmicUserSettings.acceptMultiLinkmic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        anchorLinkmicUserSettings.acceptNotFollowerInvite = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        anchorLinkmicUserSettings.allowGiftToOtherAnchors = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        anchorLinkmicUserSettings.blockInvitationOfThisLive = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        anchorLinkmicUserSettings.receiveFriendMultiHostInvites = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        anchorLinkmicUserSettings.receiveFriendMultiHostApplication = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        anchorLinkmicUserSettings.blockThisMultiHostInvites = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        anchorLinkmicUserSettings.blockThisMultiHostApplication = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        anchorLinkmicUserSettings.receiveNotFriendMultiHostInvites = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        anchorLinkmicUserSettings.receiveNotFriendMultiHostApplication = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        anchorLinkmicUserSettings.allowLiveNoticeOfFriends = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        anchorLinkmicUserSettings.allowFriendInvites = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 14:
                        anchorLinkmicUserSettings.allowSuggestedInvites = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 15:
                        anchorLinkmicUserSettings.allowFriendInvitesWhenOfflive = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 16:
                        anchorLinkmicUserSettings.allowUserCohostSuggestions = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        anchorLinkmicUserSettings.allowMissedInvitationNotice = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        anchorLinkmicUserSettings.allowLiveNoticeOfSuggested = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 19:
                        anchorLinkmicUserSettings.allowGuestRequestDuringCohost = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        anchorLinkmicUserSettings.allowGuestApplyDuringCohost = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 21:
                        anchorLinkmicUserSettings.subtitleSetting = _SubtitleSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorLinkmicUserSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorLinkmicUserSettings anchorLinkmicUserSettings) {
    }

    @Override // X.C0IMD
    public final AnchorLinkmicUserSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorLinkmicUserSettings anchorLinkmicUserSettings, List list) {
    }
}
