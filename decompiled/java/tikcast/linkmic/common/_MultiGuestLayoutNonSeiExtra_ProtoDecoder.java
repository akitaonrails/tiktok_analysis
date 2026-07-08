package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestLayoutNonSeiExtra_ProtoDecoder implements C0IMD<MultiGuestLayoutNonSeiExtra> {
    public static MultiGuestLayoutNonSeiExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra = new MultiGuestLayoutNonSeiExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    multiGuestLayoutNonSeiExtra.socialGame = _SocialGameLayoutNonSeiExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestLayoutNonSeiExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra) {
    }

    @Override // X.C0IMD
    public final MultiGuestLayoutNonSeiExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra, List list) {
    }
}
