package com.bytedance.android.livesdk.model.message.linker.kick_out_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerKickOutContent_ProtoDecoder implements C0IMD<LinkerKickOutContent> {
    public static LinkerKickOutContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerKickOutContent linkerKickOutContent = new LinkerKickOutContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        linkerKickOutContent.kickOutReason = c1516680pZS.LJIIJ();
                    }
                } else {
                    linkerKickOutContent.fromUid = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerKickOutContent;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerKickOutContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerKickOutContent linkerKickOutContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerKickOutContent linkerKickOutContent, List list) {
    }
}
