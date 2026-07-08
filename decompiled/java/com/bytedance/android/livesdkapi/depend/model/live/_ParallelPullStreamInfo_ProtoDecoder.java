package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ParallelPullStreamInfo_ProtoDecoder implements C0IMD<ParallelPullStreamInfo> {
    public static ParallelPullStreamInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ParallelPullStreamInfo parallelPullStreamInfo = new ParallelPullStreamInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        parallelPullStreamInfo.featureDetail = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    parallelPullStreamInfo.enable = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return parallelPullStreamInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final ParallelPullStreamInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ParallelPullStreamInfo parallelPullStreamInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ParallelPullStreamInfo parallelPullStreamInfo, List list) {
    }
}
