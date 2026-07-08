package tikcast.api.anchor_tool;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor_tool.EffectListResponse;
import tikcast.api.anchor_tool.EffectListV2Response;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectListV2Response_Data_ProtoDecoder implements C0IMD<EffectListV2Response.Data> {
    @Override // X.C0IMD
    public final void LIZ(EffectListV2Response.Data data) {
        EffectListV2Response.Data data2 = data;
        List<EffectListResponse.Data> list = data2.details;
        if (list == null) {
            data2.details = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (EffectListResponse.Data data3 : data2.details) {
            if (data3 != null) {
                _EffectListResponse_Data_ProtoDecoder.LJ(data3);
            }
        }
    }

    @Override // X.C0IMD
    public final EffectListV2Response.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EffectListV2Response.Data data = new EffectListV2Response.Data();
        data.details = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    data.details.add(_EffectListResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectListV2Response.Data data, List list) {
    }
}
