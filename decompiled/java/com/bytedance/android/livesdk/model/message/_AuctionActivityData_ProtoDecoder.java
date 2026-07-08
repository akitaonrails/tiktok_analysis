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
public final class _AuctionActivityData_ProtoDecoder implements C0IMD<AuctionActivityData> {
    public static AuctionActivityData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AuctionActivityData auctionActivityData = new AuctionActivityData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        auctionActivityData.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        auctionActivityData.product = _Product_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        auctionActivityData.sku = _Sku_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        auctionActivityData.surpriseSetName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        auctionActivityData.mainOrderCreateTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        auctionActivityData.mainOrderPaymentTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return auctionActivityData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AuctionActivityData auctionActivityData) {
        ImageModel imageModel;
        ImageModel imageModel2;
        AuctionActivityData auctionActivityData2 = auctionActivityData;
        User user = auctionActivityData2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        Product product = auctionActivityData2.product;
        if (product != null && (imageModel2 = product.cover) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        Sku sku = auctionActivityData2.sku;
        if (sku != null && (imageModel = sku.cover) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final AuctionActivityData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AuctionActivityData auctionActivityData, List list) {
    }
}
