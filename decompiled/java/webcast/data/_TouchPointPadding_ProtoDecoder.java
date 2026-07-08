package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TouchPointPadding_ProtoDecoder implements C0IMD<TouchPointPadding> {
    public static TouchPointPadding LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TouchPointPadding touchPointPadding = new TouchPointPadding();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        touchPointPadding.vertical = c1516680pZS.LJIIJ();
                    }
                } else {
                    touchPointPadding.horizontal = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return touchPointPadding;
            }
        }
    }

    @Override // X.C0IMD
    public final TouchPointPadding LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TouchPointPadding touchPointPadding) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TouchPointPadding touchPointPadding, List list) {
    }
}
