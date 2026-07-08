package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.WishListResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WishListResponse_Wish_GiftWishExtra_ProtoDecoder implements C0IMD<WishListResponse.Wish.GiftWishExtra> {
    public static WishListResponse.Wish.GiftWishExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WishListResponse.Wish.GiftWishExtra giftWishExtra = new WishListResponse.Wish.GiftWishExtra();
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
                                giftWishExtra.giftType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            giftWishExtra.giftDiamondCount = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        giftWishExtra.giftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftWishExtra.giftName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftWishExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WishListResponse.Wish.GiftWishExtra giftWishExtra) {
        ImageModel imageModel = giftWishExtra.giftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final WishListResponse.Wish.GiftWishExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WishListResponse.Wish.GiftWishExtra giftWishExtra, List list) {
    }
}
