package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleUserArmies_ProtoDecoder implements C0IMD<BattleUserArmies> {
    public static BattleUserArmies LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleUserArmies battleUserArmies = new BattleUserArmies();
        battleUserArmies.userArmies = new ArrayList();
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
                                    battleUserArmies.hostEnigmaUv = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                battleUserArmies.hostEnigmaScore = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            battleUserArmies.anchorIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        battleUserArmies.hostScore = c1516680pZS.LJIIJJI();
                    }
                } else {
                    battleUserArmies.userArmies.add(_BattleUserArmy_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleUserArmies;
            }
        }
    }

    public static void LJ(BattleUserArmies battleUserArmies) {
        ImageModel imageModel;
        List<BattleUserArmy> list = battleUserArmies.userArmies;
        if (list == null) {
            battleUserArmies.userArmies = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BattleUserArmy battleUserArmy : battleUserArmies.userArmies) {
            if (battleUserArmy != null && (imageModel = battleUserArmy.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleUserArmies battleUserArmies) {
        LJ(battleUserArmies);
    }

    @Override // X.C0IMD
    public final BattleUserArmies LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleUserArmies battleUserArmies, List list) {
    }
}
