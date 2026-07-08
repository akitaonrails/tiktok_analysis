package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveGameIntroMessage_ProtoDecoder implements C0IMD<LiveGameIntroMessage> {
    @Override // X.C0IMD
    public final void LIZ(LiveGameIntroMessage liveGameIntroMessage) {
        LiveGameIntroMessage liveGameIntroMessage2 = liveGameIntroMessage;
        CommonMessageData commonMessageData = liveGameIntroMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = liveGameIntroMessage2.content;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final LiveGameIntroMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LiveGameIntroMessage liveGameIntroMessage = new LiveGameIntroMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            liveGameIntroMessage.hasRankInfo = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        liveGameIntroMessage.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    liveGameIntroMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveGameIntroMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveGameIntroMessage liveGameIntroMessage, List list) {
    }
}
