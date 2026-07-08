package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestBizLayoutExtra_ProtoDecoder implements C0IMD<MultiGuestBizLayoutExtra> {
    public static MultiGuestBizLayoutExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestBizLayoutExtra multiGuestBizLayoutExtra = new MultiGuestBizLayoutExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    multiGuestBizLayoutExtra.justDanceLayoutExtra = _JustDanceLayoutExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestBizLayoutExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestBizLayoutExtra multiGuestBizLayoutExtra) {
    }

    @Override // X.C0IMD
    public final MultiGuestBizLayoutExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestBizLayoutExtra multiGuestBizLayoutExtra, List list) {
    }
}
