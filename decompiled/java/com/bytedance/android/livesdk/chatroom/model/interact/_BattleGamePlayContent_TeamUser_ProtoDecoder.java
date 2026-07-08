package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleGamePlayContent_TeamUser_ProtoDecoder implements C0IMD<BattleGamePlayContent.TeamUser> {
    public static BattleGamePlayContent.TeamUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleGamePlayContent.TeamUser teamUser = new BattleGamePlayContent.TeamUser();
        teamUser.userId = new ArrayList();
        teamUser.userInfoList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            teamUser.userInfoList.add(_BattleGamePlayContent_TeamUser_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        teamUser.userId.add(Long.valueOf(c1516680pZS.LJIIJJI()));
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

    public static void LJ(BattleGamePlayContent.TeamUser teamUser) {
        if (teamUser.userId == null) {
            teamUser.userId = new ArrayList();
        }
        List<BattleGamePlayContent.TeamUser.UserInfo> list = teamUser.userInfoList;
        if (list == null) {
            teamUser.userInfoList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BattleGamePlayContent.TeamUser.UserInfo> it2 = teamUser.userInfoList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleGamePlayContent.TeamUser teamUser) {
        LJ(teamUser);
    }

    @Override // X.C0IMD
    public final BattleGamePlayContent.TeamUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleGamePlayContent.TeamUser teamUser, List list) {
    }
}
