package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FeedUserRoomMonitorMessage_ProtoDecoder implements C0IMD<FeedUserRoomMonitorMessage> {
    @Override // X.C0IMD
    public final void LIZ(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
        CommonMessageData commonMessageData = feedUserRoomMonitorMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final FeedUserRoomMonitorMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FeedUserRoomMonitorMessage feedUserRoomMonitorMessage = new FeedUserRoomMonitorMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 9) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 6) {
                                        if (iLJI != 7) {
                                            C1516700pZU.LJ(c1516680pZS);
                                        } else {
                                            feedUserRoomMonitorMessage.streamStatus = c1516680pZS.LJIIJJI();
                                        }
                                    } else {
                                        feedUserRoomMonitorMessage.roomTime = c1516680pZS.LJIIJJI();
                                    }
                                } else {
                                    feedUserRoomMonitorMessage.roomStatus = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                feedUserRoomMonitorMessage.roomId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            feedUserRoomMonitorMessage.anchorId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        feedUserRoomMonitorMessage.seqDetectResult = _SeqDetectResult_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    feedUserRoomMonitorMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return feedUserRoomMonitorMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FeedUserRoomMonitorMessage feedUserRoomMonitorMessage, List list) {
    }
}
