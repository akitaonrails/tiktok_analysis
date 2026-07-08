package com.bytedance.android.livesdk.model.message.linker.mute_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerMuteContent_ProtoDecoder implements C0IMD<LinkerMuteContent> {
    public static LinkerMuteContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerMuteContent linkerMuteContent = new LinkerMuteContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        linkerMuteContent.muteStatus = c1516680pZS.LJIIJ();
                    }
                } else {
                    linkerMuteContent.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerMuteContent;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerMuteContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerMuteContent linkerMuteContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerMuteContent linkerMuteContent, List list) {
    }
}
