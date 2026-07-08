package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._LinkerMediaChangeOperator_ProtoDecoder;
import webcast.data.multi_guest_play._CountdownContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownMessage_ProtoDecoder implements C0IMD<CountdownMessage> {
    @Override // X.C0IMD
    public final void LIZ(CountdownMessage countdownMessage) {
        CommonMessageData commonMessageData = countdownMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final CountdownMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CountdownMessage countdownMessage = new CountdownMessage();
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
                                countdownMessage.operatorUserInfo = _LinkerMediaChangeOperator_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            countdownMessage.countdownContent = _CountdownContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        countdownMessage.messageType = c1516680pZS.LJIIJ();
                    }
                } else {
                    countdownMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownMessage countdownMessage, List list) {
    }
}
