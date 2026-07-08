package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopCreator;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class Shop {

    @C09CT("creator")
    public final ShopCreator creator;

    @C09CT("display_sold_count")
    public final String displaySoldCount;

    @C09CT("display_on_sell_product_count")
    public final String display_on_sell_product_count;

    @C09CT("store_label")
    public final StoreLabel label;

    @C09CT("logo")
    public final Image logo;

    @C09CT("is_on_holiday")
    public final Boolean onHoliday;

    @C09CT("on_sell_product_count")
    public final int onSellProductCount;

    @C09CT("rating_details")
    public final List<Object> ratingDetails;

    @C09CT("exp_rate_percentile")
    public final Integer ratingPercentile;

    @C09CT("show_rate_not_applicable")
    public final Boolean ratingShowNA;

    @C09CT("rate_display_style")
    public final Integer ratingStyle;

    @C09CT("review_count")
    public final int reviewCount;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("shop_name")
    public final String shopName;

    @C09CT("shop_rating")
    public final String shopRating;

    @C09CT("sold_count")
    public final int soldCount;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public Shop(String str, String str2, int i, Image image, String str3, int i2, String str4, int i3, int i4, List<Object> list, StoreLabel storeLabel, Integer num, Integer num2, Boolean bool, Boolean bool2, String str5, ShopCreator shopCreator) {
        this.sellerId = str;
        this.shopName = str2;
        this.status = i;
        this.logo = image;
        this.shopRating = str3;
        this.soldCount = i2;
        this.displaySoldCount = str4;
        this.onSellProductCount = i3;
        this.reviewCount = i4;
        this.ratingDetails = list;
        this.label = storeLabel;
        this.ratingPercentile = num;
        this.ratingStyle = num2;
        this.ratingShowNA = bool;
        this.onHoliday = bool2;
        this.display_on_sell_product_count = str5;
        this.creator = shopCreator;
    }
}
