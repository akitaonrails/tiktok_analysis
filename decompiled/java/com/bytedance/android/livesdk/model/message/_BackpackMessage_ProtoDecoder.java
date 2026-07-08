package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BackpackMessage_ProtoDecoder implements C0IMD<BackpackMessage> {
    @Override // X.C0IMD
    public final void LIZ(BackpackMessage backpackMessage) {
        CommonMessageData commonMessageData = backpackMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final BackpackMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BackpackMessage backpackMessage = new BackpackMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        backpackMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        backpackMessage.changeType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        backpackMessage.action = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        backpackMessage.itemType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        backpackMessage.itemId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        backpackMessage.available = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return backpackMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BackpackMessage backpackMessage, List list) {
    }
}
