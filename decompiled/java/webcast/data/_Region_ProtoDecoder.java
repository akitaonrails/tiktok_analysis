package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Region_ProtoDecoder implements C0IMD<Region> {
    public static Region LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Region region = new Region();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    region.locationMethod = c1516680pZS.LJIIJ();
                                }
                            } else {
                                region.level = c1516680pZS.LJIIJ();
                            }
                        } else {
                            region.l0Code = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        region.name = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    region.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return region;
            }
        }
    }

    @Override // X.C0IMD
    public final Region LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Region region) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Region region, List list) {
    }
}
