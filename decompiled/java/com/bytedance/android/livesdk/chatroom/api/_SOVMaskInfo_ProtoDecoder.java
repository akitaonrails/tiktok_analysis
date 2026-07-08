package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SOVMaskInfo_ProtoDecoder implements C0IMD<SOVMaskInfo> {
    public static SOVMaskInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SOVMaskInfo sOVMaskInfo = new SOVMaskInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        sOVMaskInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    sOVMaskInfo.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sOVMaskInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final SOVMaskInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SOVMaskInfo sOVMaskInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SOVMaskInfo sOVMaskInfo, List list) {
    }
}
