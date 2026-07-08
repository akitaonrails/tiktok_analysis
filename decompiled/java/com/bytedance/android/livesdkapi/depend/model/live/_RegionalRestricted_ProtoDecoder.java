package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RegionalRestricted_ProtoDecoder implements C0IMD<RegionalRestricted> {
    public static RegionalRestricted LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RegionalRestricted regionalRestricted = new RegionalRestricted();
        regionalRestricted.blockList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    regionalRestricted.blockList.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return regionalRestricted;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RegionalRestricted regionalRestricted) {
        RegionalRestricted regionalRestricted2 = regionalRestricted;
        if (regionalRestricted2.blockList == null) {
            regionalRestricted2.blockList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final RegionalRestricted LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RegionalRestricted regionalRestricted, List list) {
    }
}
