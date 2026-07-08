package com.ss.android.ugc.aweme.search.entry.searchbubble.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageHotSearchTipsConfig {

    @C09CT("search_hot_words_bubble_display")
    public final int bubbleDisplayLogic;

    @C09CT("search_hot_word_api_min_interval")
    public final int searchHotWordApiMinInterval;

    @C09CT("bubble_display_days_required")
    public final int bubbleDisplayDaysRequired = 1;

    @C09CT("bubble_display_count_in_days")
    public final int bubbleDisplayCountInDays = 1;

    @C09CT("bubble_stay_duration")
    public final int bubbleStayDuration = 5;

    @C09CT("min_interval_between_displays")
    public final int minIntervalBetweenDisplays = 30;

    @C09CT("bubble_max_consecutive_unclicked")
    public final int bubbleMaxConsecutiveUnclicked = 5;

    @C09CT("bubble_no_display_days_after_exit")
    public final int bubbleNoDisplayDaysAfterExit = 7;

    @C09CT("search_hot_word_api_max_interval")
    public final int searchHotWordApiMaxInterval = 30;

    @C09CT("carrying_hot_words_expired_time")
    public final int carryingHotWordsExpiredTime = 10;

    @C09CT("search_bubble_protection_mode")
    public final int searchBubbleProtectionMode = 1;
}
