package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleUserArmy_ProtoDecoder implements C0IMD<BattleUserArmy> {
    public static BattleUserArmy LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleUserArmy battleUserArmy = new BattleUserArmy();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleUserArmy.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        battleUserArmy.score = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        battleUserArmy.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        battleUserArmy.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        battleUserArmy.diamondScore = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 6:
                        battleUserArmy.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        battleUserArmy.enigmaScore = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        battleUserArmy.isEnigma = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleUserArmy;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleUserArmy battleUserArmy) {
        ImageModel imageModel = battleUserArmy.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final BattleUserArmy LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleUserArmy battleUserArmy, List list) {
    }
}
