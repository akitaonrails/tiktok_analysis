package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserPlayInfo_ProtoDecoder implements C0IMD<UserPlayInfo> {
    public static UserPlayInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserPlayInfo userPlayInfo = new UserPlayInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        userPlayInfo.playId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        userPlayInfo.playScene = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        userPlayInfo.score = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        userPlayInfo.rank = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        userPlayInfo.targetScore = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        userPlayInfo.userTag = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userPlayInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final UserPlayInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UserPlayInfo userPlayInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserPlayInfo userPlayInfo, List list) {
    }
}
