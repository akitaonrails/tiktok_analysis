package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftFavouriteSaveResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftFavouriteSaveResponse_Data_ProtoDecoder implements C0IMD<GiftFavouriteSaveResponse.Data> {
    public static GiftFavouriteSaveResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftFavouriteSaveResponse.Data data = new GiftFavouriteSaveResponse.Data();
        data.favouriteGiftIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        data.favouriteGiftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    data.success = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftFavouriteSaveResponse.Data data) {
        GiftFavouriteSaveResponse.Data data2 = data;
        if (data2.favouriteGiftIds == null) {
            data2.favouriteGiftIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftFavouriteSaveResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftFavouriteSaveResponse.Data data, List list) {
    }
}
