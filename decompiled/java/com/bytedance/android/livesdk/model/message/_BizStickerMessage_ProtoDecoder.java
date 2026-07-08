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
public final class _BizStickerMessage_ProtoDecoder implements C0IMD<BizStickerMessage> {
    @Override // X.C0IMD
    public final void LIZ(BizStickerMessage bizStickerMessage) {
        BizStickerMessage bizStickerMessage2 = bizStickerMessage;
        CommonMessageData commonMessageData = bizStickerMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<RoomSticker> list = bizStickerMessage2.bizSticker;
        if (list == null) {
            bizStickerMessage2.bizSticker = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (RoomSticker roomSticker : bizStickerMessage2.bizSticker) {
            if (roomSticker != null) {
                _RoomSticker_ProtoDecoder.LJ(roomSticker);
            }
        }
    }

    @Override // X.C0IMD
    public final BizStickerMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BizStickerMessage bizStickerMessage = new BizStickerMessage();
        bizStickerMessage.bizSticker = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        bizStickerMessage.bizSticker.add(_RoomSticker_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    bizStickerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizStickerMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizStickerMessage bizStickerMessage, List list) {
    }
}
