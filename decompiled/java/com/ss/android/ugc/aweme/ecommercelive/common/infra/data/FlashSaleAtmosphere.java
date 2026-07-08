package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class FlashSaleAtmosphere {

    @C09CT("activity_id")
    public final long activityId;

    @C09CT("animation_display_price_list")
    public final List<String> animatorDisplayPriceList;

    @C09CT("animation_display_price_decimal_part_list")
    public final List<String> animatorPriceDecimalList;

    @C09CT("animation_display_price_integer_part_list")
    public final List<String> animatorPriceIntegerList;

    @C09CT("animation_format_price_list")
    public final List<String> animatorPriceList;

    @C09CT("discount")
    public final String discount;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("enhancement_info")
    public FlashSaleEnhancementInfo enhancementInfo;

    @C09CT("format_origin_price")
    public final String formatOriginPrice;

    @C09CT("format_price")
    public final String formatPrice;

    @C09CT("preheat_text")
    public final String preheatText;

    @C09CT("preheat_time")
    public final long preheatTime;

    @C09CT("start_time")
    public final long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public FlashSaleAtmosphere(long j, int i, long j2, long j3, long j4, String str, String str2, List<String> list, List<String> list2, List<String> list3, List<String> list4, String str3, String str4, FlashSaleEnhancementInfo flashSaleEnhancementInfo) {
        this.activityId = j;
        this.status = i;
        this.startTime = j2;
        this.endTime = j3;
        this.preheatTime = j4;
        this.preheatText = str;
        this.formatPrice = str2;
        this.animatorPriceList = list;
        this.animatorDisplayPriceList = list2;
        this.animatorPriceIntegerList = list3;
        this.animatorPriceDecimalList = list4;
        this.discount = str3;
        this.formatOriginPrice = str4;
        this.enhancementInfo = flashSaleEnhancementInfo;
    }
}
