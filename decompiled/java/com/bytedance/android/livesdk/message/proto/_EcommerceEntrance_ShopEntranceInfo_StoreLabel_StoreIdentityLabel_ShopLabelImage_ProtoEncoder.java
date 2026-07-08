package com.bytedance.android.livesdk.message.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoEncoder implements InterfaceC1132110fZB<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage> {
    public static int LIZJ(EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage) {
        if (shopLabelImage == null) {
            return 0;
        }
        int iLJIIIZ = C1142340fpg.LJIIIZ(1, shopLabelImage.height) + C1142340fpg.LJIIIZ(2, shopLabelImage.width) + C1142340fpg.LJIILL(3, shopLabelImage.minetype) + C1142340fpg.LJIILL(4, shopLabelImage.thumbUri);
        List<String> list = shopLabelImage.thumbUriList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < shopLabelImage.thumbUriList.size(); i++) {
                iLJIIIZ += C1142340fpg.LJIILL(5, (String) ListProtector.get(shopLabelImage.thumbUriList, i));
            }
        }
        int iLJIILL = iLJIIIZ + C1142340fpg.LJIILL(6, shopLabelImage.uri);
        List<String> list2 = shopLabelImage.urlList;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < shopLabelImage.urlList.size(); i2++) {
                iLJIILL += C1142340fpg.LJIILL(7, (String) ListProtector.get(shopLabelImage.urlList, i2));
            }
        }
        return iLJIILL + C1142340fpg.LJIILL(8, shopLabelImage.color);
    }

    public static void LIZIZ(C1142350fph c1142350fph, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage) {
        int i = shopLabelImage.height;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        int i2 = shopLabelImage.width;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i2);
        C1142340fpg.LJFF(c1142350fph, 3, shopLabelImage.minetype);
        C1142340fpg.LJFF(c1142350fph, 4, shopLabelImage.thumbUri);
        List<String> list = shopLabelImage.thumbUriList;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < shopLabelImage.thumbUriList.size(); i3++) {
                C1142340fpg.LJFF(c1142350fph, 5, (String) ListProtector.get(shopLabelImage.thumbUriList, i3));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 6, shopLabelImage.uri);
        List<String> list2 = shopLabelImage.urlList;
        if (list2 != null && !list2.isEmpty()) {
            for (int i4 = 0; i4 < shopLabelImage.urlList.size(); i4++) {
                C1142340fpg.LJFF(c1142350fph, 7, (String) ListProtector.get(shopLabelImage.urlList, i4));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 8, shopLabelImage.color);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage) {
        LIZIZ(c1142350fph, shopLabelImage);
    }
}
