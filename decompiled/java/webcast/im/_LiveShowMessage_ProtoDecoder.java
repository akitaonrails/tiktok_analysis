package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._LinkerMediaChangeOperator_ProtoDecoder;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play._ShowContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveShowMessage_ProtoDecoder implements C0IMD<LiveShowMessage> {
    @Override // X.C0IMD
    public final void LIZ(LiveShowMessage liveShowMessage) {
        LiveShowMessage liveShowMessage2 = liveShowMessage;
        CommonMessageData commonMessageData = liveShowMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ShowContent showContent = liveShowMessage2.showContent;
        if (showContent != null) {
            _ShowContent_ProtoDecoder.LJ(showContent);
        }
    }

    @Override // X.C0IMD
    public final LiveShowMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LiveShowMessage liveShowMessage = new LiveShowMessage();
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
                                    liveShowMessage.operatorUserInfo = _LinkerMediaChangeOperator_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                liveShowMessage.showuserfinishreason = c1516680pZS.LJIIJ();
                            }
                        } else {
                            liveShowMessage.showContent = _ShowContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        liveShowMessage.messageType = c1516680pZS.LJIIJ();
                    }
                } else {
                    liveShowMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveShowMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveShowMessage liveShowMessage, List list) {
    }
}
