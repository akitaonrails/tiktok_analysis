package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoDecoder implements C0IMD<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel> {
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel = new EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel();
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
                                storeOfficialLabel.labelTypeStr = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            storeOfficialLabel.labelType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        storeOfficialLabel.labelImageDark = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    storeOfficialLabel.labelImageLight = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return storeOfficialLabel;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel2 = storeOfficialLabel;
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage = storeOfficialLabel2.labelImageLight;
        if (shopLabelImage != null) {
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage);
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage2 = storeOfficialLabel2.labelImageDark;
        if (shopLabelImage2 != null) {
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage2);
        }
    }

    @Override // X.C0IMD
    public final EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel, List list) {
    }
}
