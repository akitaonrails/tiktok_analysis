package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RoomBasedGiftData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomBasedGiftData_RoomBasedGifts_ProtoDecoder implements C0IMD<RoomBasedGiftData.RoomBasedGifts> {
    public static RoomBasedGiftData.RoomBasedGifts LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomBasedGiftData.RoomBasedGifts roomBasedGifts = new RoomBasedGiftData.RoomBasedGifts();
        roomBasedGifts.giftInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    roomBasedGifts.giftInfo.add(_RoomBasedGiftData_GiftInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomBasedGifts;
            }
        }
    }

    public static void LJ(RoomBasedGiftData.RoomBasedGifts roomBasedGifts) {
        List<RoomBasedGiftData.GiftInfo> list = roomBasedGifts.giftInfo;
        if (list == null) {
            roomBasedGifts.giftInfo = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<RoomBasedGiftData.GiftInfo> it2 = roomBasedGifts.giftInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomBasedGiftData.RoomBasedGifts roomBasedGifts) {
        LJ(roomBasedGifts);
    }

    @Override // X.C0IMD
    public final RoomBasedGiftData.RoomBasedGifts LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomBasedGiftData.RoomBasedGifts roomBasedGifts, List list) {
    }
}
