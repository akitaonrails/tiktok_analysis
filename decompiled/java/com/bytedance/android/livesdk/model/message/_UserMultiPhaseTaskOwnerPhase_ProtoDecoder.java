package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserMultiPhaseTaskOwnerPhase_ProtoDecoder implements C0IMD<UserMultiPhaseTaskOwnerPhase> {
    public static UserMultiPhaseTaskOwnerPhase LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserMultiPhaseTaskOwnerPhase userMultiPhaseTaskOwnerPhase = new UserMultiPhaseTaskOwnerPhase();
        userMultiPhaseTaskOwnerPhase.progresses = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        userMultiPhaseTaskOwnerPhase.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        userMultiPhaseTaskOwnerPhase.progresses.add(_UserTaskProgress_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        userMultiPhaseTaskOwnerPhase.repeatedTimes = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        userMultiPhaseTaskOwnerPhase.totalRepeatTimes = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        userMultiPhaseTaskOwnerPhase.roundIdx = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        userMultiPhaseTaskOwnerPhase.status = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userMultiPhaseTaskOwnerPhase;
            }
        }
    }

    public static void LJ(UserMultiPhaseTaskOwnerPhase userMultiPhaseTaskOwnerPhase) {
        List<UserTaskProgress> list = userMultiPhaseTaskOwnerPhase.progresses;
        if (list == null) {
            userMultiPhaseTaskOwnerPhase.progresses = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<UserTaskProgress> it2 = userMultiPhaseTaskOwnerPhase.progresses.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserMultiPhaseTaskOwnerPhase userMultiPhaseTaskOwnerPhase) {
        LJ(userMultiPhaseTaskOwnerPhase);
    }

    @Override // X.C0IMD
    public final UserMultiPhaseTaskOwnerPhase LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserMultiPhaseTaskOwnerPhase userMultiPhaseTaskOwnerPhase, List list) {
    }
}
