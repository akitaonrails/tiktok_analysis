package webcast.data.oec_msg;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class ProductItem {

    @C09CT("atmosphere_info")
    public AtmosphereInfo atmosphereInfo;

    @C09CT("auction_info")
    public AuctionInfo auctionInfo;

    @C09CT("bag_index")
    public BagIndex bagIndex;

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("live_flash_sale_info")
    public LiveFlashSaleInfo liveFlashSaleInfo;

    @C09CT("product_id")
    public long productId;

    @C09CT("shop_brand_logo")
    public ShopBrandLogo shopBrandLogo;

    @C09CT("title")
    public Title title;
}
