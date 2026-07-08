package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameAction_ProtoDecoder implements C0IMD<GameAction> {
    public static GameAction LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameAction gameAction = new GameAction();
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
                                    gameAction.actionSchema = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                gameAction.followUserInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            gameAction.followUserId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        gameAction.jumpPage = c1516680pZS.LJIIJ();
                    }
                } else {
                    gameAction.actionType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameAction;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameAction gameAction) {
        User user = gameAction.followUserInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final GameAction LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameAction gameAction, List list) {
    }
}
