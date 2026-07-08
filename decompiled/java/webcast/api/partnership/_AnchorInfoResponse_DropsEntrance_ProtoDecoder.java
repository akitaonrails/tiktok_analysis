package webcast.api.partnership;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.api.partnership.AnchorInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorInfoResponse_DropsEntrance_ProtoDecoder implements C0IMD<AnchorInfoResponse.DropsEntrance> {
    public static AnchorInfoResponse.DropsEntrance LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorInfoResponse.DropsEntrance dropsEntrance = new AnchorInfoResponse.DropsEntrance();
        dropsEntrance.recentDropsBriefs = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        dropsEntrance.permission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        dropsEntrance.hasSign = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        dropsEntrance.rewarded = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        dropsEntrance.icon = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        dropsEntrance.dropsCount = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        dropsEntrance.recentDropsBriefs.add(_AnchorInfoResponse_DropsBrief_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return dropsEntrance;
            }
        }
    }

    public static void LJ(AnchorInfoResponse.DropsEntrance dropsEntrance) {
        List<AnchorInfoResponse.DropsBrief> list = dropsEntrance.recentDropsBriefs;
        if (list == null) {
            dropsEntrance.recentDropsBriefs = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<AnchorInfoResponse.DropsBrief> it2 = dropsEntrance.recentDropsBriefs.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorInfoResponse.DropsEntrance dropsEntrance) {
        LJ(dropsEntrance);
    }

    @Override // X.C0IMD
    public final AnchorInfoResponse.DropsEntrance LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorInfoResponse.DropsEntrance dropsEntrance, List list) {
    }
}
