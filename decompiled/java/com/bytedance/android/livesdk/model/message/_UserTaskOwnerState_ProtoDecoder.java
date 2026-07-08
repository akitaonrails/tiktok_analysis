package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserTaskOwnerState_ProtoDecoder implements C0IMD<UserTaskOwnerState> {
    public static UserTaskOwnerState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserTaskOwnerState userTaskOwnerState = new UserTaskOwnerState();
        userTaskOwnerState.progresses = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        userTaskOwnerState.uid = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        userTaskOwnerState.roundIdx = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        userTaskOwnerState.repeatedTimes = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        userTaskOwnerState.status = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        userTaskOwnerState.progresses.add(_UserTaskProgress_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        userTaskOwnerState.totalRepeatTimes = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        userTaskOwnerState.featureMeta = _FeatureMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        userTaskOwnerState.stateId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userTaskOwnerState;
            }
        }
    }

    public static void LJ(UserTaskOwnerState userTaskOwnerState) {
        List<UserTaskProgress> list = userTaskOwnerState.progresses;
        if (list == null) {
            userTaskOwnerState.progresses = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<UserTaskProgress> it2 = userTaskOwnerState.progresses.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserTaskOwnerState userTaskOwnerState) {
        LJ(userTaskOwnerState);
    }

    @Override // X.C0IMD
    public final UserTaskOwnerState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserTaskOwnerState userTaskOwnerState, List list) {
    }
}
