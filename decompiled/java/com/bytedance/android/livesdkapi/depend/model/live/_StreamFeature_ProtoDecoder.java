package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StreamFeature_ProtoDecoder implements C0IMD<StreamFeature> {
    public static StreamFeature LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StreamFeature streamFeature = new StreamFeature();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            streamFeature.options = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        streamFeature.projectKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    streamFeature.featureName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return streamFeature;
            }
        }
    }

    @Override // X.C0IMD
    public final StreamFeature LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(StreamFeature streamFeature) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StreamFeature streamFeature, List list) {
    }
}
