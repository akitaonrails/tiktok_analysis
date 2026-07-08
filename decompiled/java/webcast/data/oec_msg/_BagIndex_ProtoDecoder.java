package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BagIndex_ProtoDecoder implements C0IMD<BagIndex> {
    public static BagIndex LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BagIndex bagIndex = new BagIndex();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bagIndex.value = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bagIndex;
            }
        }
    }

    @Override // X.C0IMD
    public final BagIndex LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BagIndex bagIndex) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BagIndex bagIndex, List list) {
    }
}
