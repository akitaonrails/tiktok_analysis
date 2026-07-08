package com.ss.android.ugc.aweme.ecommercebase.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class EnhancedBrandLogo implements Serializable {

    @C09CT("blue_v_image")
    public final Image blueVImage;

    @C09CT("dark_mode_blue_v_image")
    public final Image blueVImageDarkMode;

    @C09CT("seller_logo")
    public final Image sellerLogo;

    @C09CT("seller_name")
    public final String sellerName;

    @C09CT("top_brand_image")
    public final Image topBrand;

    @C09CT("dark_mode_top_brand_image")
    public final Image topBrandDarkMode;

    public EnhancedBrandLogo() {
        this(null, null, null, null, null, null);
    }

    public EnhancedBrandLogo(Image image, String str, Image image2, Image image3, Image image4, Image image5) {
        this.sellerLogo = image;
        this.sellerName = str;
        this.blueVImage = image2;
        this.blueVImageDarkMode = image3;
        this.topBrand = image4;
        this.topBrandDarkMode = image5;
    }
}
