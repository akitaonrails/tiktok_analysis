package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoDecoder implements C0IMD<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage> {
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage = new EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage();
        shopLabelImage.urlList = new ArrayList();
        shopLabelImage.thumbUriList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        shopLabelImage.height = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        shopLabelImage.width = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        shopLabelImage.minetype = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        shopLabelImage.thumbUri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        shopLabelImage.thumbUriList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        shopLabelImage.uri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        shopLabelImage.urlList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        shopLabelImage.color = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shopLabelImage;
            }
        }
    }

    public static void LJ(EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage) {
        if (shopLabelImage.thumbUriList == null) {
            shopLabelImage.thumbUriList = new ArrayList();
        }
        if (shopLabelImage.urlList == null) {
            shopLabelImage.urlList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage) {
        LJ(shopLabelImage);
    }

    @Override // X.C0IMD
    public final EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage, List list) {
    }
}
