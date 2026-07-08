package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerGuestCancelEnlargeContent_ProtoDecoder implements C0IMD<LinkerGuestCancelEnlargeContent> {
    public static LinkerGuestCancelEnlargeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerGuestCancelEnlargeContent linkerGuestCancelEnlargeContent = new LinkerGuestCancelEnlargeContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkerGuestCancelEnlargeContent.cancelLinkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        linkerGuestCancelEnlargeContent.isRejectEnlarge = c1516680pZS.LJIIJ();
                    }
                } else {
                    linkerGuestCancelEnlargeContent.scene = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerGuestCancelEnlargeContent;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerGuestCancelEnlargeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerGuestCancelEnlargeContent linkerGuestCancelEnlargeContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerGuestCancelEnlargeContent linkerGuestCancelEnlargeContent, List list) {
    }
}
