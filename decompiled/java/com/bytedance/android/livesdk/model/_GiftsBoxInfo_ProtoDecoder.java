package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftsBoxInfo_ProtoDecoder implements C0IMD<GiftsBoxInfo> {
    public static GiftsBoxInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftsBoxInfo giftsBoxInfo = new GiftsBoxInfo();
        giftsBoxInfo.gifts = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftsBoxInfo.gifts.add(_GiftInfoInBox_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftsBoxInfo;
            }
        }
    }

    public static void LJ(GiftsBoxInfo giftsBoxInfo) {
        AssetsModel assetsModel;
        List<GiftInfoInBox> list = giftsBoxInfo.gifts;
        if (list == null) {
            giftsBoxInfo.gifts = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GiftInfoInBox giftInfoInBox : giftsBoxInfo.gifts) {
            if (giftInfoInBox != null && (assetsModel = giftInfoInBox.asset) != null) {
                _AssetsModel_ProtoDecoder.LJ(assetsModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftsBoxInfo giftsBoxInfo) {
        LJ(giftsBoxInfo);
    }

    @Override // X.C0IMD
    public final GiftsBoxInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftsBoxInfo giftsBoxInfo, List list) {
    }
}
