package com.bytedance.android.livesdk.goody_bag.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoodyBagSkin_ProtoDecoder implements C0IMD<GoodyBagSkin> {
    public static GoodyBagSkin LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoodyBagSkin goodyBagSkin = new GoodyBagSkin();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    goodyBagSkin.skinId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goodyBagSkin;
            }
        }
    }

    @Override // X.C0IMD
    public final GoodyBagSkin LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GoodyBagSkin goodyBagSkin) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoodyBagSkin goodyBagSkin, List list) {
    }
}
