package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TeamUser_ProtoDecoder implements C0IMD<TeamUser> {
    public static TeamUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TeamUser teamUser = new TeamUser();
        teamUser.userIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        teamUser.userIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    teamUser.teamId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return teamUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TeamUser teamUser) {
        TeamUser teamUser2 = teamUser;
        if (teamUser2.userIds == null) {
            teamUser2.userIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final TeamUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TeamUser teamUser, List list) {
    }
}
