package com.bytedance.android.livesdk.message.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ProtoEncoder implements InterfaceC1132110fZB<EcommerceEntrance> {
    public static int LIZJ(EcommerceEntrance ecommerceEntrance) {
        int iLIZIZ;
        int iLIZIZ2 = 0;
        int iLJIIIZ = C1142340fpg.LJIIIZ(1, ecommerceEntrance.entranceType) + C1142340fpg.LJIIIZ(2, ecommerceEntrance.creatorType) + C1142340fpg.LJIILL(3, ecommerceEntrance.schema);
        EcommerceEntrance.ShopEntranceInfo shopEntranceInfo = ecommerceEntrance.shopEntranceInfo;
        if (shopEntranceInfo == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _EcommerceEntrance_ShopEntranceInfo_ProtoEncoder.LIZJ(shopEntranceInfo);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(4);
        }
        int i = iLJIIIZ + iLIZIZ;
        EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo = ecommerceEntrance.showcaseEntranceInfo;
        if (showcaseEntranceInfo != null) {
            int iLIZJ2 = _EcommerceEntrance_ShowcaseEntranceInfo_ProtoEncoder.LIZJ(showcaseEntranceInfo);
            iLIZIZ2 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(5);
        }
        return i + iLIZIZ2 + C1142340fpg.LJIIIZ(6, ecommerceEntrance.viewVersion);
    }

    public static void LIZIZ(C1142350fph c1142350fph, EcommerceEntrance ecommerceEntrance) {
        int i = ecommerceEntrance.entranceType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        int i2 = ecommerceEntrance.creatorType;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i2);
        C1142340fpg.LJFF(c1142350fph, 3, ecommerceEntrance.schema);
        EcommerceEntrance.ShopEntranceInfo shopEntranceInfo = ecommerceEntrance.shopEntranceInfo;
        if (shopEntranceInfo != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_EcommerceEntrance_ShopEntranceInfo_ProtoEncoder.LIZJ(shopEntranceInfo));
            _EcommerceEntrance_ShopEntranceInfo_ProtoEncoder.LIZIZ(c1142350fph, shopEntranceInfo);
        }
        EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo = ecommerceEntrance.showcaseEntranceInfo;
        if (showcaseEntranceInfo != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(_EcommerceEntrance_ShowcaseEntranceInfo_ProtoEncoder.LIZJ(showcaseEntranceInfo));
            _EcommerceEntrance_ShowcaseEntranceInfo_ProtoEncoder.LIZIZ(c1142350fph, showcaseEntranceInfo);
        }
        int i3 = ecommerceEntrance.viewVersion;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LIZJ(i3);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EcommerceEntrance ecommerceEntrance) {
        LIZIZ(c1142350fph, ecommerceEntrance);
    }
}
