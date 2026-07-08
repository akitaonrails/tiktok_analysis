package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CoHostBizLayoutExtra_ProtoDecoder implements C0IMD<CoHostBizLayoutExtra> {
    @Override // X.C0IMD
    public final CoHostBizLayoutExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CoHostBizLayoutExtra coHostBizLayoutExtra = new CoHostBizLayoutExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return coHostBizLayoutExtra;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CoHostBizLayoutExtra coHostBizLayoutExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CoHostBizLayoutExtra coHostBizLayoutExtra, List list) {
    }
}
