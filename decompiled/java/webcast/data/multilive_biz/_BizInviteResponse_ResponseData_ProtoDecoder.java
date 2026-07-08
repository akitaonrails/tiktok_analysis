package webcast.data.multilive_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multilive_biz.BizInviteResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizInviteResponse_ResponseData_ProtoDecoder implements C0IMD<BizInviteResponse.ResponseData> {
    public static BizInviteResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizInviteResponse.ResponseData responseData = new BizInviteResponse.ResponseData();
        responseData.friendInviteeUids = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.friendInviteeUids.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    responseData.hostPerceptionInfo = _PerceptionMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(BizInviteResponse.ResponseData responseData) {
        PerceptionMessage perceptionMessage = responseData.hostPerceptionInfo;
        if (perceptionMessage != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
        if (responseData.friendInviteeUids == null) {
            responseData.friendInviteeUids = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizInviteResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final BizInviteResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizInviteResponse.ResponseData responseData, List list) {
    }
}
