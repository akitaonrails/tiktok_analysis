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
public final class _BizPermitResponse_ProtoDecoder implements C0IMD<BizPermitResponse> {
    public static BizPermitResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizPermitResponse bizPermitResponse = new BizPermitResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizPermitResponse.data = _BizPermitResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizPermitResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizPermitResponse bizPermitResponse) {
        PerceptionMessage perceptionMessage;
        BizPermitResponse.ResponseData responseData = bizPermitResponse.data;
        if (responseData != null && (perceptionMessage = responseData.hostPerceptionInfo) != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final BizPermitResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizPermitResponse bizPermitResponse, List list) {
    }
}
