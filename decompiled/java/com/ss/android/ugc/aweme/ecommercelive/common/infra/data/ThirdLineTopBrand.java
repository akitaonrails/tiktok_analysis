package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class ThirdLineTopBrand implements Serializable {

    @C09CT("blue_v_image")
    public final Image blueVImage;

    @C09CT("dark_mode_blue_v_image")
    public final Image blueVImageDarkMode;

    @C09CT("prefix")
    public final TopBrand prefix;

    @C09CT("seller_logo")
    public final Image sellerLogo;

    @C09CT("seller_name")
    public final String sellerName;

    public ThirdLineTopBrand() {
        this(null, null, null, null, null);
    }

    public ThirdLineTopBrand(Image image, String str, Image image2, Image image3, TopBrand topBrand) {
        this.sellerLogo = image;
        this.sellerName = str;
        this.blueVImage = image2;
        this.blueVImageDarkMode = image3;
        this.prefix = topBrand;
    }
}
