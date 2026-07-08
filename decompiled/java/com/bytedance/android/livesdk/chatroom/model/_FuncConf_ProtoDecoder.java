package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FuncConf_ProtoDecoder implements C0IMD<FuncConf> {
    public static FuncConf LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FuncConf funcConf = new FuncConf();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            funcConf.versionRange = _VersionRange_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        funcConf.priority = c1516680pZS.LJIIJ();
                    }
                } else {
                    funcConf.func = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return funcConf;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FuncConf funcConf) {
    }

    @Override // X.C0IMD
    public final FuncConf LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FuncConf funcConf, List list) {
    }
}
