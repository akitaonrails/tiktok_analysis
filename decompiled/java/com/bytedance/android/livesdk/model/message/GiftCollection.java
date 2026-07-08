package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: loaded from: classes.dex */
public class GiftCollection {

    @C09CT("effect_name_key")
    public String effectNameKey;

    @C09CT("gift")
    public Gift gift;

    @C09CT("filter_host")
    public boolean isFilterHost;

    @C09CT("type")
    public long messageType;

    @C09CT("round")
    public long round;

    @C09CT("schema_url")
    public String schemaUrl = "sslocal://webcast_lynxview_popup?container_bg_color=00000000&show_mask=1&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_random_gift%2Fpages%2Fcollection%2Ftemplate.js&gravity=bottom&height=1090rpx&radius=16rpx";
}
