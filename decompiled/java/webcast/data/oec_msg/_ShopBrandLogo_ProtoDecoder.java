package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShopBrandLogo_ProtoDecoder implements C0IMD<ShopBrandLogo> {
    public static ShopBrandLogo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShopBrandLogo shopBrandLogo = new ShopBrandLogo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        shopBrandLogo.sellerName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        shopBrandLogo.sellerLogo = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        shopBrandLogo.blueVImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        shopBrandLogo.darkBlueVImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        shopBrandLogo.topBrandImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        shopBrandLogo.darkTopBrandImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shopBrandLogo;
            }
        }
    }

    public static void LJ(ShopBrandLogo shopBrandLogo) {
        ImageModel imageModel = shopBrandLogo.sellerLogo;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = shopBrandLogo.blueVImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = shopBrandLogo.darkBlueVImage;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        ImageModel imageModel4 = shopBrandLogo.topBrandImage;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        ImageModel imageModel5 = shopBrandLogo.darkTopBrandImage;
        if (imageModel5 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel5);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ShopBrandLogo shopBrandLogo) {
        LJ(shopBrandLogo);
    }

    @Override // X.C0IMD
    public final ShopBrandLogo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShopBrandLogo shopBrandLogo, List list) {
    }
}
