package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopFrameBannerInfo_ProtoDecoder implements C0IMD<TopFrameBannerInfo> {
    public static TopFrameBannerInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopFrameBannerInfo topFrameBannerInfo = new TopFrameBannerInfo();
        topFrameBannerInfo.logoList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            topFrameBannerInfo.logoList.add(_TopFrameBannerLogo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        topFrameBannerInfo.type = c1516680pZS.LJIIJ();
                    }
                } else {
                    topFrameBannerInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topFrameBannerInfo;
            }
        }
    }

    public static void LJ(TopFrameBannerInfo topFrameBannerInfo) {
        List<TopFrameBannerLogo> list = topFrameBannerInfo.logoList;
        if (list == null) {
            topFrameBannerInfo.logoList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<TopFrameBannerLogo> it2 = topFrameBannerInfo.logoList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopFrameBannerInfo topFrameBannerInfo) {
        LJ(topFrameBannerInfo);
    }

    @Override // X.C0IMD
    public final TopFrameBannerInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopFrameBannerInfo topFrameBannerInfo, List list) {
    }
}
