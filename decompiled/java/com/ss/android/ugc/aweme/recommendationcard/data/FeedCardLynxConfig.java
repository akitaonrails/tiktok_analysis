package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class FeedCardLynxConfig {

    @C09CT("button_padding_bottom")
    public final Integer buttonPaddingBottom;

    @C09CT("content_padding_lr")
    public final Integer contentPaddingLr;

    @C09CT("dynamic_url")
    public final String dynamicUrl;

    @C09CT("action_button")
    public final FeedCardActionButtonInfo feedCardActionButtonInfo;

    @C09CT("background")
    public final FeedCardBackgroundInfo feedCardBackgroundInfo;

    @C09CT("dislike_button")
    public final FeedCardDislikeButtonInfo feedCardDislikeButtonInfo;

    @C09CT("margin_top")
    public final Integer marginTop;

    @C09CT("slide_color")
    public final String slideColor;

    public FeedCardLynxConfig(String str, FeedCardBackgroundInfo feedCardBackgroundInfo, FeedCardActionButtonInfo feedCardActionButtonInfo, FeedCardDislikeButtonInfo feedCardDislikeButtonInfo, Integer num, Integer num2, Integer num3, String str2) {
        this.dynamicUrl = str;
        this.feedCardBackgroundInfo = feedCardBackgroundInfo;
        this.feedCardActionButtonInfo = feedCardActionButtonInfo;
        this.feedCardDislikeButtonInfo = feedCardDislikeButtonInfo;
        this.contentPaddingLr = num;
        this.buttonPaddingBottom = num2;
        this.marginTop = num3;
        this.slideColor = str2;
    }
}
