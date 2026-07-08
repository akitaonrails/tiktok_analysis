package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParams_ProtoDecoder implements C0IMD<CapsuleBizParams> {
    public static CapsuleBizParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParams capsuleBizParams = new CapsuleBizParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        capsuleBizParams.cohost = _CapsuleBizParamsCohost_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 3:
                        capsuleBizParams.randomGift = _CapsuleBizParamsRandomGift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        capsuleBizParams.effectParams = _CapsuleBizParamsNewAnchorEffect_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        capsuleBizParams.commentFlaggedPrompt = _CapsuleBizParamsCommentFlaggedPrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        capsuleBizParams.multiGuestInviteGuide = _CapsuleBizParamsMultiGuestInviteGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        capsuleBizParams.anchorPinPerk = _CapsuleBizParamsAnchorPinPerk_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        capsuleBizParams.gamingModeratorsCommentGuide = _CapsuleBizParamsGamingModeratorsCommentGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        capsuleBizParams.commentMuteRulePrompt = _CapsuleBizParamsCommentMuteRulePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        capsuleBizParams.commentFlaggedPromptForNewUser = _CapsuleBizParamsCommentFlaggedPromptForNewUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        capsuleBizParams.moderatorGuideInfo = _CapsuleBizParamsModeratorGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        capsuleBizParams.multiGuestApplyGuide = _CapsuleBizParamsMultiGuestApplyGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        capsuleBizParams.ecom = _CapsuleBizParamsEcom_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleBizParams;
            }
        }
    }

    public static void LJ(CapsuleBizParams capsuleBizParams) {
        User user;
        User user2;
        Gift gift;
        CapsuleBizParamsCohost capsuleBizParamsCohost = capsuleBizParams.cohost;
        if (capsuleBizParamsCohost != null) {
            _CapsuleBizParamsCohost_ProtoDecoder.LJ(capsuleBizParamsCohost);
        }
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift = capsuleBizParams.randomGift;
        if (capsuleBizParamsRandomGift != null && (gift = capsuleBizParamsRandomGift.gift) != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
        CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide = capsuleBizParams.multiGuestInviteGuide;
        if (capsuleBizParamsMultiGuestInviteGuide != null) {
            User user3 = capsuleBizParamsMultiGuestInviteGuide.inviteeUser;
            if (user3 != null) {
                _User_ProtoDecoder.LJ(user3);
            }
            LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide = capsuleBizParamsMultiGuestInviteGuide.noticeGuide;
            if (linkMicAudienceInviteGuide != null && (user2 = linkMicAudienceInviteGuide.user) != null) {
                _User_ProtoDecoder.LJ(user2);
            }
            LinkmicAudienceInviteGroupChatMemberGuide linkmicAudienceInviteGroupChatMemberGuide = capsuleBizParamsMultiGuestInviteGuide.groupChatMemberInviteGuide;
            if (linkmicAudienceInviteGroupChatMemberGuide != null && linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds == null) {
                linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds = new ArrayList();
            }
        }
        CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide = capsuleBizParams.gamingModeratorsCommentGuide;
        if (capsuleBizParamsGamingModeratorsCommentGuide != null) {
            _CapsuleBizParamsGamingModeratorsCommentGuide_ProtoDecoder.LJ(capsuleBizParamsGamingModeratorsCommentGuide);
        }
        CapsuleBizParamsCommentFlaggedPromptForNewUser capsuleBizParamsCommentFlaggedPromptForNewUser = capsuleBizParams.commentFlaggedPromptForNewUser;
        if (capsuleBizParamsCommentFlaggedPromptForNewUser != null && capsuleBizParamsCommentFlaggedPromptForNewUser.commentIds == null) {
            capsuleBizParamsCommentFlaggedPromptForNewUser.commentIds = new ArrayList();
        }
        CapsuleBizParamsModeratorGuide capsuleBizParamsModeratorGuide = capsuleBizParams.moderatorGuideInfo;
        if (capsuleBizParamsModeratorGuide != null) {
            User user4 = capsuleBizParamsModeratorGuide.hvUser;
            if (user4 != null) {
                _User_ProtoDecoder.LJ(user4);
            }
            Text text = capsuleBizParamsModeratorGuide.welcomeMsg;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
            if (capsuleBizParamsModeratorGuide.recommendSensitiveWords == null) {
                capsuleBizParamsModeratorGuide.recommendSensitiveWords = new ArrayList();
            }
        }
        CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide = capsuleBizParams.multiGuestApplyGuide;
        if (capsuleBizParamsMultiGuestApplyGuide != null) {
            User user5 = capsuleBizParamsMultiGuestApplyGuide.applyUser;
            if (user5 != null) {
                _User_ProtoDecoder.LJ(user5);
            }
            LinkmicAudienceApplyGuide linkmicAudienceApplyGuide = capsuleBizParamsMultiGuestApplyGuide.applyNoticeGuide;
            if (linkmicAudienceApplyGuide != null && (user = linkmicAudienceApplyGuide.user) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CapsuleBizParams capsuleBizParams) {
        LJ(capsuleBizParams);
    }

    @Override // X.C0IMD
    public final CapsuleBizParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParams capsuleBizParams, List list) {
    }
}
