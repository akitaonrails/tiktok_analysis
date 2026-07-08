package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import tikcast.api.anchor.GetGoLIVEPlaybookRes;

/* JADX INFO: loaded from: classes.dex */
public final class _GetGoLIVEPlaybookRes_ProtoDecoder implements C0IMD<GetGoLIVEPlaybookRes> {
    @Override // X.C0IMD
    public final void LIZ(GetGoLIVEPlaybookRes getGoLIVEPlaybookRes) {
        GetGoLIVEPlaybookRes.Data data = getGoLIVEPlaybookRes.data;
        if (data != null && data.functionNameToParamsMap == null) {
            data.functionNameToParamsMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final GetGoLIVEPlaybookRes LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetGoLIVEPlaybookRes getGoLIVEPlaybookRes = new GetGoLIVEPlaybookRes();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getGoLIVEPlaybookRes.data = _GetGoLIVEPlaybookRes_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getGoLIVEPlaybookRes;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetGoLIVEPlaybookRes getGoLIVEPlaybookRes, List list) {
    }
}
