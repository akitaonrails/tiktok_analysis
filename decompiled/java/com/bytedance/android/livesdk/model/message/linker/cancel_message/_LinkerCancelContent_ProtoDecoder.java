package com.bytedance.android.livesdk.model.message.linker.cancel_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerCancelContent_ProtoDecoder implements C0IMD<LinkerCancelContent> {
    public static LinkerCancelContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerCancelContent linkerCancelContent = new LinkerCancelContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkerCancelContent.cancelType = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        linkerCancelContent.inviteeUid = c1516680pZS.LJIIJJI();
                    }
                } else {
                    linkerCancelContent.inviterUid = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerCancelContent;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerCancelContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerCancelContent linkerCancelContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerCancelContent linkerCancelContent, List list) {
    }
}
