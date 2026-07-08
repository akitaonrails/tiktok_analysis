package com.bytedance.android.livesdk.message.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoEncoder implements InterfaceC1132110fZB<EcommerceEntrance.ShopEntranceInfo.StoreLabel> {
    public static int LIZJ(EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel) {
        int iLIZIZ;
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel = storeLabel.officialLabel;
        int iLIZ = 0;
        if (storeOfficialLabel == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoEncoder.LIZJ(storeOfficialLabel);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(1);
        }
        int iLJI = iLIZIZ + C1142340fpg.LJI(2);
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel = storeLabel.shopIdentityLabel;
        if (storeIdentityLabel != null) {
            int iLIZJ2 = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ProtoEncoder.LIZJ(storeIdentityLabel);
            iLIZ = C1142350fph.LIZ(3) + iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2);
        }
        return iLJI + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel = storeLabel.officialLabel;
        if (storeOfficialLabel != null) {
            c1142350fph.LIZLLL(1, 2);
            c1142350fph.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoEncoder.LIZJ(storeOfficialLabel));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoEncoder.LIZIZ(c1142350fph, storeOfficialLabel);
        }
        boolean z = storeLabel.isBytemall;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z ? 1 : 0);
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel = storeLabel.shopIdentityLabel;
        if (storeIdentityLabel != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ProtoEncoder.LIZJ(storeIdentityLabel));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ProtoEncoder.LIZIZ(c1142350fph, storeIdentityLabel);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel) {
        LIZIZ(c1142350fph, storeLabel);
    }
}
