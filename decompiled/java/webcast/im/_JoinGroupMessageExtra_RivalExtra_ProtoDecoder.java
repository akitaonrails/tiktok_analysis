package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.ActivityBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._ActivityBadgeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._GiftGalleryBadgeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._RivalsGameTag_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopHostInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinGroupMessageExtra_RivalExtra_ProtoDecoder implements C0IMD<JoinGroupMessageExtra.RivalExtra> {
    public static JoinGroupMessageExtra.RivalExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinGroupMessageExtra.RivalExtra rivalExtra = new JoinGroupMessageExtra.RivalExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 4:
                        rivalExtra.userCount = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        rivalExtra.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        rivalExtra.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        rivalExtra.authenticationInfo = _JoinGroupMessageExtra_RivalExtra_AuthenticationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        rivalExtra.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        rivalExtra.followStatus = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        rivalExtra.hashtag = _Hashtag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        rivalExtra.topHostInfo = _TopHostInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        rivalExtra.userId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        rivalExtra.isBestTeammate = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 14:
                        rivalExtra.optPairInfo = _OptPairInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        rivalExtra.eoyLevel = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        rivalExtra.nudgeInfo = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        rivalExtra.reservationId = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        rivalExtra.followerCount = c1516680pZS.LJIIJJI();
                        break;
                    case 19:
                        rivalExtra.gameTag = _RivalsGameTag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        rivalExtra.giftGalleryBadgeInfo = _GiftGalleryBadgeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        rivalExtra.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 22:
                        rivalExtra.activityBadgeInfo = _ActivityBadgeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rivalExtra;
            }
        }
    }

    public static void LJ(JoinGroupMessageExtra.RivalExtra rivalExtra) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3 = rivalExtra.avatarThumb;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        JoinGroupMessageExtra.RivalExtra.AuthenticationInfo authenticationInfo = rivalExtra.authenticationInfo;
        if (authenticationInfo != null && (imageModel2 = authenticationInfo.authenticationBadge) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        Hashtag hashtag = rivalExtra.hashtag;
        if (hashtag != null && (imageModel = hashtag.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        OptPairInfo optPairInfo = rivalExtra.optPairInfo;
        if (optPairInfo != null) {
            _OptPairInfo_ProtoDecoder.LJ(optPairInfo);
        }
        GiftGalleryBadgeInfo giftGalleryBadgeInfo = rivalExtra.giftGalleryBadgeInfo;
        if (giftGalleryBadgeInfo != null) {
            _GiftGalleryBadgeInfo_ProtoDecoder.LJ(giftGalleryBadgeInfo);
        }
        ActivityBadgeInfo activityBadgeInfo = rivalExtra.activityBadgeInfo;
        if (activityBadgeInfo != null) {
            _ActivityBadgeInfo_ProtoDecoder.LJ(activityBadgeInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(JoinGroupMessageExtra.RivalExtra rivalExtra) {
        LJ(rivalExtra);
    }

    @Override // X.C0IMD
    public final JoinGroupMessageExtra.RivalExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinGroupMessageExtra.RivalExtra rivalExtra, List list) {
    }
}
