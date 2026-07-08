package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api.SubWaveImMsg;
import com.bytedance.android.livesdk.chatroom.api._SubWaveImMsg_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubWaveData_ProtoDecoder implements C0IMD<SubWaveData> {
    public static SubWaveData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubWaveData subWaveData = new SubWaveData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    subWaveData.subWaveImMsg = _SubWaveImMsg_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subWaveData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubWaveData subWaveData) {
        SubWaveImMsg subWaveImMsg = subWaveData.subWaveImMsg;
        if (subWaveImMsg != null) {
            _SubWaveImMsg_ProtoDecoder.LJ(subWaveImMsg);
        }
    }

    @Override // X.C0IMD
    public final SubWaveData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubWaveData subWaveData, List list) {
    }
}
