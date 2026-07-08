package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RealtimeLiveCenterWhiteBoxPreviewIM_ProtoDecoder implements C0IMD<RealtimeLiveCenterWhiteBoxPreviewIM> {
    public static RealtimeLiveCenterWhiteBoxPreviewIM LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterWhiteBoxPreviewIM realtimeLiveCenterWhiteBoxPreviewIM = new RealtimeLiveCenterWhiteBoxPreviewIM();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        realtimeLiveCenterWhiteBoxPreviewIM.bigCardText = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    realtimeLiveCenterWhiteBoxPreviewIM.viewer = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeLiveCenterWhiteBoxPreviewIM;
            }
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterWhiteBoxPreviewIM LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RealtimeLiveCenterWhiteBoxPreviewIM realtimeLiveCenterWhiteBoxPreviewIM) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterWhiteBoxPreviewIM realtimeLiveCenterWhiteBoxPreviewIM, List list) {
    }
}
