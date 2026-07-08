package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopFrameBannerLogo_ProtoDecoder implements C0IMD<TopFrameBannerLogo> {
    public static TopFrameBannerLogo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopFrameBannerLogo topFrameBannerLogo = new TopFrameBannerLogo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    topFrameBannerLogo.uri = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topFrameBannerLogo;
            }
        }
    }

    @Override // X.C0IMD
    public final TopFrameBannerLogo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TopFrameBannerLogo topFrameBannerLogo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopFrameBannerLogo topFrameBannerLogo, List list) {
    }
}
