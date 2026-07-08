package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StateReqCommon_ProtoDecoder implements C0IMD<StateReqCommon> {
    public static StateReqCommon LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StateReqCommon stateReqCommon = new StateReqCommon();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        stateReqCommon.scene = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        stateReqCommon.appId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        stateReqCommon.liveId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        stateReqCommon.myself = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        stateReqCommon.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        stateReqCommon.groupChannelId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return stateReqCommon;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StateReqCommon stateReqCommon) {
    }

    @Override // X.C0IMD
    public final StateReqCommon LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StateReqCommon stateReqCommon, List list) {
    }
}
