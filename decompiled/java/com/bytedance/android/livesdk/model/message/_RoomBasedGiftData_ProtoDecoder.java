package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RoomBasedGiftData;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomBasedGiftData_ProtoDecoder implements C0IMD<RoomBasedGiftData> {
    public static RoomBasedGiftData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomBasedGiftData roomBasedGiftData = new RoomBasedGiftData();
        roomBasedGiftData.roomBasedGifts = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    RoomBasedGiftData.RoomBasedGifts roomBasedGiftsLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                roomBasedGiftsLIZLLL = _RoomBasedGiftData_RoomBasedGifts_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (roomBasedGiftsLIZLLL != null) {
                            roomBasedGiftData.roomBasedGifts.put(lValueOf, roomBasedGiftsLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomBasedGiftData;
            }
        }
    }

    public static void LJ(RoomBasedGiftData roomBasedGiftData) {
        Map<Long, RoomBasedGiftData.RoomBasedGifts> map = roomBasedGiftData.roomBasedGifts;
        if (map == null) {
            roomBasedGiftData.roomBasedGifts = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, RoomBasedGiftData.RoomBasedGifts>> it2 = roomBasedGiftData.roomBasedGifts.entrySet().iterator();
        while (it2.hasNext()) {
            RoomBasedGiftData.RoomBasedGifts value = it2.next().getValue();
            if (value != null) {
                _RoomBasedGiftData_RoomBasedGifts_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomBasedGiftData roomBasedGiftData) {
        LJ(roomBasedGiftData);
    }

    @Override // X.C0IMD
    public final RoomBasedGiftData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomBasedGiftData roomBasedGiftData, List list) {
    }
}
