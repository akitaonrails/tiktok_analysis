package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CancelJoinGroupResp_ProtoDecoder implements C0IMD<CancelJoinGroupResp> {
    @Override // X.C0IMD
    public final void LIZ(CancelJoinGroupResp cancelJoinGroupResp) {
        LinkMicCommonResp linkMicCommonResp = cancelJoinGroupResp.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
    }

    @Override // X.C0IMD
    public final CancelJoinGroupResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CancelJoinGroupResp cancelJoinGroupResp = new CancelJoinGroupResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    cancelJoinGroupResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cancelJoinGroupResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CancelJoinGroupResp cancelJoinGroupResp, List list) {
    }
}
