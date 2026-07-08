package com.ss.android.ugc.aweme.ecommercebase.view;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionLogo implements Serializable {

    @C09CT("da_info")
    @C09CS(StringJsonAdapterFactory.class)
    public final Map<String, Object> daInfo;

    @C09CT("dark_mode_image")
    public final Image darkModeImage;

    @C09CT("image")
    public final Image image;

    @C09CT("promotion_id")
    public final String promotionId;

    public PromotionLogo() {
        this(null, null, null, null);
    }

    public PromotionLogo(Image image, Image image2, String str, Map<String, ? extends Object> map) {
        this.image = image;
        this.darkModeImage = image2;
        this.promotionId = str;
        this.daInfo = map;
    }
}
