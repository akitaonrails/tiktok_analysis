package webcast.api.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.battle.BattleAcceptResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleAcceptResponse_ResponseData_ProtoDecoder implements C0IMD<BattleAcceptResponse.ResponseData> {
    @Override // X.C0IMD
    public final BattleAcceptResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BattleAcceptResponse.ResponseData responseData = new BattleAcceptResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.isLastAccept = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleAcceptResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleAcceptResponse.ResponseData responseData, List list) {
    }
}
