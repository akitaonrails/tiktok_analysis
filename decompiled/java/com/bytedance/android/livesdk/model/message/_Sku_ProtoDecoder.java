package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Sku_ProtoDecoder implements C0IMD<Sku> {
    public static Sku LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Sku sku = new Sku();
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
                                sku.skuId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            sku.price = _ProductPrice_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        sku.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    sku.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sku;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Sku sku) {
        ImageModel imageModel = sku.cover;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final Sku LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Sku sku, List list) {
    }
}
