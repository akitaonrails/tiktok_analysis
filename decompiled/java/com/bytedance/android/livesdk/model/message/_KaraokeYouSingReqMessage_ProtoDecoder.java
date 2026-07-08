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
public final class _KaraokeYouSingReqMessage_ProtoDecoder implements C0IMD<KaraokeYouSingReqMessage> {
    @Override // X.C0IMD
    public final void LIZ(KaraokeYouSingReqMessage karaokeYouSingReqMessage) {
        KaraokeYouSingReqMessage karaokeYouSingReqMessage2 = karaokeYouSingReqMessage;
        CommonMessageData commonMessageData = karaokeYouSingReqMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<ReqSong> list = karaokeYouSingReqMessage2.songList;
        if (list == null) {
            karaokeYouSingReqMessage2.songList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ReqSong reqSong : karaokeYouSingReqMessage2.songList) {
            if (reqSong != null) {
                _ReqSong_ProtoDecoder.LJ(reqSong);
            }
        }
    }

    @Override // X.C0IMD
    public final KaraokeYouSingReqMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        KaraokeYouSingReqMessage karaokeYouSingReqMessage = new KaraokeYouSingReqMessage();
        karaokeYouSingReqMessage.songList = new ArrayList();
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
                                    karaokeYouSingReqMessage.type = c1516680pZS.LJIIJ();
                                }
                            } else {
                                karaokeYouSingReqMessage.reqTimestampSeconds = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            karaokeYouSingReqMessage.totalReqCount = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        karaokeYouSingReqMessage.songList.add(_ReqSong_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    karaokeYouSingReqMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return karaokeYouSingReqMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KaraokeYouSingReqMessage karaokeYouSingReqMessage, List list) {
    }
}
