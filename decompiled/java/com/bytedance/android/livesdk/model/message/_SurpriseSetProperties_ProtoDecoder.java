package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SurpriseSetProperties_ProtoDecoder implements C0IMD<SurpriseSetProperties> {
    public static SurpriseSetProperties LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SurpriseSetProperties surpriseSetProperties = new SurpriseSetProperties();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            surpriseSetProperties.status = c1516680pZS.LJIIJ();
                        }
                    } else {
                        surpriseSetProperties.productAvailableQuantity = c1516680pZS.LJIIJ();
                    }
                } else {
                    surpriseSetProperties.totalProductQuantity = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return surpriseSetProperties;
            }
        }
    }

    @Override // X.C0IMD
    public final SurpriseSetProperties LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SurpriseSetProperties surpriseSetProperties) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SurpriseSetProperties surpriseSetProperties, List list) {
    }
}
