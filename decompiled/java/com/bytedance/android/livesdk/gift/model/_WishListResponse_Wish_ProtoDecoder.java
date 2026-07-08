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
public final class _WishListResponse_Wish_ProtoDecoder implements C0IMD<WishListResponse.Wish> {
    public static WishListResponse.Wish LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WishListResponse.Wish wish = new WishListResponse.Wish();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    wish.giftWishExtra = _WishListResponse_Wish_GiftWishExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                wish.target = (int) c1516680pZS.LJIIJJI();
                            }
                        } else {
                            wish.progress = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        wish.id = c1516680pZS.LJIIJJI();
                    }
                } else {
                    wish.wishType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return wish;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WishListResponse.Wish wish) {
        ImageModel imageModel;
        WishListResponse.Wish.GiftWishExtra giftWishExtra = wish.giftWishExtra;
        if (giftWishExtra != null && (imageModel = giftWishExtra.giftIcon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final WishListResponse.Wish LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WishListResponse.Wish wish, List list) {
    }
}
