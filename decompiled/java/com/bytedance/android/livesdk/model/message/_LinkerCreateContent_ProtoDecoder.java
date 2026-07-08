package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerCreateContent_ProtoDecoder implements C0IMD<LinkerCreateContent> {
    public static LinkerCreateContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerCreateContent linkerCreateContent = new LinkerCreateContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkerCreateContent.linkType = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    } else {
                        linkerCreateContent.ownerRoomId = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    linkerCreateContent.ownerId = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerCreateContent;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerCreateContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerCreateContent linkerCreateContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerCreateContent linkerCreateContent, List list) {
    }
}
