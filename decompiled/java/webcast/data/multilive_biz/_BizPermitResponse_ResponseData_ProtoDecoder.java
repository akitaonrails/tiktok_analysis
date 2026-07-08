package webcast.data.multilive_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.multilive_biz.BizPermitResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizPermitResponse_ResponseData_ProtoDecoder implements C0IMD<BizPermitResponse.ResponseData> {
    public static BizPermitResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizPermitResponse.ResponseData responseData = new BizPermitResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.hostPerceptionInfo = _PerceptionMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizPermitResponse.ResponseData responseData) {
        PerceptionMessage perceptionMessage = responseData.hostPerceptionInfo;
        if (perceptionMessage != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final BizPermitResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizPermitResponse.ResponseData responseData, List list) {
    }
}
