package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserMultiPhaseTaskOwnerState_ProtoDecoder implements C0IMD<UserMultiPhaseTaskOwnerState> {
    public static UserMultiPhaseTaskOwnerState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserMultiPhaseTaskOwnerState userMultiPhaseTaskOwnerState = new UserMultiPhaseTaskOwnerState();
        userMultiPhaseTaskOwnerState.phases = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        userMultiPhaseTaskOwnerState.currentPhaseIdx = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        userMultiPhaseTaskOwnerState.roundIdx = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        userMultiPhaseTaskOwnerState.phases.add(_UserMultiPhaseTaskOwnerPhase_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        userMultiPhaseTaskOwnerState.ownerUid = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        userMultiPhaseTaskOwnerState.taskRepeatedTimes = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        userMultiPhaseTaskOwnerState.totalRepeatTimes = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        userMultiPhaseTaskOwnerState.featureMeta = _FeatureMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        userMultiPhaseTaskOwnerState.stateId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userMultiPhaseTaskOwnerState;
            }
        }
    }

    public static void LJ(UserMultiPhaseTaskOwnerState userMultiPhaseTaskOwnerState) {
        List<UserMultiPhaseTaskOwnerPhase> list = userMultiPhaseTaskOwnerState.phases;
        if (list == null) {
            userMultiPhaseTaskOwnerState.phases = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (UserMultiPhaseTaskOwnerPhase userMultiPhaseTaskOwnerPhase : userMultiPhaseTaskOwnerState.phases) {
            if (userMultiPhaseTaskOwnerPhase != null) {
                _UserMultiPhaseTaskOwnerPhase_ProtoDecoder.LJ(userMultiPhaseTaskOwnerPhase);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserMultiPhaseTaskOwnerState userMultiPhaseTaskOwnerState) {
        LJ(userMultiPhaseTaskOwnerState);
    }

    @Override // X.C0IMD
    public final UserMultiPhaseTaskOwnerState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserMultiPhaseTaskOwnerState userMultiPhaseTaskOwnerState, List list) {
    }
}
