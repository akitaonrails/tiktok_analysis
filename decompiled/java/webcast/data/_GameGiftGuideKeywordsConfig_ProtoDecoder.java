package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameGiftGuideKeywordsConfig_ProtoDecoder implements C0IMD<GameGiftGuideKeywordsConfig> {
    public static GameGiftGuideKeywordsConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameGiftGuideKeywordsConfig gameGiftGuideKeywordsConfig = new GameGiftGuideKeywordsConfig();
        gameGiftGuideKeywordsConfig.gameGiftGuideKeywordConfig = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    gameGiftGuideKeywordsConfig.gameGiftGuideKeywordConfig.add(_GameGiftGuideKeyword_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameGiftGuideKeywordsConfig;
            }
        }
    }

    public static void LJ(GameGiftGuideKeywordsConfig gameGiftGuideKeywordsConfig) {
        List<GameGiftGuideKeyword> list = gameGiftGuideKeywordsConfig.gameGiftGuideKeywordConfig;
        if (list == null) {
            gameGiftGuideKeywordsConfig.gameGiftGuideKeywordConfig = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<GameGiftGuideKeyword> it2 = gameGiftGuideKeywordsConfig.gameGiftGuideKeywordConfig.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameGiftGuideKeywordsConfig gameGiftGuideKeywordsConfig) {
        LJ(gameGiftGuideKeywordsConfig);
    }

    @Override // X.C0IMD
    public final GameGiftGuideKeywordsConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameGiftGuideKeywordsConfig gameGiftGuideKeywordsConfig, List list) {
    }
}
