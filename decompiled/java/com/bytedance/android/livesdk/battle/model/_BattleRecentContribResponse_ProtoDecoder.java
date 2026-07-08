package com.bytedance.android.livesdk.battle.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.battle.model.BattleRecentContribResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleRecentContribResponse_ProtoDecoder implements C0IMD<BattleRecentContribResponse> {
    @Override // X.C0IMD
    public final void LIZ(BattleRecentContribResponse battleRecentContribResponse) {
        BattleRecentContribResponse.ResponseData responseData = battleRecentContribResponse.data;
        if (responseData != null) {
            _BattleRecentContribResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final BattleRecentContribResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BattleRecentContribResponse battleRecentContribResponse = new BattleRecentContribResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    battleRecentContribResponse.data = _BattleRecentContribResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleRecentContribResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleRecentContribResponse battleRecentContribResponse, List list) {
    }
}
