package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OptPairInfo_TeamInfo_ProtoDecoder implements C0IMD<OptPairInfo.TeamInfo> {
    public static OptPairInfo.TeamInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OptPairInfo.TeamInfo teamInfo = new OptPairInfo.TeamInfo();
        teamInfo.userId = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        teamInfo.userId.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    teamInfo.teamId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return teamInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(OptPairInfo.TeamInfo teamInfo) {
        OptPairInfo.TeamInfo teamInfo2 = teamInfo;
        if (teamInfo2.userId == null) {
            teamInfo2.userId = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final OptPairInfo.TeamInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OptPairInfo.TeamInfo teamInfo, List list) {
    }
}
