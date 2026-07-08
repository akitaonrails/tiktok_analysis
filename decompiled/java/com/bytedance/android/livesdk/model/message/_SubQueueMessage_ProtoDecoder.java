package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubQueue_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubQueueMessage_ProtoDecoder implements C0IMD<SubQueueMessage> {
    @Override // X.C0IMD
    public final void LIZ(SubQueueMessage subQueueMessage) {
        SubQueueMessage subQueueMessage2 = subQueueMessage;
        CommonMessageData commonMessageData = subQueueMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = subQueueMessage2.currentUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final SubQueueMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SubQueueMessage subQueueMessage = new SubQueueMessage();
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
                                subQueueMessage.currentUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            subQueueMessage.queue = _SubQueue_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        subQueueMessage.messageTypeAction = c1516680pZS.LJIIJ();
                    }
                } else {
                    subQueueMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subQueueMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubQueueMessage subQueueMessage, List list) {
    }
}
