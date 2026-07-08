package com.ss.android.ugc.aweme.ecommerce.mixmall.settings;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallFeedConfigModel {

    @C09CT("enable_feed_dynamic_height")
    public final Integer enableFeedDynamicHeight;

    @C09CT("enable_new_insert_animation")
    public final Integer enableInsertAnimation;

    @C09CT("impression_report_interval")
    public final int impressionReportInterval;

    @C09CT("loadmore_threshold")
    public final int loadmoreThreshold;

    @C09CT("pre_request_tab_threshold")
    public final int preRequestTabThreshold;

    public ECMixMallFeedConfigModel() {
        this(7, LSPassThroughRecordSizeConfig.DEFAULT, 0, 0, 0);
    }

    public ECMixMallFeedConfigModel(int i, int i2, int i3, Integer num, Integer num2) {
        this.loadmoreThreshold = i;
        this.impressionReportInterval = i2;
        this.preRequestTabThreshold = i3;
        this.enableFeedDynamicHeight = num;
        this.enableInsertAnimation = num2;
    }
}
