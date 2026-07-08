package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoDecoder implements C0IMD<EcommerceEntrance.ShopEntranceInfo.StoreLabel> {
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel = new EcommerceEntrance.ShopEntranceInfo.StoreLabel();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            storeLabel.shopIdentityLabel = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        storeLabel.isBytemall = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    storeLabel.officialLabel = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return storeLabel;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel2 = storeLabel;
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel = storeLabel2.officialLabel;
        if (storeOfficialLabel != null) {
            EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage = storeOfficialLabel.labelImageLight;
            if (shopLabelImage != null) {
                _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage);
            }
            EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage2 = storeOfficialLabel.labelImageDark;
            if (shopLabelImage2 != null) {
                _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage2);
            }
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel = storeLabel2.shopIdentityLabel;
        if (storeIdentityLabel != null) {
            EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage3 = storeIdentityLabel.identityLogoLight;
            if (shopLabelImage3 != null) {
                _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage3);
            }
            EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage4 = storeIdentityLabel.identityLogoDark;
            if (shopLabelImage4 != null) {
                _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage4);
            }
        }
    }

    @Override // X.C0IMD
    public final EcommerceEntrance.ShopEntranceInfo.StoreLabel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel, List list) {
    }
}
