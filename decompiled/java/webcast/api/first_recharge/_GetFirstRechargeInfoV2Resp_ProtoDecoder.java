package webcast.api.first_recharge;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: loaded from: classes.dex */
public final class _GetFirstRechargeInfoV2Resp_ProtoDecoder implements C0IMD<GetFirstRechargeInfoV2Resp> {
    @Override // X.C0IMD
    public final void LIZ(GetFirstRechargeInfoV2Resp getFirstRechargeInfoV2Resp) {
        GetFirstRechargeInfoV2Resp.Data data = getFirstRechargeInfoV2Resp.data;
        if (data != null) {
            _GetFirstRechargeInfoV2Resp_Data_ProtoDecoder.LJ(data);
        }
    }

    @Override // X.C0IMD
    public final GetFirstRechargeInfoV2Resp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetFirstRechargeInfoV2Resp getFirstRechargeInfoV2Resp = new GetFirstRechargeInfoV2Resp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getFirstRechargeInfoV2Resp.data = _GetFirstRechargeInfoV2Resp_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getFirstRechargeInfoV2Resp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetFirstRechargeInfoV2Resp getFirstRechargeInfoV2Resp, List list) {
    }
}
