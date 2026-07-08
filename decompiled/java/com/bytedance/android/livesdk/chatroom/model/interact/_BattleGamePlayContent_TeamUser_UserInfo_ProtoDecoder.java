package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleGamePlayContent_TeamUser_UserInfo_ProtoDecoder implements C0IMD<BattleGamePlayContent.TeamUser.UserInfo> {
    public static BattleGamePlayContent.TeamUser.UserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleGamePlayContent.TeamUser.UserInfo userInfo = new BattleGamePlayContent.TeamUser.UserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            userInfo.invitationRole = c1516680pZS.LJIIJ();
                        }
                    } else {
                        userInfo.roomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    userInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleGamePlayContent.TeamUser.UserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleGamePlayContent.TeamUser.UserInfo userInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleGamePlayContent.TeamUser.UserInfo userInfo, List list) {
    }
}
