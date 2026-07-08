package webcast.data.cohost_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.cohost_biz.BizJoinGroupResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizJoinGroupResponse_ProtoDecoder implements C0IMD<BizJoinGroupResponse> {
    public static BizJoinGroupResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizJoinGroupResponse bizJoinGroupResponse = new BizJoinGroupResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizJoinGroupResponse.data = _BizJoinGroupResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizJoinGroupResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizJoinGroupResponse bizJoinGroupResponse) {
        PerceptionMessage perceptionMessage;
        BizJoinGroupResponse.ResponseData responseData = bizJoinGroupResponse.data;
        if (responseData != null && (perceptionMessage = responseData.perceptionMessage) != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final BizJoinGroupResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizJoinGroupResponse bizJoinGroupResponse, List list) {
    }
}
