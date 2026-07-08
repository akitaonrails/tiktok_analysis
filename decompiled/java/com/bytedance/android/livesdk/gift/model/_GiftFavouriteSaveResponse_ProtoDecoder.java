package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftFavouriteSaveResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftFavouriteSaveResponse_ProtoDecoder implements C0IMD<GiftFavouriteSaveResponse> {
    @Override // X.C0IMD
    public final void LIZ(GiftFavouriteSaveResponse giftFavouriteSaveResponse) {
        GiftFavouriteSaveResponse.Data data = giftFavouriteSaveResponse.data;
        if (data != null && data.favouriteGiftIds == null) {
            data.favouriteGiftIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftFavouriteSaveResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftFavouriteSaveResponse giftFavouriteSaveResponse = new GiftFavouriteSaveResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftFavouriteSaveResponse.data = _GiftFavouriteSaveResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftFavouriteSaveResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftFavouriteSaveResponse giftFavouriteSaveResponse, List list) {
    }
}
