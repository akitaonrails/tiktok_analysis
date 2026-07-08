package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.chatroom.api._SubPinCard_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubPinEventMessage_ProtoDecoder implements C0IMD<SubPinEventMessage> {
    @Override // X.C0IMD
    public final void LIZ(SubPinEventMessage subPinEventMessage) {
        SubPinEventMessage subPinEventMessage2 = subPinEventMessage;
        CommonMessageData commonMessageData = subPinEventMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        SubPinCard subPinCard = subPinEventMessage2.card;
        if (subPinCard != null) {
            _SubPinCard_ProtoDecoder.LJ(subPinCard);
        }
    }

    @Override // X.C0IMD
    public final SubPinEventMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SubPinEventMessage subPinEventMessage = new SubPinEventMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                subPinEventMessage.operatorUserId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            subPinEventMessage.card = _SubPinCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        subPinEventMessage.actionType = c1516680pZS.LJIIJ();
                    }
                } else {
                    subPinEventMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subPinEventMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubPinEventMessage subPinEventMessage, List list) {
    }
}
