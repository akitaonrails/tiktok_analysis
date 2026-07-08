package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CoHostBizSpotExtra_ProtoDecoder implements C0IMD<CoHostBizSpotExtra> {
    @Override // X.C0IMD
    public final CoHostBizSpotExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CoHostBizSpotExtra coHostBizSpotExtra = new CoHostBizSpotExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return coHostBizSpotExtra;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CoHostBizSpotExtra coHostBizSpotExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CoHostBizSpotExtra coHostBizSpotExtra, List list) {
    }
}
