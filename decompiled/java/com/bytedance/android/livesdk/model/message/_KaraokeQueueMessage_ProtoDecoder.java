package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdk.model._KaraokeSong_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _KaraokeQueueMessage_ProtoDecoder implements C0IMD<KaraokeQueueMessage> {
    @Override // X.C0IMD
    public final void LIZ(KaraokeQueueMessage karaokeQueueMessage) {
        KaraokeQueueMessage karaokeQueueMessage2 = karaokeQueueMessage;
        CommonMessageData commonMessageData = karaokeQueueMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        KaraokeSong karaokeSong = karaokeQueueMessage2.song;
        if (karaokeSong != null) {
            _KaraokeSong_ProtoDecoder.LJ(karaokeSong);
        }
    }

    @Override // X.C0IMD
    public final KaraokeQueueMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        KaraokeQueueMessage karaokeQueueMessage = new KaraokeQueueMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            karaokeQueueMessage.song = _KaraokeSong_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        karaokeQueueMessage.type = c1516680pZS.LJIIJ();
                    }
                } else {
                    karaokeQueueMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return karaokeQueueMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KaraokeQueueMessage karaokeQueueMessage, List list) {
    }
}
