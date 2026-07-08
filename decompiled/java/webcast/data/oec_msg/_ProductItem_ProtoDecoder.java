package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ProductItem_ProtoDecoder implements C0IMD<ProductItem> {
    public static ProductItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ProductItem productItem = new ProductItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        productItem.productId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        productItem.bagIndex = _BagIndex_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        productItem.title = _Title_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        productItem.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        productItem.atmosphereInfo = _AtmosphereInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        productItem.shopBrandLogo = _ShopBrandLogo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        productItem.liveFlashSaleInfo = _LiveFlashSaleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        productItem.auctionInfo = _AuctionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return productItem;
            }
        }
    }

    public static void LJ(ProductItem productItem) {
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        ImageModel imageModel = productItem.cover;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        AtmosphereInfo atmosphereInfo = productItem.atmosphereInfo;
        if (atmosphereInfo != null) {
            _AtmosphereInfo_ProtoDecoder.LJ(atmosphereInfo);
        }
        ShopBrandLogo shopBrandLogo = productItem.shopBrandLogo;
        if (shopBrandLogo != null) {
            _ShopBrandLogo_ProtoDecoder.LJ(shopBrandLogo);
        }
        LiveFlashSaleInfo liveFlashSaleInfo = productItem.liveFlashSaleInfo;
        if (liveFlashSaleInfo != null && (flashSaleEnhancementInfo = liveFlashSaleInfo.enhancementInfo) != null) {
            _FlashSaleEnhancementInfo_ProtoDecoder.LJ(flashSaleEnhancementInfo);
        }
        AuctionInfo auctionInfo = productItem.auctionInfo;
        if (auctionInfo != null) {
            _AuctionInfo_ProtoDecoder.LJ(auctionInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ProductItem productItem) {
        LJ(productItem);
    }

    @Override // X.C0IMD
    public final ProductItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProductItem productItem, List list) {
    }
}
