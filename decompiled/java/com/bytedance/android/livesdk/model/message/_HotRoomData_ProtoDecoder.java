package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.HotRoomData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HotRoomData_ProtoDecoder implements C0IMD<HotRoomData> {
    public static HotRoomData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HotRoomData hotRoomData = new HotRoomData();
        hotRoomData.hotRoomState = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        hotRoomData.business = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        hotRoomData.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        hotRoomData.isHot = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        hotRoomData.action = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        hotRoomData.reason = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        hotRoomData.timestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        hotRoomData.hotRoomState.add(_HotRoomData_HotRoomState_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hotRoomData;
            }
        }
    }

    public static void LJ(HotRoomData hotRoomData) {
        List<HotRoomData.HotRoomState> list = hotRoomData.hotRoomState;
        if (list == null) {
            hotRoomData.hotRoomState = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<HotRoomData.HotRoomState> it2 = hotRoomData.hotRoomState.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HotRoomData hotRoomData) {
        LJ(hotRoomData);
    }

    @Override // X.C0IMD
    public final HotRoomData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HotRoomData hotRoomData, List list) {
    }
}
