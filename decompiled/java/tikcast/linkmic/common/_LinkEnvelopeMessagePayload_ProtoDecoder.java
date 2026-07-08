package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkEnvelopeMessagePayload_ProtoDecoder implements C0IMD<LinkEnvelopeMessagePayload> {
    public static LinkEnvelopeMessagePayload LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkEnvelopeMessagePayload linkEnvelopeMessagePayload = new LinkEnvelopeMessagePayload();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 100) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        linkEnvelopeMessagePayload.resolutionDemandPayload = _ResolutionDemandPayload_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkEnvelopeMessagePayload.messageType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkEnvelopeMessagePayload;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkEnvelopeMessagePayload linkEnvelopeMessagePayload) {
    }

    @Override // X.C0IMD
    public final LinkEnvelopeMessagePayload LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkEnvelopeMessagePayload linkEnvelopeMessagePayload, List list) {
    }
}
