package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleUserInfoWrapper_ProtoDecoder implements C0IMD<BattleUserInfoWrapper> {
    public static BattleUserInfoWrapper LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleUserInfoWrapper battleUserInfoWrapper = new BattleUserInfoWrapper();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        battleUserInfoWrapper.userInfo = _BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    battleUserInfoWrapper.userId = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleUserInfoWrapper;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleUserInfoWrapper battleUserInfoWrapper) {
        BattleUserInfo battleUserInfo = battleUserInfoWrapper.userInfo;
        if (battleUserInfo != null) {
            _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
        }
    }

    @Override // X.C0IMD
    public final BattleUserInfoWrapper LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleUserInfoWrapper battleUserInfoWrapper, List list) {
    }
}
