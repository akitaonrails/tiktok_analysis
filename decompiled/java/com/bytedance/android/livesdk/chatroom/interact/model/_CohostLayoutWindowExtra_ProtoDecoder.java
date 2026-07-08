package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostLayoutWindowExtra_ProtoDecoder implements C0IMD<CohostLayoutWindowExtra> {
    @Override // X.C0IMD
    public final CohostLayoutWindowExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostLayoutWindowExtra cohostLayoutWindowExtra = new CohostLayoutWindowExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    cohostLayoutWindowExtra.contentType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostLayoutWindowExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CohostLayoutWindowExtra cohostLayoutWindowExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostLayoutWindowExtra cohostLayoutWindowExtra, List list) {
    }
}
