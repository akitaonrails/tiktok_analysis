package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerSysKickOutContent_ProtoDecoder implements C0IMD<LinkerSysKickOutContent> {
    public static LinkerSysKickOutContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerSysKickOutContent linkerSysKickOutContent = new LinkerSysKickOutContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        linkerSysKickOutContent.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkerSysKickOutContent.userId = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerSysKickOutContent;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerSysKickOutContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerSysKickOutContent linkerSysKickOutContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerSysKickOutContent linkerSysKickOutContent, List list) {
    }
}
