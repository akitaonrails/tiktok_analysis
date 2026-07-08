package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model._LinkerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalExtraInfo_ReserveInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalLinkmicStatus_ProtoDecoder implements C0IMD<RivalLinkmicStatus> {
    public static RivalLinkmicStatus LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalLinkmicStatus rivalLinkmicStatus = new RivalLinkmicStatus();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rivalLinkmicStatus.playType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        rivalLinkmicStatus.blockReason = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        rivalLinkmicStatus.linkerInfo = _LinkerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        rivalLinkmicStatus.reserveInfo = _RivalExtraInfo_ReserveInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        rivalLinkmicStatus.detailBlockReason = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        rivalLinkmicStatus.optPairInfo = _OptPairInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        rivalLinkmicStatus.cohostLayoutMode = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rivalLinkmicStatus;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RivalLinkmicStatus rivalLinkmicStatus) {
        RivalLinkmicStatus rivalLinkmicStatus2 = rivalLinkmicStatus;
        LinkerInfo linkerInfo = rivalLinkmicStatus2.linkerInfo;
        if (linkerInfo != null) {
            _LinkerInfo_ProtoDecoder.LJ(linkerInfo);
        }
        OptPairInfo optPairInfo = rivalLinkmicStatus2.optPairInfo;
        if (optPairInfo != null) {
            _OptPairInfo_ProtoDecoder.LJ(optPairInfo);
        }
    }

    @Override // X.C0IMD
    public final RivalLinkmicStatus LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalLinkmicStatus rivalLinkmicStatus, List list) {
    }
}
