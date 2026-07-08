package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _VersionRange_ProtoDecoder implements C0IMD<VersionRange> {
    public static VersionRange LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        VersionRange versionRange = new VersionRange();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        versionRange.end = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    versionRange.start = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return versionRange;
            }
        }
    }

    @Override // X.C0IMD
    public final VersionRange LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(VersionRange versionRange) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VersionRange versionRange, List list) {
    }
}
