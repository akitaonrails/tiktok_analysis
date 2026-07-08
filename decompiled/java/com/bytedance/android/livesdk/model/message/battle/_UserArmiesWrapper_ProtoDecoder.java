package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserArmiesWrapper_ProtoDecoder implements C0IMD<UserArmiesWrapper> {
    public static UserArmiesWrapper LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserArmiesWrapper userArmiesWrapper = new UserArmiesWrapper();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        userArmiesWrapper.userArmies = _BattleUserArmies_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    userArmiesWrapper.userId = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userArmiesWrapper;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserArmiesWrapper userArmiesWrapper) {
        BattleUserArmies battleUserArmies = userArmiesWrapper.userArmies;
        if (battleUserArmies != null) {
            _BattleUserArmies_ProtoDecoder.LJ(battleUserArmies);
        }
    }

    @Override // X.C0IMD
    public final UserArmiesWrapper LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserArmiesWrapper userArmiesWrapper, List list) {
    }
}
