package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SeqDetectResult_ProtoDecoder implements C0IMD<SeqDetectResult> {
    public static SeqDetectResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SeqDetectResult seqDetectResult = new SeqDetectResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        seqDetectResult.detectTimestamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    seqDetectResult.detectedStatus = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return seqDetectResult;
            }
        }
    }

    @Override // X.C0IMD
    public final SeqDetectResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SeqDetectResult seqDetectResult) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SeqDetectResult seqDetectResult, List list) {
    }
}
