package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PaidEventPreview_ProtoDecoder implements C0IMD<PaidEventPreview> {
    public static PaidEventPreview LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PaidEventPreview paidEventPreview = new PaidEventPreview();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        paidEventPreview.allowPreviewTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    paidEventPreview.allowPreview = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return paidEventPreview;
            }
        }
    }

    @Override // X.C0IMD
    public final PaidEventPreview LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PaidEventPreview paidEventPreview) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PaidEventPreview paidEventPreview, List list) {
    }
}
