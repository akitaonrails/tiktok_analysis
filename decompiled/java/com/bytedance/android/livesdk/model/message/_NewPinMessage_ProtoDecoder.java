package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NewPinMessage_ProtoDecoder implements C0IMD<NewPinMessage> {
    @Override // X.C0IMD
    public final void LIZ(NewPinMessage newPinMessage) {
        NewPinMessage newPinMessage2 = newPinMessage;
        CommonMessageData commonMessageData = newPinMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = newPinMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = newPinMessage2.operator;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
    }

    @Override // X.C0IMD
    public final NewPinMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        NewPinMessage newPinMessage = new NewPinMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            switch (iLJI) {
                                case 30:
                                    newPinMessage.method = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 31:
                                    newPinMessage.pinTime = c1516680pZS.LJIIJJI();
                                    break;
                                case 32:
                                    newPinMessage.operator = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                    newPinMessage.action = c1516680pZS.LJIIJ();
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                    newPinMessage.displayDuration = c1516680pZS.LJIIJJI();
                                    break;
                                case 35:
                                    newPinMessage.pinMsgId = c1516680pZS.LJIIJJI();
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                    newPinMessage.ecStreamerKey = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                        } else {
                            newPinMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        newPinMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    newPinMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return newPinMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NewPinMessage newPinMessage, List list) {
    }
}
