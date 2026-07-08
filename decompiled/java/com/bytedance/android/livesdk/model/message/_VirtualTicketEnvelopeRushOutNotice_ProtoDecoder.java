package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _VirtualTicketEnvelopeRushOutNotice_ProtoDecoder implements C0IMD<VirtualTicketEnvelopeRushOutNotice> {
    public static VirtualTicketEnvelopeRushOutNotice LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        VirtualTicketEnvelopeRushOutNotice virtualTicketEnvelopeRushOutNotice = new VirtualTicketEnvelopeRushOutNotice();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        virtualTicketEnvelopeRushOutNotice.actualEndTimeSec = c1516680pZS.LJIIJJI();
                    }
                } else {
                    virtualTicketEnvelopeRushOutNotice.envelopeId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return virtualTicketEnvelopeRushOutNotice;
            }
        }
    }

    @Override // X.C0IMD
    public final VirtualTicketEnvelopeRushOutNotice LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(VirtualTicketEnvelopeRushOutNotice virtualTicketEnvelopeRushOutNotice) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VirtualTicketEnvelopeRushOutNotice virtualTicketEnvelopeRushOutNotice, List list) {
    }
}
