package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorMessage_ProtoDecoder implements C0IMD<AnchorMessage> {
    public static AnchorMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorMessage anchorMessage = new AnchorMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    anchorMessage.source = c1516680pZS.LJIIJ();
                                }
                            } else {
                                anchorMessage.status = c1516680pZS.LJIIJ();
                            }
                        } else {
                            anchorMessage.rtcStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        anchorMessage.linkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorMessage.uid = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorMessage anchorMessage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorMessage anchorMessage, List list) {
    }
}
