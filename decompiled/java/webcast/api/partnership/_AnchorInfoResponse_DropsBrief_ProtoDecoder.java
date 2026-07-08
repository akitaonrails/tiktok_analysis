package webcast.api.partnership;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.partnership.AnchorInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorInfoResponse_DropsBrief_ProtoDecoder implements C0IMD<AnchorInfoResponse.DropsBrief> {
    public static AnchorInfoResponse.DropsBrief LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorInfoResponse.DropsBrief dropsBrief = new AnchorInfoResponse.DropsBrief();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            dropsBrief.beginTimestamp = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        dropsBrief.icon = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    dropsBrief.dropsId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return dropsBrief;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorInfoResponse.DropsBrief LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorInfoResponse.DropsBrief dropsBrief) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorInfoResponse.DropsBrief dropsBrief, List list) {
    }
}
