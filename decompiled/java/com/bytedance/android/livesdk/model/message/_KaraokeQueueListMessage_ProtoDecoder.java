package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdk.model._KaraokeSong_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _KaraokeQueueListMessage_ProtoDecoder implements C0IMD<KaraokeQueueListMessage> {
    @Override // X.C0IMD
    public final void LIZ(KaraokeQueueListMessage karaokeQueueListMessage) {
        KaraokeQueueListMessage karaokeQueueListMessage2 = karaokeQueueListMessage;
        CommonMessageData commonMessageData = karaokeQueueListMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<KaraokeSong> list = karaokeQueueListMessage2.songList;
        if (list == null) {
            karaokeQueueListMessage2.songList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (KaraokeSong karaokeSong : karaokeQueueListMessage2.songList) {
            if (karaokeSong != null) {
                _KaraokeSong_ProtoDecoder.LJ(karaokeSong);
            }
        }
    }

    @Override // X.C0IMD
    public final KaraokeQueueListMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        KaraokeQueueListMessage karaokeQueueListMessage = new KaraokeQueueListMessage();
        karaokeQueueListMessage.songList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        karaokeQueueListMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        karaokeQueueListMessage.type = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        karaokeQueueListMessage.totalQueueCount = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        karaokeQueueListMessage.songList.add(_KaraokeSong_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        karaokeQueueListMessage.latestUpdateTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        karaokeQueueListMessage.operator = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return karaokeQueueListMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KaraokeQueueListMessage karaokeQueueListMessage, List list) {
    }
}
