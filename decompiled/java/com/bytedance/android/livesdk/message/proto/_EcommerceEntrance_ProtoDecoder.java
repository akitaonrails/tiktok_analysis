package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ProtoDecoder implements C0IMD<EcommerceEntrance> {
    public static EcommerceEntrance LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceEntrance ecommerceEntrance = new EcommerceEntrance();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        ecommerceEntrance.entranceType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        ecommerceEntrance.creatorType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        ecommerceEntrance.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        ecommerceEntrance.shopEntranceInfo = _EcommerceEntrance_ShopEntranceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        ecommerceEntrance.showcaseEntranceInfo = _EcommerceEntrance_ShowcaseEntranceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        ecommerceEntrance.viewVersion = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecommerceEntrance;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcommerceEntrance ecommerceEntrance) {
        EcommerceEntrance ecommerceEntrance2 = ecommerceEntrance;
        EcommerceEntrance.ShopEntranceInfo shopEntranceInfo = ecommerceEntrance2.shopEntranceInfo;
        if (shopEntranceInfo != null) {
            _EcommerceEntrance_ShopEntranceInfo_ProtoDecoder.LJ(shopEntranceInfo);
        }
        EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo = ecommerceEntrance2.showcaseEntranceInfo;
        if (showcaseEntranceInfo != null) {
            _EcommerceEntrance_ShowcaseEntranceInfo_ProtoDecoder.LJ(showcaseEntranceInfo);
        }
    }

    @Override // X.C0IMD
    public final EcommerceEntrance LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceEntrance ecommerceEntrance, List list) {
    }
}
