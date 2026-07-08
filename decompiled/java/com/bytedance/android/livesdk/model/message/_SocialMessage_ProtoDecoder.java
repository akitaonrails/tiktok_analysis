package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SocialMessage_ProtoDecoder implements C0IMD<SocialMessage> {
    public static SocialMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SocialMessage socialMessage = new SocialMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        socialMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        socialMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        socialMessage.shareType = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        socialMessage.action = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        socialMessage.shareTarget = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        socialMessage.followCount = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 7:
                        socialMessage.shareDisplayStyle = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        socialMessage.shareCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        socialMessage.publicAreaMessageCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        socialMessage.signature = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        socialMessage.signatureVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        socialMessage.showDurationMs = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        socialMessage.followType = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        socialMessage.targetUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        socialMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return socialMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SocialMessage socialMessage) {
        SocialMessage socialMessage2 = socialMessage;
        CommonMessageData commonMessageData = socialMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = socialMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = socialMessage2.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final SocialMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SocialMessage socialMessage, List list) {
    }
}
