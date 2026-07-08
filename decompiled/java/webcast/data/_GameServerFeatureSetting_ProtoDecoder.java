package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameServerFeatureSetting_ProtoDecoder implements C0IMD<GameServerFeatureSetting> {
    public static GameServerFeatureSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameServerFeatureSetting gameServerFeatureSetting = new GameServerFeatureSetting();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        gameServerFeatureSetting.gblServerFeaturesList = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameServerFeatureSetting.gblServerFeaturesEnable = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameServerFeatureSetting;
            }
        }
    }

    @Override // X.C0IMD
    public final GameServerFeatureSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GameServerFeatureSetting gameServerFeatureSetting) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameServerFeatureSetting gameServerFeatureSetting, List list) {
    }
}
