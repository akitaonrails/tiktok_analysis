package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkPosition_ProtoDecoder implements C0IMD<LinkPosition> {
    public static LinkPosition LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkPosition linkPosition = new LinkPosition();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        linkPosition.positionType = c1516680pZS.LJIIJ();
                    }
                } else {
                    linkPosition.position = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkPosition;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkPosition LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkPosition linkPosition) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkPosition linkPosition, List list) {
    }
}
