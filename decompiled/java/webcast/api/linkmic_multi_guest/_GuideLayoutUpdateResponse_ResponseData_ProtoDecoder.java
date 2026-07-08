package webcast.api.linkmic_multi_guest;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common._LayoutData_ProtoDecoder;
import webcast.api.linkmic_multi_guest.GuideLayoutUpdateResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideLayoutUpdateResponse_ResponseData_ProtoDecoder implements C0IMD<GuideLayoutUpdateResponse.ResponseData> {
    public static GuideLayoutUpdateResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideLayoutUpdateResponse.ResponseData responseData = new GuideLayoutUpdateResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.roomLayoutData = _LayoutData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuideLayoutUpdateResponse.ResponseData responseData) {
        LayoutData layoutData = responseData.roomLayoutData;
        if (layoutData != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
    }

    @Override // X.C0IMD
    public final GuideLayoutUpdateResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideLayoutUpdateResponse.ResponseData responseData, List list) {
    }
}
