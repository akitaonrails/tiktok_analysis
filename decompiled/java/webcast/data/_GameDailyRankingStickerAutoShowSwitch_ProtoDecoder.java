package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameDailyRankingStickerAutoShowSwitch_ProtoDecoder implements C0IMD<GameDailyRankingStickerAutoShowSwitch> {
    public static GameDailyRankingStickerAutoShowSwitch LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameDailyRankingStickerAutoShowSwitch gameDailyRankingStickerAutoShowSwitch = new GameDailyRankingStickerAutoShowSwitch();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    gameDailyRankingStickerAutoShowSwitch.value = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameDailyRankingStickerAutoShowSwitch;
            }
        }
    }

    @Override // X.C0IMD
    public final GameDailyRankingStickerAutoShowSwitch LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GameDailyRankingStickerAutoShowSwitch gameDailyRankingStickerAutoShowSwitch) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameDailyRankingStickerAutoShowSwitch gameDailyRankingStickerAutoShowSwitch, List list) {
    }
}
