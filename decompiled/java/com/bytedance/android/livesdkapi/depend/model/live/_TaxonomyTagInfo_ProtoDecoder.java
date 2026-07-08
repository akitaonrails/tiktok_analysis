package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TaxonomyTagInfo_ProtoDecoder implements C0IMD<TaxonomyTagInfo> {
    public static TaxonomyTagInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TaxonomyTagInfo taxonomyTagInfo = new TaxonomyTagInfo();
        taxonomyTagInfo.level1Tag = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        taxonomyTagInfo.level2Tag = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    taxonomyTagInfo.level1Tag.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return taxonomyTagInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TaxonomyTagInfo taxonomyTagInfo) {
        TaxonomyTagInfo taxonomyTagInfo2 = taxonomyTagInfo;
        if (taxonomyTagInfo2.level1Tag == null) {
            taxonomyTagInfo2.level1Tag = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final TaxonomyTagInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TaxonomyTagInfo taxonomyTagInfo, List list) {
    }
}
