package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TPFormat_ProtoDecoder implements C0IMD<TPFormat> {
    public static TPFormat LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TPFormat tPFormat = new TPFormat();
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
                                tPFormat.fontSize = c1516680pZS.LJIIJ();
                            }
                        } else {
                            tPFormat.weight = c1516680pZS.LJIIJ();
                        }
                    } else {
                        tPFormat.tuxFont = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    tPFormat.color = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tPFormat;
            }
        }
    }

    @Override // X.C0IMD
    public final TPFormat LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TPFormat tPFormat) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TPFormat tPFormat, List list) {
    }
}
