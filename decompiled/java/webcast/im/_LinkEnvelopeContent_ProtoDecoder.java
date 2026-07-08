package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._LinkEnvelopeMessagePayload_ProtoDecoder;
import tikcast.linkmic.common._LinkUserIdentity_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkEnvelopeContent_ProtoDecoder implements C0IMD<LinkEnvelopeContent> {
    public static LinkEnvelopeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkEnvelopeContent linkEnvelopeContent = new LinkEnvelopeContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 10) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkEnvelopeContent.messagePayload = _LinkEnvelopeMessagePayload_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        linkEnvelopeContent.receiver = _LinkUserIdentity_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkEnvelopeContent.sender = _LinkUserIdentity_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkEnvelopeContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkEnvelopeContent linkEnvelopeContent) {
    }

    @Override // X.C0IMD
    public final LinkEnvelopeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkEnvelopeContent linkEnvelopeContent, List list) {
    }
}
