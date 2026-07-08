package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GeckoAttr_ProtoDecoder implements C0IMD<GeckoAttr> {
    public static GeckoAttr LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GeckoAttr geckoAttr = new GeckoAttr();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        geckoAttr.fileName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    geckoAttr.geckoChannel = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return geckoAttr;
            }
        }
    }

    @Override // X.C0IMD
    public final GeckoAttr LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GeckoAttr geckoAttr) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GeckoAttr geckoAttr, List list) {
    }
}
