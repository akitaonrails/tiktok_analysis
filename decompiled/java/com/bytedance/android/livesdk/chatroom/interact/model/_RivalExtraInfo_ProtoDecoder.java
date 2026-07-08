package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.ActivityBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.chatroom.model.interact.UserSuggestionInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._ActivityBadgeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._GiftGalleryBadgeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._RivalsGameTag_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TagV2_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TagV2_SecondDegreeRelationContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._UserSuggestionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalExtraInfo_ProtoDecoder implements C0IMD<RivalExtraInfo> {
    public static RivalExtraInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalExtraInfo rivalExtraInfo = new RivalExtraInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rivalExtraInfo.text = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        rivalExtraInfo.text_type = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        rivalExtraInfo.label = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        rivalExtraInfo.anchorLayer = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        rivalExtraInfo.linkerInfo = _LinkerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        rivalExtraInfo.linkmicUserSettings = _AnchorLinkmicUserSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 8:
                        rivalExtraInfo.inviteBlockReason = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        rivalExtraInfo.showPlayType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        rivalExtraInfo.tag = _RivalExtraInfo_Tag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        rivalExtraInfo.reserveInfo = _RivalExtraInfo_ReserveInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        rivalExtraInfo.detailBlockReason = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        rivalExtraInfo.optPairInfo = _OptPairInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        rivalExtraInfo.tagV2 = _TagV2_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        rivalExtraInfo.eoyLevel = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        rivalExtraInfo.battleInfo = _RivalExtraInfo_BattleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        rivalExtraInfo.cohostLayoutMode = c1516680pZS.LJIIJ();
                        break;
                    case 19:
                        rivalExtraInfo.gameTag = _RivalsGameTag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        rivalExtraInfo.giftGalleryBadgeInfo = _GiftGalleryBadgeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        rivalExtraInfo.offliveInviteInfo = _RivalExtraInfo_OffliveInviteInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        rivalExtraInfo.userSuggestionInfo = _UserSuggestionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 23:
                        rivalExtraInfo.friendSuggestionInfo = _UserSuggestionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        rivalExtraInfo.activityBadgeInfo = _ActivityBadgeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rivalExtraInfo;
            }
        }
    }

    public static void LJ(RivalExtraInfo rivalExtraInfo) {
        TagV2.SecondDegreeRelationContent secondDegreeRelationContent;
        LinkerInfo linkerInfo = rivalExtraInfo.linkerInfo;
        if (linkerInfo != null) {
            _LinkerInfo_ProtoDecoder.LJ(linkerInfo);
        }
        OptPairInfo optPairInfo = rivalExtraInfo.optPairInfo;
        if (optPairInfo != null) {
            _OptPairInfo_ProtoDecoder.LJ(optPairInfo);
        }
        TagV2 tagV2 = rivalExtraInfo.tagV2;
        if (tagV2 != null && (secondDegreeRelationContent = tagV2.secondDegreeRelationContent) != null) {
            _TagV2_SecondDegreeRelationContent_ProtoDecoder.LJ(secondDegreeRelationContent);
        }
        GiftGalleryBadgeInfo giftGalleryBadgeInfo = rivalExtraInfo.giftGalleryBadgeInfo;
        if (giftGalleryBadgeInfo != null) {
            _GiftGalleryBadgeInfo_ProtoDecoder.LJ(giftGalleryBadgeInfo);
        }
        UserSuggestionInfo userSuggestionInfo = rivalExtraInfo.userSuggestionInfo;
        if (userSuggestionInfo != null) {
            _UserSuggestionInfo_ProtoDecoder.LJ(userSuggestionInfo);
        }
        UserSuggestionInfo userSuggestionInfo2 = rivalExtraInfo.friendSuggestionInfo;
        if (userSuggestionInfo2 != null) {
            _UserSuggestionInfo_ProtoDecoder.LJ(userSuggestionInfo2);
        }
        ActivityBadgeInfo activityBadgeInfo = rivalExtraInfo.activityBadgeInfo;
        if (activityBadgeInfo != null) {
            _ActivityBadgeInfo_ProtoDecoder.LJ(activityBadgeInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RivalExtraInfo rivalExtraInfo) {
        LJ(rivalExtraInfo);
    }

    @Override // X.C0IMD
    public final RivalExtraInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalExtraInfo rivalExtraInfo, List list) {
    }
}
