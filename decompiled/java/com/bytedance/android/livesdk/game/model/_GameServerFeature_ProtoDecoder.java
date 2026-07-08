package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameServerFeature_ProtoDecoder implements C0IMD<GameServerFeature> {
    public static GameServerFeature LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameServerFeature gameServerFeature = new GameServerFeature();
        gameServerFeature.valueMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            String strLIZLLL = null;
                            String strLIZLLL2 = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 == -1) {
                                    break;
                                }
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            }
                            c1516680pZS.LJ(jLIZJ2);
                            if (strLIZLLL != null) {
                                if (strLIZLLL2 != null) {
                                    gameServerFeature.valueMap.put(strLIZLLL, strLIZLLL2);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        gameServerFeature.value = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameServerFeature.id = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameServerFeature;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameServerFeature gameServerFeature) {
        GameServerFeature gameServerFeature2 = gameServerFeature;
        if (gameServerFeature2.valueMap == null) {
            gameServerFeature2.valueMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final GameServerFeature LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameServerFeature gameServerFeature, List list) {
    }
}
