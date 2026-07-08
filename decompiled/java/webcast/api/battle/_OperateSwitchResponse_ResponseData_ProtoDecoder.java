package webcast.api.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.battle.OperateSwitchResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _OperateSwitchResponse_ResponseData_ProtoDecoder implements C0IMD<OperateSwitchResponse.ResponseData> {
    @Override // X.C0IMD
    public final OperateSwitchResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OperateSwitchResponse.ResponseData responseData = new OperateSwitchResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return responseData;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(OperateSwitchResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OperateSwitchResponse.ResponseData responseData, List list) {
    }
}
