package com.bytedance.android.livesdk.message.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ProtoEncoder implements InterfaceC1132110fZB<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel> {
    public static int LIZJ(EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel) {
        int iLIZIZ;
        int iLIZIZ2 = 0;
        int iLJIIIZ = C1142340fpg.LJIIIZ(1, storeIdentityLabel.labelType) + C1142340fpg.LJIILL(2, storeIdentityLabel.identityLabelText);
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage = storeIdentityLabel.identityLogoLight;
        if (shopLabelImage == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(3);
        }
        int i = iLJIIIZ + iLIZIZ;
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage2 = storeIdentityLabel.identityLogoDark;
        if (shopLabelImage2 != null) {
            int iLIZJ2 = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage2);
            iLIZIZ2 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(4);
        }
        return i + iLIZIZ2 + C1142340fpg.LJIILL(5, storeIdentityLabel.identityLabelBgColorLight) + C1142340fpg.LJIILL(6, storeIdentityLabel.identityLabelBgColorDark) + C1142340fpg.LJIILL(7, storeIdentityLabel.identityLabelTextColorLight) + C1142340fpg.LJIILL(8, storeIdentityLabel.identityLabelTextColorDark) + C1142340fpg.LJIILL(9, storeIdentityLabel.shopExplanationPageSchema) + C1142340fpg.LJIILL(10, storeIdentityLabel.shopIdentityLabelKey);
    }

    public static void LIZIZ(C1142350fph c1142350fph, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel) {
        int i = storeIdentityLabel.labelType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 2, storeIdentityLabel.identityLabelText);
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage = storeIdentityLabel.identityLogoLight;
        if (shopLabelImage != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoEncoder.LIZIZ(c1142350fph, shopLabelImage);
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage2 = storeIdentityLabel.identityLogoDark;
        if (shopLabelImage2 != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage2));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoEncoder.LIZIZ(c1142350fph, shopLabelImage2);
        }
        C1142340fpg.LJFF(c1142350fph, 5, storeIdentityLabel.identityLabelBgColorLight);
        C1142340fpg.LJFF(c1142350fph, 6, storeIdentityLabel.identityLabelBgColorDark);
        C1142340fpg.LJFF(c1142350fph, 7, storeIdentityLabel.identityLabelTextColorLight);
        C1142340fpg.LJFF(c1142350fph, 8, storeIdentityLabel.identityLabelTextColorDark);
        C1142340fpg.LJFF(c1142350fph, 9, storeIdentityLabel.shopExplanationPageSchema);
        C1142340fpg.LJFF(c1142350fph, 10, storeIdentityLabel.shopIdentityLabelKey);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel) {
        LIZIZ(c1142350fph, storeIdentityLabel);
    }
}
