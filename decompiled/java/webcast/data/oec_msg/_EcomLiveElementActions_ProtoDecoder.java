package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcomLiveElementActions_ProtoDecoder implements C0IMD<EcomLiveElementActions> {
    public static EcomLiveElementActions LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcomLiveElementActions ecomLiveElementActions = new EcomLiveElementActions();
        ecomLiveElementActions.atomActions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        ecomLiveElementActions.version = c1516680pZS.LJIIJJI();
                    }
                } else {
                    ecomLiveElementActions.atomActions.add(_AtomAction_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecomLiveElementActions;
            }
        }
    }

    public static void LJ(EcomLiveElementActions ecomLiveElementActions) {
        List<AtomAction> list = ecomLiveElementActions.atomActions;
        if (list == null) {
            ecomLiveElementActions.atomActions = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<AtomAction> it2 = ecomLiveElementActions.atomActions.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcomLiveElementActions ecomLiveElementActions) {
        LJ(ecomLiveElementActions);
    }

    @Override // X.C0IMD
    public final EcomLiveElementActions LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcomLiveElementActions ecomLiveElementActions, List list) {
    }
}
