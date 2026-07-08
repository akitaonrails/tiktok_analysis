package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.ReqSong;
import webcast.data._ReqSong_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _KaraokeReqMessage_ProtoDecoder implements C0IMD<KaraokeReqMessage> {
    @Override // X.C0IMD
    public final void LIZ(KaraokeReqMessage karaokeReqMessage) {
        KaraokeReqMessage karaokeReqMessage2 = karaokeReqMessage;
        CommonMessageData commonMessageData = karaokeReqMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<ReqSong> list = karaokeReqMessage2.songList;
        if (list == null) {
            karaokeReqMessage2.songList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ReqSong reqSong : karaokeReqMessage2.songList) {
            if (reqSong != null) {
                _ReqSong_ProtoDecoder.LJ(reqSong);
            }
        }
    }

    @Override // X.C0IMD
    public final KaraokeReqMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        KaraokeReqMessage karaokeReqMessage = new KaraokeReqMessage();
        karaokeReqMessage.songList = new ArrayList();
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
                                karaokeReqMessage.reqTimestampSeconds = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            karaokeReqMessage.totalReqCount = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        karaokeReqMessage.songList.add(_ReqSong_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    karaokeReqMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return karaokeReqMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KaraokeReqMessage karaokeReqMessage, List list) {
    }
}
