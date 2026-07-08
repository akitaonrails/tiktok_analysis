package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InviterRivalExtra_ProtoDecoder implements C0IMD<InviterRivalExtra> {
    public static InviterRivalExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        InviterRivalExtra inviterRivalExtra = new InviterRivalExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        inviterRivalExtra.textType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        inviterRivalExtra.text = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        inviterRivalExtra.label = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        inviterRivalExtra.userCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        inviterRivalExtra.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        inviterRivalExtra.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        inviterRivalExtra.authenticationInfo = _AuthenticationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        inviterRivalExtra.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        inviterRivalExtra.followStatus = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        inviterRivalExtra.mHashtag = _Hashtag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        inviterRivalExtra.userId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        inviterRivalExtra.isBestTeammate = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 14:
                        inviterRivalExtra.optPairInfo = _OptPairInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        inviterRivalExtra.followerCount = c1516680pZS.LJIIJJI();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inviterRivalExtra;
            }
        }
    }

    public static void LJ(InviterRivalExtra inviterRivalExtra) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3 = inviterRivalExtra.avatarThumb;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        AuthenticationInfo authenticationInfo = inviterRivalExtra.authenticationInfo;
        if (authenticationInfo != null && (imageModel2 = authenticationInfo.authenticationBadge) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        Hashtag hashtag = inviterRivalExtra.mHashtag;
        if (hashtag != null && (imageModel = hashtag.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        OptPairInfo optPairInfo = inviterRivalExtra.optPairInfo;
        if (optPairInfo != null) {
            _OptPairInfo_ProtoDecoder.LJ(optPairInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(InviterRivalExtra inviterRivalExtra) {
        LJ(inviterRivalExtra);
    }

    @Override // X.C0IMD
    public final InviterRivalExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InviterRivalExtra inviterRivalExtra, List list) {
    }
}
