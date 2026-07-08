package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RealtimeLiveCenterWhiteBoxIM_ProtoDecoder implements C0IMD<RealtimeLiveCenterWhiteBoxIM> {
    public static RealtimeLiveCenterWhiteBoxIM LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterWhiteBoxIM realtimeLiveCenterWhiteBoxIM = new RealtimeLiveCenterWhiteBoxIM();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            realtimeLiveCenterWhiteBoxIM.showText = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        realtimeLiveCenterWhiteBoxIM.suggestionId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    realtimeLiveCenterWhiteBoxIM.viewer = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeLiveCenterWhiteBoxIM;
            }
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterWhiteBoxIM LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RealtimeLiveCenterWhiteBoxIM realtimeLiveCenterWhiteBoxIM) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterWhiteBoxIM realtimeLiveCenterWhiteBoxIM, List list) {
    }
}
