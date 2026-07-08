package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FeatureMeta_ProtoDecoder implements C0IMD<FeatureMeta> {
    public static FeatureMeta LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FeatureMeta featureMeta = new FeatureMeta();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        featureMeta.roleType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        featureMeta.featureFeId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        featureMeta.tabIndex = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        featureMeta.currentInterval = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        featureMeta.intervalStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        featureMeta.intervalEndTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return featureMeta;
            }
        }
    }

    @Override // X.C0IMD
    public final FeatureMeta LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FeatureMeta featureMeta) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FeatureMeta featureMeta, List list) {
    }
}
