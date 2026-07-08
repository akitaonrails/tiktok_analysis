package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AwemeCommerceStructV2_ProtoDecoder implements C0IMD<AwemeCommerceStructV2> {
    public static AwemeCommerceStructV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AwemeCommerceStructV2 awemeCommerceStructV2 = new AwemeCommerceStructV2();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 17) {
                    if (iLJI != 18) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        awemeCommerceStructV2.pseudoAdData = _PseudoAdData_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    awemeCommerceStructV2.isPseudoAd = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return awemeCommerceStructV2;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AwemeCommerceStructV2 awemeCommerceStructV2) {
    }

    @Override // X.C0IMD
    public final AwemeCommerceStructV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AwemeCommerceStructV2 awemeCommerceStructV2, List list) {
    }
}
