package webcast.api.game;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoiceReductionInfo_ProtoDecoder implements C0IMD<NoiceReductionInfo> {
    public static NoiceReductionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoiceReductionInfo noiceReductionInfo = new NoiceReductionInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        noiceReductionInfo.noiceReductionEndtime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    noiceReductionInfo.disableNoiceReduction = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noiceReductionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final NoiceReductionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(NoiceReductionInfo noiceReductionInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoiceReductionInfo noiceReductionInfo, List list) {
    }
}
