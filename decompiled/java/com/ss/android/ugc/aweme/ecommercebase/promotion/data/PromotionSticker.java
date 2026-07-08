package com.ss.android.ugc.aweme.ecommercebase.promotion.data;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.PromotionProperty;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class PromotionSticker implements Serializable {

    @C09CT("da_info")
    @C09CS(StringJsonAdapterFactory.class)
    public final HashMap<String, Object> daInfo;

    @C09CT("event_tracking_name")
    public final String eventTrackingName;

    @C09CT("feature")
    public final List<PromotionProperty> extraProperty;

    @C09CT("height")
    public final Integer height;

    @C09CT("image")
    public final Image image;

    @C09CT("left_retract")
    public final Integer leftRetract;

    @C09CT("max_scaling_width")
    public final Integer maxScalingWidth;

    @C09CT("sticker_image_type")
    public final Integer stickerImageType;

    @C09CT("type")
    public final Integer type;

    public PromotionSticker(Image image, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, List<PromotionProperty> list, HashMap<String, Object> map) {
        this.image = image;
        this.leftRetract = num;
        this.eventTrackingName = str;
        this.type = num2;
        this.height = num3;
        this.stickerImageType = num4;
        this.maxScalingWidth = num5;
        this.extraProperty = list;
        this.daInfo = map;
    }
}
