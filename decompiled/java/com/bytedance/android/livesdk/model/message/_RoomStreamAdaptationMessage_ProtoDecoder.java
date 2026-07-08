package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomStreamAdaptationMessage_ProtoDecoder implements C0IMD<RoomStreamAdaptationMessage> {
    @Override // X.C0IMD
    public final void LIZ(RoomStreamAdaptationMessage roomStreamAdaptationMessage) {
        CommonMessageData commonMessageData = roomStreamAdaptationMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final RoomStreamAdaptationMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RoomStreamAdaptationMessage roomStreamAdaptationMessage = new RoomStreamAdaptationMessage();
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
                                roomStreamAdaptationMessage.isEmpty = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            roomStreamAdaptationMessage.subjectPositionInfo = _SubjectPositionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        roomStreamAdaptationMessage.action = c1516680pZS.LJIIJJI();
                    }
                } else {
                    roomStreamAdaptationMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomStreamAdaptationMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomStreamAdaptationMessage roomStreamAdaptationMessage, List list) {
    }
}
