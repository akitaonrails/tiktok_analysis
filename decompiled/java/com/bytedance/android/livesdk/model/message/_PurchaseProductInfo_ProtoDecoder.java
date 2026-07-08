package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PurchaseProductInfo_ProtoDecoder implements C0IMD<PurchaseProductInfo> {
    public static PurchaseProductInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PurchaseProductInfo purchaseProductInfo = new PurchaseProductInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    purchaseProductInfo.mainOrderPaymentTime = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                purchaseProductInfo.mainOrderCreateTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            purchaseProductInfo.productIndex = c1516680pZS.LJIIJ();
                        }
                    } else {
                        purchaseProductInfo.product = _Product_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    purchaseProductInfo.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return purchaseProductInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PurchaseProductInfo purchaseProductInfo) {
        ImageModel imageModel;
        PurchaseProductInfo purchaseProductInfo2 = purchaseProductInfo;
        User user = purchaseProductInfo2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        Product product = purchaseProductInfo2.product;
        if (product != null && (imageModel = product.cover) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final PurchaseProductInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PurchaseProductInfo purchaseProductInfo, List list) {
    }
}
