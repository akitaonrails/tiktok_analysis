package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ProductAtmosphereTag_ProtoDecoder implements C0IMD<ProductAtmosphereTag> {
    public static ProductAtmosphereTag LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ProductAtmosphereTag productAtmosphereTag = new ProductAtmosphereTag();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            productAtmosphereTag.count = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        productAtmosphereTag.tagDesc = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    productAtmosphereTag.productId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return productAtmosphereTag;
            }
        }
    }

    @Override // X.C0IMD
    public final ProductAtmosphereTag LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ProductAtmosphereTag productAtmosphereTag) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProductAtmosphereTag productAtmosphereTag, List list) {
    }
}
