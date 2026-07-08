package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RealtimeLiveCenterUpdateMessage_ProtoDecoder implements C0IMD<RealtimeLiveCenterUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(RealtimeLiveCenterUpdateMessage realtimeLiveCenterUpdateMessage) {
        RealtimeLiveCenterUpdateMessage realtimeLiveCenterUpdateMessage2 = realtimeLiveCenterUpdateMessage;
        CommonMessageData commonMessageData = realtimeLiveCenterUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<RealtimeLiveCenterDataUpdateMessageItemInfo> list = realtimeLiveCenterUpdateMessage2.list;
        if (list == null) {
            realtimeLiveCenterUpdateMessage2.list = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<RealtimeLiveCenterDataUpdateMessageItemInfo> it2 = realtimeLiveCenterUpdateMessage2.list.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterUpdateMessage realtimeLiveCenterUpdateMessage = new RealtimeLiveCenterUpdateMessage();
        realtimeLiveCenterUpdateMessage.list = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        realtimeLiveCenterUpdateMessage.list.add(_RealtimeLiveCenterDataUpdateMessageItemInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    realtimeLiveCenterUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeLiveCenterUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterUpdateMessage realtimeLiveCenterUpdateMessage, List list) {
    }
}
