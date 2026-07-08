package com.bytedance.android.livesdk.message.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_ProtoEncoder implements InterfaceC1132110fZB<EcommerceEntrance.ShopEntranceInfo> {
    public static int LIZJ(EcommerceEntrance.ShopEntranceInfo shopEntranceInfo) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLJIILL = C1142340fpg.LJIILL(1, shopEntranceInfo.shopId) + C1142340fpg.LJIILL(2, shopEntranceInfo.shopName) + C1142340fpg.LJIILL(3, shopEntranceInfo.shopRating);
        EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel = shopEntranceInfo.storeLabel;
        if (storeLabel == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoEncoder.LIZJ(storeLabel);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(4);
        }
        int iLJIILL2 = iLJIILL + iLIZIZ + C1142340fpg.LJIILL(5, shopEntranceInfo.formatSoldCount) + C1142340fpg.LJIIL(6, shopEntranceInfo.soldCount) + C1142340fpg.LJIIIZ(7, shopEntranceInfo.expRatePercentile) + C1142340fpg.LJIILL(8, shopEntranceInfo.expRateTopDisplay) + C1142340fpg.LJIIIZ(9, shopEntranceInfo.rateDisplayStyle) + C1142340fpg.LJI(10);
        List<EcommerceEntrance.SellingPoint> list = shopEntranceInfo.sellingPoint;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < shopEntranceInfo.sellingPoint.size(); i++) {
                EcommerceEntrance.SellingPoint sellingPoint = (EcommerceEntrance.SellingPoint) ListProtector.get(shopEntranceInfo.sellingPoint, i);
                if (sellingPoint == null) {
                    iLIZIZ2 = 0;
                } else {
                    int iLJIILL3 = C1142340fpg.LJIILL(1, sellingPoint.showText) + C1142340fpg.LJIIIZ(2, sellingPoint.sellingPointType);
                    iLIZIZ2 = iLJIILL3 + C1142350fph.LIZIZ(iLJIILL3) + C1142350fph.LIZ(11);
                }
                iLJIILL2 += iLIZIZ2;
            }
        }
        return iLJIILL2;
    }

    public static void LIZIZ(C1142350fph c1142350fph, EcommerceEntrance.ShopEntranceInfo shopEntranceInfo) {
        C1142340fpg.LJFF(c1142350fph, 1, shopEntranceInfo.shopId);
        C1142340fpg.LJFF(c1142350fph, 2, shopEntranceInfo.shopName);
        C1142340fpg.LJFF(c1142350fph, 3, shopEntranceInfo.shopRating);
        EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel = shopEntranceInfo.storeLabel;
        if (storeLabel != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoEncoder.LIZJ(storeLabel));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoEncoder.LIZIZ(c1142350fph, storeLabel);
        }
        C1142340fpg.LJFF(c1142350fph, 5, shopEntranceInfo.formatSoldCount);
        long j = shopEntranceInfo.soldCount;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j);
        int i = shopEntranceInfo.expRatePercentile;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 8, shopEntranceInfo.expRateTopDisplay);
        int i2 = shopEntranceInfo.rateDisplayStyle;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LIZJ(i2);
        boolean z = shopEntranceInfo.showRateNotApplicable;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LJ(z ? 1 : 0);
        List<EcommerceEntrance.SellingPoint> list = shopEntranceInfo.sellingPoint;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < shopEntranceInfo.sellingPoint.size(); i3++) {
                EcommerceEntrance.SellingPoint sellingPoint = (EcommerceEntrance.SellingPoint) ListProtector.get(shopEntranceInfo.sellingPoint, i3);
                if (sellingPoint != null) {
                    c1142350fph.LIZLLL(11, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, sellingPoint.showText) + C1142340fpg.LJIIIZ(2, sellingPoint.sellingPointType));
                    C1142340fpg.LJFF(c1142350fph, 1, sellingPoint.showText);
                    int i4 = sellingPoint.sellingPointType;
                    c1142350fph.LIZLLL(2, 0);
                    c1142350fph.LIZJ(i4);
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EcommerceEntrance.ShopEntranceInfo shopEntranceInfo) {
        LIZIZ(c1142350fph, shopEntranceInfo);
    }
}
