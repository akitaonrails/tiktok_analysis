package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RoomBasedGiftData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomBasedGiftData_GiftInfo_ProtoDecoder implements C0IMD<RoomBasedGiftData.GiftInfo> {
    public static RoomBasedGiftData.GiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomBasedGiftData.GiftInfo giftInfo = new RoomBasedGiftData.GiftInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftInfo.price = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftInfo.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final RoomBasedGiftData.GiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RoomBasedGiftData.GiftInfo giftInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomBasedGiftData.GiftInfo giftInfo, List list) {
    }
}
