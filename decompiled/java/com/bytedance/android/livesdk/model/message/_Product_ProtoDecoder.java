package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Product_ProtoDecoder implements C0IMD<Product> {
    public static Product LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Product product = new Product();
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
                                product.productId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            product.price = _ProductPrice_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        product.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    product.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return product;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Product product) {
        ImageModel imageModel = product.cover;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final Product LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Product product, List list) {
    }
}
