package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C09CT;
import X.C12AV;

/* JADX INFO: loaded from: classes30.dex */
public final class FeedCardTemplate {

    @C09CT("dynamic_url")
    public final String dynamicUrl;

    @C09CT("action_button")
    public final FeedCardActionButtonInfo feedCardActionButtonInfo;

    @C09CT("background")
    public final FeedCardBackgroundInfo feedCardBackgroundInfo;

    @C09CT("dislike_button")
    public final FeedCardDislikeButtonInfo feedCardDislikeButtonInfo;

    @C09CT("event_track")
    public final FeedCardEventTrackInfo feedCardEventTrackInfo;

    @C09CT("lynx_config")
    public final FeedCardLynxConfig feedCardLynxConfig;

    @C09CT("native_config")
    public final C12AV feedCardNativeConfig;

    @C09CT("is_lynx_template")
    public final Boolean isLynxTemplate;

    @C09CT("left_slide_schema")
    public final String leftSlideSchema;

    @C09CT("left_slide_type")
    public final Integer leftSlideType;

    @C09CT("margin_top")
    public final Integer marginTop;

    @C09CT("server_data")
    public final String serverData;

    @C09CT("should_precreate_lynx")
    public final Boolean shouldPrecreateLynx;

    @C09CT("slide_color")
    public final String slideColor;

    @C09CT("trans_info")
    public final String transInfo;

    public FeedCardTemplate(FeedCardBackgroundInfo feedCardBackgroundInfo, FeedCardActionButtonInfo feedCardActionButtonInfo, FeedCardDislikeButtonInfo feedCardDislikeButtonInfo, Integer num, String str, String str2, String str3, String str4, FeedCardEventTrackInfo feedCardEventTrackInfo, Boolean bool, String str5, Integer num2, C12AV c12av, FeedCardLynxConfig feedCardLynxConfig, Boolean bool2) {
        this.feedCardBackgroundInfo = feedCardBackgroundInfo;
        this.feedCardActionButtonInfo = feedCardActionButtonInfo;
        this.feedCardDislikeButtonInfo = feedCardDislikeButtonInfo;
        this.marginTop = num;
        this.slideColor = str;
        this.serverData = str2;
        this.dynamicUrl = str3;
        this.transInfo = str4;
        this.feedCardEventTrackInfo = feedCardEventTrackInfo;
        this.isLynxTemplate = bool;
        this.leftSlideSchema = str5;
        this.leftSlideType = num2;
        this.feedCardLynxConfig = feedCardLynxConfig;
        this.shouldPrecreateLynx = bool2;
    }
}
