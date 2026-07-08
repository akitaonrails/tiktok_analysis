package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GamePlayContent_ProtoDecoder implements C0IMD<GamePlayContent> {
    public static GamePlayContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GamePlayContent gamePlayContent = new GamePlayContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    gamePlayContent.battleGameplayContent = _BattleGamePlayContent_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gamePlayContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GamePlayContent gamePlayContent) {
        BattleGamePlayContent battleGamePlayContent = gamePlayContent.battleGameplayContent;
        if (battleGamePlayContent != null) {
            _BattleGamePlayContent_ProtoDecoder.LJ(battleGamePlayContent);
        }
    }

    @Override // X.C0IMD
    public final GamePlayContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GamePlayContent gamePlayContent, List list) {
    }
}
