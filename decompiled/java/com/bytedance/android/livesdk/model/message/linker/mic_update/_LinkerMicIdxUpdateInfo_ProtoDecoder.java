package com.bytedance.android.livesdk.model.message.linker.mic_update;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerMicIdxUpdateInfo_ProtoDecoder implements C0IMD<LinkerMicIdxUpdateInfo> {
    public static LinkerMicIdxUpdateInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerMicIdxUpdateInfo linkerMicIdxUpdateInfo = new LinkerMicIdxUpdateInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkerMicIdxUpdateInfo.micIndex = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        linkerMicIdxUpdateInfo.userID = c1516680pZS.LJIIJJI();
                    }
                } else {
                    linkerMicIdxUpdateInfo.operation = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerMicIdxUpdateInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerMicIdxUpdateInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerMicIdxUpdateInfo linkerMicIdxUpdateInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerMicIdxUpdateInfo linkerMicIdxUpdateInfo, List list) {
    }
}
