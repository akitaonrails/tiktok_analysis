package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.GameTag;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameTag_GameAgeRating_ProtoDecoder implements C0IMD<GameTag.GameAgeRating> {
    public static GameTag.GameAgeRating LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameTag.GameAgeRating gameAgeRating = new GameTag.GameAgeRating();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        gameAgeRating.ar = c1516680pZS.LJIIJ();
                    }
                } else {
                    gameAgeRating.rs = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameAgeRating;
            }
        }
    }

    @Override // X.C0IMD
    public final GameTag.GameAgeRating LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GameTag.GameAgeRating gameAgeRating) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameTag.GameAgeRating gameAgeRating, List list) {
    }
}
