package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CommercialContentToggle_ProtoDecoder implements C0IMD<CommercialContentToggle> {
    public static CommercialContentToggle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CommercialContentToggle commercialContentToggle = new CommercialContentToggle();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            commercialContentToggle.promoteThirdParty = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        commercialContentToggle.promoteMyself = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    commercialContentToggle.openCommercialContentToggle = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commercialContentToggle;
            }
        }
    }

    @Override // X.C0IMD
    public final CommercialContentToggle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CommercialContentToggle commercialContentToggle) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommercialContentToggle commercialContentToggle, List list) {
    }
}
