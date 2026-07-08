package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcommerceEntrance_SellingPoint_ProtoDecoder implements C0IMD<EcommerceEntrance.SellingPoint> {
    public static EcommerceEntrance.SellingPoint LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceEntrance.SellingPoint sellingPoint = new EcommerceEntrance.SellingPoint();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        sellingPoint.sellingPointType = c1516680pZS.LJIIJ();
                    }
                } else {
                    sellingPoint.showText = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sellingPoint;
            }
        }
    }

    @Override // X.C0IMD
    public final EcommerceEntrance.SellingPoint LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EcommerceEntrance.SellingPoint sellingPoint) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceEntrance.SellingPoint sellingPoint, List list) {
    }
}
