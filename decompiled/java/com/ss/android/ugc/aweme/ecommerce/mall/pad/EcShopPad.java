package com.ss.android.ugc.aweme.ecommerce.mall.pad;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcShopPad {

    @C09CT("allow_spark_channel_list")
    public final List<String> allowSparkChannelList;

    @C09CT("enable_api")
    public final Integer enableApi;

    @C09CT("enable_api_spark_interceptor")
    public final Integer enableApiSparkInterceptor;

    @C09CT("enable_default_pad_styles")
    public final Integer enableDefaultPadStyles;

    @C09CT("enable_multi_feeds")
    public final Integer enableMultiFeeds;

    @C09CT("enable_orientation")
    public final Integer enableOrientation;

    @C09CT("loadmore_size")
    public final Integer loadMoreSize;

    public EcShopPad(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List<String> list) {
        this.enableApi = num;
        this.enableApiSparkInterceptor = num2;
        this.enableDefaultPadStyles = num3;
        this.enableMultiFeeds = num4;
        this.enableOrientation = num5;
        this.loadMoreSize = num6;
        this.allowSparkChannelList = list;
    }
}
