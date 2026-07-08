package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RandomGiftPanelBanner {

    @C09CT("banner_priority")
    public int bannerPriority;

    @C09CT("bg_color_values")
    public List<String> bgColors;

    @C09CT("collect_num")
    public long collectNum;

    @C09CT("display_text")
    public String displayText;

    @C09CT("left_icon")
    public ImageModel leftIcon;

    @C09CT("round")
    public long round;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("shading_image")
    public ImageModel shadingImage;

    @C09CT("target_num")
    public long targetNum;

    public RandomGiftPanelBanner() {
        this(null, 1L, -1L, 0L, null, null, null, "sslocal://webcast_lynxview_popup?container_bg_color=00000000&show_mask=1&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_random_gift%2Fpages%2Fcollection%2Ftemplate.js&gravity=bottom&height=1090rpx&radius=16rpx", 0);
    }

    public RandomGiftPanelBanner(List<String> list, long j, long j2, long j3, String str, ImageModel imageModel, ImageModel imageModel2, String str2, int i) {
        this.bgColors = list;
        this.round = j;
        this.targetNum = j2;
        this.collectNum = j3;
        this.displayText = str;
        this.leftIcon = imageModel;
        this.shadingImage = imageModel2;
        this.schemaUrl = str2;
        this.bannerPriority = i;
    }
}
