package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameGiftGuideKeyword_ProtoDecoder implements C0IMD<GameGiftGuideKeyword> {
    public static GameGiftGuideKeyword LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameGiftGuideKeyword gameGiftGuideKeyword = new GameGiftGuideKeyword();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            gameGiftGuideKeyword.regrexPattern = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        gameGiftGuideKeyword.value = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameGiftGuideKeyword.type = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameGiftGuideKeyword;
            }
        }
    }

    @Override // X.C0IMD
    public final GameGiftGuideKeyword LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GameGiftGuideKeyword gameGiftGuideKeyword) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameGiftGuideKeyword gameGiftGuideKeyword, List list) {
    }
}
