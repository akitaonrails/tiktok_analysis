package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model._RoomSticker_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomStickerMessage_ProtoDecoder implements C0IMD<RoomStickerMessage> {
    @Override // X.C0IMD
    public final void LIZ(RoomStickerMessage roomStickerMessage) {
        RoomStickerMessage roomStickerMessage2 = roomStickerMessage;
        CommonMessageData commonMessageData = roomStickerMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<RoomSticker> list = roomStickerMessage2.stickerList;
        if (list == null) {
            roomStickerMessage2.stickerList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (RoomSticker roomSticker : roomStickerMessage2.stickerList) {
            if (roomSticker != null) {
                _RoomSticker_ProtoDecoder.LJ(roomSticker);
            }
        }
    }

    @Override // X.C0IMD
    public final RoomStickerMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RoomStickerMessage roomStickerMessage = new RoomStickerMessage();
        roomStickerMessage.stickerList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        roomStickerMessage.stickerList.add(_RoomSticker_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    roomStickerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomStickerMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomStickerMessage roomStickerMessage, List list) {
    }
}
