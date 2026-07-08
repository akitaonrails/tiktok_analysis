package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BagItemPreUpdateInfo_ProtoDecoder implements C0IMD<BagItemPreUpdateInfo> {
    public static BagItemPreUpdateInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BagItemPreUpdateInfo bagItemPreUpdateInfo = new BagItemPreUpdateInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        bagItemPreUpdateInfo.minExpireAt = c1516680pZS.LJIIJJI();
                    }
                } else {
                    bagItemPreUpdateInfo.count = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bagItemPreUpdateInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final BagItemPreUpdateInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BagItemPreUpdateInfo bagItemPreUpdateInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BagItemPreUpdateInfo bagItemPreUpdateInfo, List list) {
    }
}
