package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.HotRoomData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HotRoomData_HotRoomState_ProtoDecoder implements C0IMD<HotRoomData.HotRoomState> {
    public static HotRoomData.HotRoomState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HotRoomData.HotRoomState hotRoomState = new HotRoomData.HotRoomState();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        hotRoomState.enterTs = c1516680pZS.LJIIJJI();
                    }
                } else {
                    hotRoomState.reason = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hotRoomState;
            }
        }
    }

    @Override // X.C0IMD
    public final HotRoomData.HotRoomState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(HotRoomData.HotRoomState hotRoomState) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HotRoomData.HotRoomState hotRoomState, List list) {
    }
}
