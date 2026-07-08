package webcast.api.room_live_studio;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProductDetail {

    @C09CT("product")
    public ProductCard product;

    @C09CT("bundle_details")
    public List<BundleDetail> bundleDetails = new ArrayList();

    @C09CT("pricing_details")
    public List<PricingDetail> pricingDetails = new ArrayList();

    @C09CT("detail_text")
    public String detailText = "";

    @C09CT("detail_image_urls")
    public List<String> detailImageUrls = new ArrayList();

    @C09CT("same_supplier_recommendations")
    public List<ProductCard> sameSupplierRecommendations = new ArrayList();

    @C09CT("detail_images")
    public List<ImageUrlSet> detailImages = new ArrayList();
}
