package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RechargeReq_ProtoDecoder implements C0IMD<RechargeReq> {
    @Override // X.C0IMD
    public final void LIZ(RechargeReq rechargeReq) {
        LinkCommon linkCommon = rechargeReq.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
    }

    @Override // X.C0IMD
    public final RechargeReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RechargeReq rechargeReq = new RechargeReq();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rechargeReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        rechargeReq.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        rechargeReq.myself = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        rechargeReq.target = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        rechargeReq.type = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        rechargeReq.routeId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rechargeReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RechargeReq rechargeReq, List list) {
    }
}
