package com.bytedance.android.livesdk.model.message.ext;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ECShortItemRefreshMessage_ProtoDecoder implements C0IMD<ECShortItemRefreshMessage> {
    @Override // X.C0IMD
    public final void LIZ(ECShortItemRefreshMessage eCShortItemRefreshMessage) {
        ECShortItemRefreshMessage eCShortItemRefreshMessage2 = eCShortItemRefreshMessage;
        CommonMessageData commonMessageData = eCShortItemRefreshMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ShortItemRefreshEntity shortItemRefreshEntity = eCShortItemRefreshMessage2.entity;
        if (shortItemRefreshEntity != null && shortItemRefreshEntity.refreshItems == null) {
            shortItemRefreshEntity.refreshItems = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final ECShortItemRefreshMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ECShortItemRefreshMessage eCShortItemRefreshMessage = new ECShortItemRefreshMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        eCShortItemRefreshMessage.entity = _ShortItemRefreshEntity_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    eCShortItemRefreshMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return eCShortItemRefreshMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ECShortItemRefreshMessage eCShortItemRefreshMessage, List list) {
    }
}
