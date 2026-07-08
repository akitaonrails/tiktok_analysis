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
public final class _CaptionMessage_ProtoDecoder implements C0IMD<CaptionMessage> {
    @Override // X.C0IMD
    public final void LIZ(CaptionMessage captionMessage) {
        CaptionMessage captionMessage2 = captionMessage;
        CommonMessageData commonMessageData = captionMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<CaptionContent> list = captionMessage2.content;
        if (list == null) {
            captionMessage2.content = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<CaptionContent> it2 = captionMessage2.content.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final CaptionMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CaptionMessage captionMessage = new CaptionMessage();
        captionMessage.content = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        captionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        captionMessage.timestampMs = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        captionMessage.durationMs = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        captionMessage.content.add(_CaptionContent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        captionMessage.sentenceId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        captionMessage.sequenceId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        captionMessage.definite = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return captionMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CaptionMessage captionMessage, List list) {
    }
}
