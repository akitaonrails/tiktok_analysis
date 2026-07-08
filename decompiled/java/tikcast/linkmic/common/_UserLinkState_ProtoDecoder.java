package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserLinkState_ProtoDecoder implements C0IMD<UserLinkState> {
    public static UserLinkState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserLinkState userLinkState = new UserLinkState();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        userLinkState.source = c1516680pZS.LJIIJ();
                    }
                } else {
                    userLinkState.status = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userLinkState;
            }
        }
    }

    @Override // X.C0IMD
    public final UserLinkState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UserLinkState userLinkState) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserLinkState userLinkState, List list) {
    }
}
