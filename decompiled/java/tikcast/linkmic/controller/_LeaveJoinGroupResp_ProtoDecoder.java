package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.cohost_biz._BizLeaveJoinGroupResponse_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LeaveJoinGroupResp_ProtoDecoder implements C0IMD<LeaveJoinGroupResp> {
    @Override // X.C0IMD
    public final void LIZ(LeaveJoinGroupResp leaveJoinGroupResp) {
        LinkMicCommonResp linkMicCommonResp = leaveJoinGroupResp.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
    }

    @Override // X.C0IMD
    public final LeaveJoinGroupResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LeaveJoinGroupResp leaveJoinGroupResp = new LeaveJoinGroupResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 9527) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        leaveJoinGroupResp.cohostBizResp = _BizLeaveJoinGroupResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    leaveJoinGroupResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return leaveJoinGroupResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LeaveJoinGroupResp leaveJoinGroupResp, List list) {
    }
}
