package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MGetUserLinkmicStatusResponse_LinkmicStatus_ProtoDecoder implements C0IMD<MGetUserLinkmicStatusResponse.LinkmicStatus> {
    public static MGetUserLinkmicStatusResponse.LinkmicStatus LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus = new MGetUserLinkmicStatusResponse.LinkmicStatus();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkmicStatus.playType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        linkmicStatus.blockReason = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        linkmicStatus.linkerInfo = _LinkerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkmicStatus.reserveInfo = _RivalExtraInfo_ReserveInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        linkmicStatus.detailBlockReason = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        linkmicStatus.optPairInfo = _OptPairInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        linkmicStatus.cohostLayoutMode = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicStatus;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus) {
        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus2 = linkmicStatus;
        LinkerInfo linkerInfo = linkmicStatus2.linkerInfo;
        if (linkerInfo != null) {
            _LinkerInfo_ProtoDecoder.LJ(linkerInfo);
        }
        OptPairInfo optPairInfo = linkmicStatus2.optPairInfo;
        if (optPairInfo != null) {
            _OptPairInfo_ProtoDecoder.LJ(optPairInfo);
        }
    }

    @Override // X.C0IMD
    public final MGetUserLinkmicStatusResponse.LinkmicStatus LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus, List list) {
    }
}
