package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestSpotNonSeiExtra_ProtoDecoder implements C0IMD<MultiGuestSpotNonSeiExtra> {
    public static MultiGuestSpotNonSeiExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra = new MultiGuestSpotNonSeiExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    multiGuestSpotNonSeiExtra.socialGameUser = _SocialGameUserSpotNonSeiExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestSpotNonSeiExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra) {
    }

    @Override // X.C0IMD
    public final MultiGuestSpotNonSeiExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra, List list) {
    }
}
