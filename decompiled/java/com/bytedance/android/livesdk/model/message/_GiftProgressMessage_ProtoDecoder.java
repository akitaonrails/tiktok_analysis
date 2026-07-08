package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.GiftProgressMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftProgressMessage_ProtoDecoder implements C0IMD<GiftProgressMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftProgressMessage giftProgressMessage) {
        GiftProgressMessage giftProgressMessage2 = giftProgressMessage;
        CommonMessageData commonMessageData = giftProgressMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<GiftProgressMessage.ProgressStruct> list = giftProgressMessage2.progress;
        if (list == null) {
            giftProgressMessage2.progress = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<GiftProgressMessage.ProgressStruct> it2 = giftProgressMessage2.progress.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final GiftProgressMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftProgressMessage giftProgressMessage = new GiftProgressMessage();
        giftProgressMessage.progress = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            giftProgressMessage.progress.add(_GiftProgressMessage_ProgressStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        giftProgressMessage.progressType = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftProgressMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftProgressMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftProgressMessage giftProgressMessage, List list) {
    }
}
