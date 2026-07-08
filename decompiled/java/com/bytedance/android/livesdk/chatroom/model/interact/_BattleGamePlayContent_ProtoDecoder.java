package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleGamePlayContent_ProtoDecoder implements C0IMD<BattleGamePlayContent> {
    public static BattleGamePlayContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleGamePlayContent battleGamePlayContent = new BattleGamePlayContent();
        battleGamePlayContent.teamMember = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    battleGamePlayContent.inviteType = c1516680pZS.LJIIJ();
                                }
                            } else {
                                battleGamePlayContent.sourceType = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            battleGamePlayContent.teamMember.add(_BattleGamePlayContent_TeamUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        battleGamePlayContent.groupChannelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    battleGamePlayContent.battleId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleGamePlayContent;
            }
        }
    }

    public static void LJ(BattleGamePlayContent battleGamePlayContent) {
        List<BattleGamePlayContent.TeamUser> list = battleGamePlayContent.teamMember;
        if (list == null) {
            battleGamePlayContent.teamMember = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BattleGamePlayContent.TeamUser teamUser : battleGamePlayContent.teamMember) {
            if (teamUser != null) {
                _BattleGamePlayContent_TeamUser_ProtoDecoder.LJ(teamUser);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleGamePlayContent battleGamePlayContent) {
        LJ(battleGamePlayContent);
    }

    @Override // X.C0IMD
    public final BattleGamePlayContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleGamePlayContent battleGamePlayContent, List list) {
    }
}
