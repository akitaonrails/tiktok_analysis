package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.MsgNotifyControlResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MsgNotifyControlResp_ProtoDecoder implements C0IMD<MsgNotifyControlResp> {
    @Override // X.C0IMD
    public final void LIZ(MsgNotifyControlResp msgNotifyControlResp) {
        MsgNotifyControlResp.Data data = msgNotifyControlResp.data;
        if (data != null) {
            _MsgNotifyControlResp_Data_ProtoDecoder.LJ(data);
        }
    }

    @Override // X.C0IMD
    public final MsgNotifyControlResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MsgNotifyControlResp msgNotifyControlResp = new MsgNotifyControlResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    msgNotifyControlResp.data = _MsgNotifyControlResp_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return msgNotifyControlResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MsgNotifyControlResp msgNotifyControlResp, List list) {
    }
}
