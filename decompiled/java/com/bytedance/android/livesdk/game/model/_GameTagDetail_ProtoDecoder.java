package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameTagDetail_ProtoDecoder implements C0IMD<GameTagDetail> {
    public static GameTagDetail LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameTagDetail gameTagDetail = new GameTagDetail();
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
                                    gameTagDetail.displayName = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                gameTagDetail.starlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            gameTagDetail.previewGameMomentEnable = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        gameTagDetail.gameTagName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameTagDetail.gameTagId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameTagDetail;
            }
        }
    }

    @Override // X.C0IMD
    public final GameTagDetail LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GameTagDetail gameTagDetail) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameTagDetail gameTagDetail, List list) {
    }
}
