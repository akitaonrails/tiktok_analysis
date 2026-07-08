package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SpotInfo_ProtoDecoder implements C0IMD<SpotInfo> {
    public static SpotInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SpotInfo spotInfo = new SpotInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        spotInfo.spotId = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        spotInfo.posIdentity = _PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        spotInfo.multiGuestSpotExtra = _MultiGuestSpotExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        spotInfo.multiGuestSpotNonSeiExtra = _MultiGuestSpotNonSeiExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        spotInfo.cohostSpotExtra = _CohostTypeSpotExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        CohostTypeSpotNonSeiExtra cohostTypeSpotNonSeiExtra = new CohostTypeSpotNonSeiExtra();
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        while (c1516680pZS.LJI() != -1) {
                            C1516700pZU.LJ(c1516680pZS);
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        spotInfo.cohostSpotNonSeiExtra = cohostTypeSpotNonSeiExtra;
                        break;
                    case 7:
                        spotInfo.posIdentityExtra = _PosIdentityExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return spotInfo;
            }
        }
    }

    public static void LJ(SpotInfo spotInfo) {
        MultiGuestSpotExtra multiGuestSpotExtra = spotInfo.multiGuestSpotExtra;
        MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra = spotInfo.multiGuestSpotNonSeiExtra;
    }

    @Override // X.C0IMD
    public final void LIZ(SpotInfo spotInfo) {
        LJ(spotInfo);
    }

    @Override // X.C0IMD
    public final SpotInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SpotInfo spotInfo, List list) {
    }
}
