package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostLayoutExtra_ProtoDecoder implements C0IMD<CohostLayoutExtra> {
    @Override // X.C0IMD
    public final CohostLayoutExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostLayoutExtra cohostLayoutExtra = new CohostLayoutExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            cohostLayoutExtra.scene = c1516680pZS.LJIIJ();
                        }
                    } else {
                        cohostLayoutExtra.offsetY = c1516680pZS.LJIIJ();
                    }
                } else {
                    cohostLayoutExtra.isZoomLayout = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostLayoutExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CohostLayoutExtra cohostLayoutExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostLayoutExtra cohostLayoutExtra, List list) {
    }
}
