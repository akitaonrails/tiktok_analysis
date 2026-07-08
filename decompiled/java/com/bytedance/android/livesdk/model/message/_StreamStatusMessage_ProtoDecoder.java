package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StreamStatusMessage_ProtoDecoder implements C0IMD<StreamStatusMessage> {
    @Override // X.C0IMD
    public final void LIZ(StreamStatusMessage streamStatusMessage) {
        StreamStatusMessage streamStatusMessage2 = streamStatusMessage;
        CommonMessageData commonMessageData = streamStatusMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<StreamStatusChangeInfo> list = streamStatusMessage2.streams;
        if (list == null) {
            streamStatusMessage2.streams = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<StreamStatusChangeInfo> it2 = streamStatusMessage2.streams.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final StreamStatusMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        StreamStatusMessage streamStatusMessage = new StreamStatusMessage();
        streamStatusMessage.streams = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        streamStatusMessage.streams.add(_StreamStatusChangeInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    streamStatusMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return streamStatusMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StreamStatusMessage streamStatusMessage, List list) {
    }
}
