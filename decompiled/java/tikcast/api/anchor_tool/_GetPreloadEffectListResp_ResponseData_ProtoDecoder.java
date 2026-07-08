package tikcast.api.anchor_tool;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor_tool.GetPreloadEffectListResp;

/* JADX INFO: loaded from: classes.dex */
public final class _GetPreloadEffectListResp_ResponseData_ProtoDecoder implements C0IMD<GetPreloadEffectListResp.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(GetPreloadEffectListResp.ResponseData responseData) {
        GetPreloadEffectListResp.ResponseData responseData2 = responseData;
        if (responseData2.preloadEffectIdList == null) {
            responseData2.preloadEffectIdList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GetPreloadEffectListResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetPreloadEffectListResp.ResponseData responseData = new GetPreloadEffectListResp.ResponseData();
        responseData.preloadEffectIdList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.preloadEffectIdList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetPreloadEffectListResp.ResponseData responseData, List list) {
    }
}
