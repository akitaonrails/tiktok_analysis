package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TeamMatchCampaign_ProtoDecoder implements C0IMD<TeamMatchCampaign> {
    public static TeamMatchCampaign LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TeamMatchCampaign teamMatchCampaign = new TeamMatchCampaign();
        teamMatchCampaign.startSfxTeamId = new ArrayList();
        teamMatchCampaign.bestTeammateRelation = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            teamMatchCampaign.hasTeamMatchMvpSfx = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        teamMatchCampaign.startSfxTeamId.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    teamMatchCampaign.bestTeammateRelation.add(_BestTeammateRelation_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return teamMatchCampaign;
            }
        }
    }

    public static void LJ(TeamMatchCampaign teamMatchCampaign) {
        List<BestTeammateRelation> list = teamMatchCampaign.bestTeammateRelation;
        if (list == null) {
            teamMatchCampaign.bestTeammateRelation = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<BestTeammateRelation> it2 = teamMatchCampaign.bestTeammateRelation.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (teamMatchCampaign.startSfxTeamId == null) {
            teamMatchCampaign.startSfxTeamId = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TeamMatchCampaign teamMatchCampaign) {
        LJ(teamMatchCampaign);
    }

    @Override // X.C0IMD
    public final TeamMatchCampaign LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TeamMatchCampaign teamMatchCampaign, List list) {
    }
}
