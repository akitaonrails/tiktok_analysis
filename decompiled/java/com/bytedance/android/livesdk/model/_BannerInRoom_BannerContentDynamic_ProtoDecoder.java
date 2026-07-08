package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.BannerInRoom;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BannerInRoom_BannerContentDynamic_ProtoDecoder implements C0IMD<BannerInRoom.BannerContentDynamic> {
    public static BannerInRoom.BannerContentDynamic LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BannerInRoom.BannerContentDynamic bannerContentDynamic = new BannerInRoom.BannerContentDynamic();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bannerContentDynamic.jsonResource = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bannerContentDynamic;
            }
        }
    }

    @Override // X.C0IMD
    public final BannerInRoom.BannerContentDynamic LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BannerInRoom.BannerContentDynamic bannerContentDynamic) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BannerInRoom.BannerContentDynamic bannerContentDynamic, List list) {
    }
}
