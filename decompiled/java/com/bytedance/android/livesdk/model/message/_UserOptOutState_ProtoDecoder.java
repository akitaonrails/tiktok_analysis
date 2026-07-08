package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserOptOutState_ProtoDecoder implements C0IMD<UserOptOutState> {
    public static UserOptOutState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserOptOutState userOptOutState = new UserOptOutState();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            userOptOutState.stateId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        userOptOutState.status = c1516680pZS.LJIIJ();
                    }
                } else {
                    userOptOutState.uid = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userOptOutState;
            }
        }
    }

    @Override // X.C0IMD
    public final UserOptOutState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UserOptOutState userOptOutState) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserOptOutState userOptOutState, List list) {
    }
}
