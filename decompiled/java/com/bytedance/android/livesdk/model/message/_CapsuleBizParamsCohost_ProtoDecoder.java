package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact._GiftGalleryBadgeSection_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParamsCohost_ProtoDecoder implements C0IMD<CapsuleBizParamsCohost> {
    public static CapsuleBizParamsCohost LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParamsCohost capsuleBizParamsCohost = new CapsuleBizParamsCohost();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        capsuleBizParamsCohost.availableFriendNumber = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        capsuleBizParamsCohost.isFollowedByRival = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        capsuleBizParamsCohost.rivalUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        capsuleBizParamsCohost.type = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        capsuleBizParamsCohost.inviteeModelPredictionData = _UserModelPredictionData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        capsuleBizParamsCohost.inviteeRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        capsuleBizParamsCohost.inviteeInnerChannelId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        capsuleBizParamsCohost.inviteeUserInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        capsuleBizParamsCohost.isFriend = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        capsuleBizParamsCohost.subType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        capsuleBizParamsCohost.rivalVoteCount = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        capsuleBizParamsCohost.anchorClassLabel = _GiftGalleryBadgeSection_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        capsuleBizParamsCohost.rivalClassLabel = _GiftGalleryBadgeSection_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleBizParamsCohost;
            }
        }
    }

    public static void LJ(CapsuleBizParamsCohost capsuleBizParamsCohost) {
        User user = capsuleBizParamsCohost.rivalUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        UserModelPredictionData userModelPredictionData = capsuleBizParamsCohost.inviteeModelPredictionData;
        if (userModelPredictionData != null && userModelPredictionData.modelPredictionData == null) {
            userModelPredictionData.modelPredictionData = new HashMap();
        }
        User user2 = capsuleBizParamsCohost.inviteeUserInfo;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        GiftGalleryBadgeSection giftGalleryBadgeSection = capsuleBizParamsCohost.anchorClassLabel;
        if (giftGalleryBadgeSection != null) {
            _GiftGalleryBadgeSection_ProtoDecoder.LJ(giftGalleryBadgeSection);
        }
        GiftGalleryBadgeSection giftGalleryBadgeSection2 = capsuleBizParamsCohost.rivalClassLabel;
        if (giftGalleryBadgeSection2 != null) {
            _GiftGalleryBadgeSection_ProtoDecoder.LJ(giftGalleryBadgeSection2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CapsuleBizParamsCohost capsuleBizParamsCohost) {
        LJ(capsuleBizParamsCohost);
    }

    @Override // X.C0IMD
    public final CapsuleBizParamsCohost LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParamsCohost capsuleBizParamsCohost, List list) {
    }
}
