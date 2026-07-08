package webcast.data.cohost_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizLeaveJoinGroupResponse_ProtoDecoder implements C0IMD<BizLeaveJoinGroupResponse> {
    public static BizLeaveJoinGroupResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse = new BizLeaveJoinGroupResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        bizLeaveJoinGroupResponse.feedbackContentType = c1516680pZS.LJIIJJI();
                    }
                } else {
                    bizLeaveJoinGroupResponse.feedbackShowReason = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizLeaveJoinGroupResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final BizLeaveJoinGroupResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse, List list) {
    }
}
