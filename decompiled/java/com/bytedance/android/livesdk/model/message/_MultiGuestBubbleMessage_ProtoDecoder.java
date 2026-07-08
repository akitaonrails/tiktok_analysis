package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestBubbleMessage_ProtoDecoder implements C0IMD<MultiGuestBubbleMessage> {
    @Override // X.C0IMD
    public final void LIZ(MultiGuestBubbleMessage multiGuestBubbleMessage) {
        MultiGuestBubbleMessage multiGuestBubbleMessage2 = multiGuestBubbleMessage;
        CommonMessageData commonMessageData = multiGuestBubbleMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<User> list = multiGuestBubbleMessage2.user;
        if (list == null) {
            multiGuestBubbleMessage2.user = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (User user : multiGuestBubbleMessage2.user) {
            if (user != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final MultiGuestBubbleMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestBubbleMessage multiGuestBubbleMessage = new MultiGuestBubbleMessage();
        multiGuestBubbleMessage.user = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 7) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        multiGuestBubbleMessage.displayPosition = c1516680pZS.LJIIJ();
                                    }
                                } else {
                                    multiGuestBubbleMessage.messageType = c1516680pZS.LJIIJ();
                                }
                            } else {
                                multiGuestBubbleMessage.requestId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            multiGuestBubbleMessage.triggerType = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        multiGuestBubbleMessage.user.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    multiGuestBubbleMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestBubbleMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestBubbleMessage multiGuestBubbleMessage, List list) {
    }
}
