package com.bytedance.android.livesdk.model.message.ext;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TraceInfo_ProtoDecoder implements C0IMD<TraceInfo> {
    public static TraceInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TraceInfo traceInfo = new TraceInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            traceInfo.sendTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        traceInfo.arrivalTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    traceInfo.operateTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return traceInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final TraceInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TraceInfo traceInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TraceInfo traceInfo, List list) {
    }
}
