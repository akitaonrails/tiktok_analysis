package com.ss.android.ugc.aweme.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class Crowd {

    @C09CT("enable_fallback_vtag")
    public final Integer enableFallbackVTag;

    @C09CT("show_feedbar_sug_reason")
    public final Integer enableFeedbarSugReason;

    @C09CT("show_tako_bar_rec_reason")
    public final Integer enableTakoBarRecReason;

    @C09CT("show_tako_generate_rec_reason")
    public final Integer enableTakoGenerateRecReason;

    @C09CT("enable_vtag")
    public final Integer enableVTag;

    @C09CT("enable_visual_search_guide")
    public final Integer enableVisualSearchGuide;

    @C09CT("recent_search_day_15")
    public final Integer recentSearchDay15;

    @C09CT("show_feedbar_see_more")
    public final int showFeedbarSeeMore;

    @C09CT("show_interest_word")
    public final int showInterestWord;

    @C09CT("show_search_box")
    public final int showSearchBox;

    @C09CT("show_search_box_mt")
    public final int showSearchBoxMt;

    @C09CT("show_search_coin_task_label")
    public final int showSearchCoinTaskLabel;

    @C09CT("rec_user_education_p2_feed_bubble")
    public final int userEducationP2FeedBubble;

    @C09CT("rec_user_education_p2_weaken_banner")
    public final int userEducationP2WeakenBanner;

    public Crowd() {
        this(0, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, null);
    }

    public Crowd(int i, int i2, int i3, int i4, int i5, int i6, Integer num, int i7, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.userEducationP2FeedBubble = i;
        this.userEducationP2WeakenBanner = i2;
        this.showSearchBox = i3;
        this.showSearchBoxMt = i4;
        this.showSearchCoinTaskLabel = i5;
        this.showInterestWord = i6;
        this.enableVTag = num;
        this.showFeedbarSeeMore = i7;
        this.enableFallbackVTag = num2;
        this.enableFeedbarSugReason = num3;
        this.recentSearchDay15 = num4;
        this.enableTakoBarRecReason = num5;
        this.enableTakoGenerateRecReason = num6;
        this.enableVisualSearchGuide = num7;
    }
}
