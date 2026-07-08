package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._LinkerMediaChangeOperator_ProtoDecoder;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play._CountdownForAllContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownForAllMessage_ProtoDecoder implements C0IMD<CountdownForAllMessage> {
    @Override // X.C0IMD
    public final void LIZ(CountdownForAllMessage countdownForAllMessage) {
        CountdownForAllMessage countdownForAllMessage2 = countdownForAllMessage;
        CommonMessageData commonMessageData = countdownForAllMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        CountdownForAllContent countdownForAllContent = countdownForAllMessage2.playContent;
        if (countdownForAllContent != null) {
            _CountdownForAllContent_ProtoDecoder.LJ(countdownForAllContent);
        }
    }

    @Override // X.C0IMD
    public final CountdownForAllMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CountdownForAllMessage countdownForAllMessage = new CountdownForAllMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    countdownForAllMessage.playEndReason = c1516680pZS.LJIIJ();
                                }
                            } else {
                                countdownForAllMessage.operatorUserInfo = _LinkerMediaChangeOperator_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            countdownForAllMessage.playContent = _CountdownForAllContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        countdownForAllMessage.messageType = c1516680pZS.LJIIJ();
                    }
                } else {
                    countdownForAllMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownForAllMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownForAllMessage countdownForAllMessage, List list) {
    }
}
