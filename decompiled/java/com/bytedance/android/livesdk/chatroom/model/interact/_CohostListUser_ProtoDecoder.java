package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class _CohostListUser_ProtoDecoder implements C0IMD<CohostListUser> {
    public static CohostListUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostListUser cohostListUser = new CohostListUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        cohostListUser.userId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        cohostListUser.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        cohostListUser.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        cohostListUser.linkedTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 5:
                        cohostListUser.playType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        cohostListUser.roomId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 7:
                        cohostListUser.linkmicUserStatus = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        cohostListUser.linkRemainingTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        cohostListUser.permissionType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        cohostListUser.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        cohostListUser.followStatus = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        cohostListUser.isLowVersion = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        cohostListUser.rivalUserId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 14:
                        cohostListUser.rivalRoomId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 15:
                        cohostListUser.isInitiator = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 16:
                        cohostListUser.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        cohostListUser.bestTeammateUid = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        cohostListUser.hasTopicPerm = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 19:
                        cohostListUser.innerChannelId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostListUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostListUser cohostListUser) {
        ImageModel imageModel = cohostListUser.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final CohostListUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostListUser cohostListUser, List list) {
    }
}
