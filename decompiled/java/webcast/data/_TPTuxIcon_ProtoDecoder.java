package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TPTuxIcon_ProtoDecoder implements C0IMD<TPTuxIcon> {
    public static TPTuxIcon LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TPTuxIcon tPTuxIcon = new TPTuxIcon();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            tPTuxIcon.actionType = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        tPTuxIcon.schema = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    tPTuxIcon.tuxImage = _TPTuxImage_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tPTuxIcon;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TPTuxIcon tPTuxIcon) {
    }

    @Override // X.C0IMD
    public final TPTuxIcon LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TPTuxIcon tPTuxIcon, List list) {
    }
}
