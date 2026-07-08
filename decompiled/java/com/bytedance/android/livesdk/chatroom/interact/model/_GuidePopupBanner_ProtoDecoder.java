package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuidePopupBanner_ProtoDecoder implements C0IMD<GuidePopupBanner> {
    public static GuidePopupBanner LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuidePopupBanner guidePopupBanner = new GuidePopupBanner();
        guidePopupBanner.benefits = new ArrayList();
        guidePopupBanner.topCohostedPartners = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guidePopupBanner.bannerStyle = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        guidePopupBanner.bannerContentType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        guidePopupBanner.topCohostedPartners.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        guidePopupBanner.benefits.add(_Benefit_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        guidePopupBanner.recapTitleType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        guidePopupBanner.timestamp = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guidePopupBanner;
            }
        }
    }

    public static void LJ(GuidePopupBanner guidePopupBanner) {
        List<User> list = guidePopupBanner.topCohostedPartners;
        if (list == null) {
            guidePopupBanner.topCohostedPartners = new ArrayList();
        } else if (!list.isEmpty()) {
            for (User user : guidePopupBanner.topCohostedPartners) {
                if (user != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        List<Benefit> list2 = guidePopupBanner.benefits;
        if (list2 == null) {
            guidePopupBanner.benefits = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<Benefit> it2 = guidePopupBanner.benefits.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuidePopupBanner guidePopupBanner) {
        LJ(guidePopupBanner);
    }

    @Override // X.C0IMD
    public final GuidePopupBanner LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuidePopupBanner guidePopupBanner, List list) {
    }
}
