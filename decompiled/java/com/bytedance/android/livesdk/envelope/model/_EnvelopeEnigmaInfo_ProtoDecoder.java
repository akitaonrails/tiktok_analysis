package com.bytedance.android.livesdk.envelope.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnvelopeEnigmaInfo_ProtoDecoder implements C0IMD<EnvelopeEnigmaInfo> {
    public static EnvelopeEnigmaInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnvelopeEnigmaInfo envelopeEnigmaInfo = new EnvelopeEnigmaInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    envelopeEnigmaInfo.isEnigmaMaskOn = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return envelopeEnigmaInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final EnvelopeEnigmaInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EnvelopeEnigmaInfo envelopeEnigmaInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnvelopeEnigmaInfo envelopeEnigmaInfo, List list) {
    }
}
