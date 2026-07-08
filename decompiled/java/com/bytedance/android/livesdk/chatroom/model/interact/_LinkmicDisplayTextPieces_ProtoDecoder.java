package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicDisplayTextPieces_ProtoDecoder implements C0IMD<LinkmicDisplayTextPieces> {
    public static LinkmicDisplayTextPieces LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkmicDisplayTextPieces linkmicDisplayTextPieces = new LinkmicDisplayTextPieces();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    linkmicDisplayTextPieces.stringPiece = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicDisplayTextPieces;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkmicDisplayTextPieces LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkmicDisplayTextPieces linkmicDisplayTextPieces) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicDisplayTextPieces linkmicDisplayTextPieces, List list) {
    }
}
