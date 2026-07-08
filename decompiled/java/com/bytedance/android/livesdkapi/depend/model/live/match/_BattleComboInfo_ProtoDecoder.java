package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleComboInfo_ProtoDecoder implements C0IMD<BattleComboInfo> {
    public static BattleComboInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleComboInfo battleComboInfo = new BattleComboInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleComboInfo.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        battleComboInfo.comboStatus = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        battleComboInfo.comboCount = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        battleComboInfo.comboIconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        battleComboInfo.comboType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        battleComboInfo.comboRuleGuideSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        battleComboInfo.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        battleComboInfo.comboCountStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleComboInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleComboInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleComboInfo battleComboInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleComboInfo battleComboInfo, List list) {
    }
}
