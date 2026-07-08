package com.bytedance.android.livesdk.model;

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
public final class _Portal_ProtoDecoder implements C0IMD<Portal> {
    public static Portal LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Portal portal = new Portal();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        portal.startTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        portal.enterCount = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 3:
                        portal.sugarDaddy = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        portal.roomId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 5:
                        portal.anchor = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        portal.portalId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 7:
                        portal.userType = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        portal.inviteeCount = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        portal.status = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        portal.waitDuration = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        portal.rewardDuration = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        portal.totalAmount = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        portal.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return portal;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Portal portal) {
        Portal portal2 = portal;
        User user = portal2.sugarDaddy;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = portal2.anchor;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        ImageModel imageModel = portal2.cover;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final Portal LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Portal portal, List list) {
    }
}
