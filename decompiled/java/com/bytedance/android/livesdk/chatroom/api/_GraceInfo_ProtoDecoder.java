package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GraceInfo_ProtoDecoder implements C0IMD<GraceInfo> {
    public static GraceInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GraceInfo graceInfo = new GraceInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            graceInfo.isPackageDeleted = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        graceInfo.graceEndTime = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    graceInfo.isInGracePeriod = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return graceInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GraceInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GraceInfo graceInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GraceInfo graceInfo, List list) {
    }
}
