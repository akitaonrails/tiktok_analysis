package webcast.data.host_board;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Padding_ProtoDecoder implements C0IMD<Padding> {
    public static Padding LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Padding padding = new Padding();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                padding.paddingBottom = c1516680pZS.LJIIJ();
                            }
                        } else {
                            padding.paddingTop = c1516680pZS.LJIIJ();
                        }
                    } else {
                        padding.paddingRight = c1516680pZS.LJIIJ();
                    }
                } else {
                    padding.paddingLeft = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return padding;
            }
        }
    }

    @Override // X.C0IMD
    public final Padding LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Padding padding) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Padding padding, List list) {
    }
}
