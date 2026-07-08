package webcast.api.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.battle.BattlePlaybookInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BattlePlaybookInfoResponse_ProtoDecoder implements C0IMD<BattlePlaybookInfoResponse> {
    @Override // X.C0IMD
    public final void LIZ(BattlePlaybookInfoResponse battlePlaybookInfoResponse) {
        BattlePlaybookInfoResponse.ResponseData responseData = battlePlaybookInfoResponse.data;
        if (responseData != null) {
            _BattlePlaybookInfoResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final BattlePlaybookInfoResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BattlePlaybookInfoResponse battlePlaybookInfoResponse = new BattlePlaybookInfoResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    battlePlaybookInfoResponse.data = _BattlePlaybookInfoResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battlePlaybookInfoResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattlePlaybookInfoResponse battlePlaybookInfoResponse, List list) {
    }
}
