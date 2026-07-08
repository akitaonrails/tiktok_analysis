package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.WishListResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WishListResponse_WishList_ProtoDecoder implements C0IMD<WishListResponse.WishList> {
    public static WishListResponse.WishList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WishListResponse.WishList wishList = new WishListResponse.WishList();
        wishList.wishes = new ArrayList();
        wishList.contributors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        wishList.status = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        wishList.wishes.add(_WishListResponse_Wish_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        wishList.contributors.add(_WishListResponse_WishContributor_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        wishList.contributorsLength = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        wishList.description = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        wishList.auditStatus = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return wishList;
            }
        }
    }

    public static void LJ(WishListResponse.WishList wishList) {
        WishListResponse.Wish.GiftWishExtra giftWishExtra;
        ImageModel imageModel;
        ImageModel imageModel2;
        List<WishListResponse.Wish> list = wishList.wishes;
        if (list == null) {
            wishList.wishes = new ArrayList();
        } else if (!list.isEmpty()) {
            for (WishListResponse.Wish wish : wishList.wishes) {
                if (wish != null && (giftWishExtra = wish.giftWishExtra) != null && (imageModel = giftWishExtra.giftIcon) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<WishListResponse.WishContributor> list2 = wishList.contributors;
        if (list2 == null) {
            wishList.contributors = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (WishListResponse.WishContributor wishContributor : wishList.contributors) {
            if (wishContributor != null && (imageModel2 = wishContributor.avatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WishListResponse.WishList wishList) {
        LJ(wishList);
    }

    @Override // X.C0IMD
    public final WishListResponse.WishList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WishListResponse.WishList wishList, List list) {
    }
}
