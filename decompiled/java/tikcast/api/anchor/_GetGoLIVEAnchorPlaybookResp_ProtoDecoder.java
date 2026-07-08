package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import tikcast.api.anchor.GetGoLIVEAnchorPlaybookResp;

/* JADX INFO: loaded from: classes.dex */
public final class _GetGoLIVEAnchorPlaybookResp_ProtoDecoder implements C0IMD<GetGoLIVEAnchorPlaybookResp> {
    @Override // X.C0IMD
    public final void LIZ(GetGoLIVEAnchorPlaybookResp getGoLIVEAnchorPlaybookResp) {
        GetGoLIVEAnchorPlaybookResp.Data data = getGoLIVEAnchorPlaybookResp.data;
        if (data != null && data.functionNameToParamsMap == null) {
            data.functionNameToParamsMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final GetGoLIVEAnchorPlaybookResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetGoLIVEAnchorPlaybookResp getGoLIVEAnchorPlaybookResp = new GetGoLIVEAnchorPlaybookResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getGoLIVEAnchorPlaybookResp.data = _GetGoLIVEAnchorPlaybookResp_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getGoLIVEAnchorPlaybookResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetGoLIVEAnchorPlaybookResp getGoLIVEAnchorPlaybookResp, List list) {
    }
}
