package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftOperation_ProtoDecoder implements C0IMD<GiftOperation> {
    public static GiftOperation LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftOperation giftOperation = new GiftOperation();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftOperation.leftImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftOperation.rightImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftOperation.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        giftOperation.titleColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        giftOperation.titleSize = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        giftOperation.schemeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftOperation.eventName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftOperation;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftOperation giftOperation) {
        GiftOperation giftOperation2 = giftOperation;
        ImageModel imageModel = giftOperation2.leftImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = giftOperation2.rightImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final GiftOperation LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftOperation giftOperation, List list) {
    }
}
