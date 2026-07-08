package com.bytedance.android.livesdk.message.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoEncoder implements InterfaceC1132110fZB<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel> {
    public static int LIZJ(EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel) {
        int iLIZIZ;
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage = storeOfficialLabel.labelImageLight;
        int iLIZIZ2 = 0;
        if (shopLabelImage == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(1);
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage2 = storeOfficialLabel.labelImageDark;
        if (shopLabelImage2 != null) {
            int iLIZJ2 = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage2);
            iLIZIZ2 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(2);
        }
        return iLIZIZ + iLIZIZ2 + C1142340fpg.LJIIIZ(3, storeOfficialLabel.labelType) + C1142340fpg.LJIILL(4, storeOfficialLabel.labelTypeStr);
    }

    public static void LIZIZ(C1142350fph c1142350fph, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage = storeOfficialLabel.labelImageLight;
        if (shopLabelImage != null) {
            c1142350fph.LIZLLL(1, 2);
            c1142350fph.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZIZ(c1142350fph, shopLabelImage);
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage2 = storeOfficialLabel.labelImageDark;
        if (shopLabelImage2 != null) {
            c1142350fph.LIZLLL(2, 2);
            c1142350fph.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage2));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZIZ(c1142350fph, shopLabelImage2);
        }
        int i = storeOfficialLabel.labelType;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 4, storeOfficialLabel.labelTypeStr);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel) {
        LIZIZ(c1142350fph, storeOfficialLabel);
    }
}
