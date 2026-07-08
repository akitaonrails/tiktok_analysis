package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TeamUsersInfo_ProtoDecoder implements C0IMD<TeamUsersInfo> {
    public static TeamUsersInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TeamUsersInfo teamUsersInfo = new TeamUsersInfo();
        teamUsersInfo.userIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        teamUsersInfo.userIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    teamUsersInfo.teamId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return teamUsersInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TeamUsersInfo teamUsersInfo) {
        TeamUsersInfo teamUsersInfo2 = teamUsersInfo;
        if (teamUsersInfo2.userIds == null) {
            teamUsersInfo2.userIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final TeamUsersInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TeamUsersInfo teamUsersInfo, List list) {
    }
}
