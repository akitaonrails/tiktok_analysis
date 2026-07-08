package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserApplyState_ProtoDecoder implements C0IMD<UserApplyState> {
    public static UserApplyState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserApplyState userApplyState = new UserApplyState();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            userApplyState.stateId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        userApplyState.uid = c1516680pZS.LJIIJJI();
                    }
                } else {
                    userApplyState.hasApplied = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userApplyState;
            }
        }
    }

    @Override // X.C0IMD
    public final UserApplyState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UserApplyState userApplyState) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserApplyState userApplyState, List list) {
    }
}
