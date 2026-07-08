package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ScrollElement_ProtoDecoder implements C0IMD<ScrollElement> {
    public static ScrollElement LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ScrollElement scrollElement = new ScrollElement();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    scrollElement.productTitle = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return scrollElement;
            }
        }
    }

    @Override // X.C0IMD
    public final ScrollElement LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ScrollElement scrollElement) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ScrollElement scrollElement, List list) {
    }
}
