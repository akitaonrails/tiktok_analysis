package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameTricksMessageContent_ProtoDecoder implements C0IMD<GameTricksMessageContent> {
    public static GameTricksMessageContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameTricksMessageContent gameTricksMessageContent = new GameTricksMessageContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        gameTricksMessageContent.giftInfo = _GameTricksGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameTricksMessageContent.gameTricksType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameTricksMessageContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameTricksMessageContent gameTricksMessageContent) {
    }

    @Override // X.C0IMD
    public final GameTricksMessageContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameTricksMessageContent gameTricksMessageContent, List list) {
    }
}
