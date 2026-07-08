package com.bytedance.android.livesdk.model.message.linker.listchangemessage;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkListUser_ProtoDecoder implements C0IMD<LinkListUser> {
    public static LinkListUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkListUser linkListUser = new LinkListUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkListUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkListUser.modifyTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkListUser.linkType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        linkListUser.roleType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        linkListUser.linkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkListUser.payedMoney = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        linkListUser.fanTicket = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        linkListUser.fanTicketType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkListUser.linkUserType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkListUser.blurredAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkListUser;
            }
        }
    }

    public static void LJ(LinkListUser linkListUser) {
        User user = linkListUser.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        ImageModel imageModel = linkListUser.blurredAvatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkListUser linkListUser) {
        LJ(linkListUser);
    }

    @Override // X.C0IMD
    public final LinkListUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkListUser linkListUser, List list) {
    }
}
