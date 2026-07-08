package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchFilterShiftConfig {

    @C09CT("disable_lynx_filter_entry_count")
    public final Integer disableLynxFilterEntryCount;

    @C09CT("enable")
    public final Integer enable;

    @C09CT("enable_native_filter_entry")
    public final Integer enableNativeFilterEntry;

    @C09CT("enable_tab_sort_entry")
    public final Integer enableTabSortEntry;

    @C09CT("filter_max_width")
    public final Integer filterMaxWidth;

    @C09CT("filter_skeleton_width")
    public final Integer filterSkeletonWidth;

    @C09CT("show_filter_count")
    public final Integer showFilterCount;

    @C09CT("tab_sort_filter_min_gecko_version")
    public final Long tabSortFilterMinGeckoVersion;

    @C09CT("tab_sort_show_recommend")
    public final Integer tabSortShowRecommend;

    public ECSearchFilterShiftConfig() {
        this(0, 0, 0, 0L, 40, 72, 1, 0, 0);
    }

    public ECSearchFilterShiftConfig(Integer num, Integer num2, Integer num3, Long l, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
        this.enable = num;
        this.enableTabSortEntry = num2;
        this.enableNativeFilterEntry = num3;
        this.tabSortFilterMinGeckoVersion = l;
        this.filterSkeletonWidth = num4;
        this.filterMaxWidth = num5;
        this.showFilterCount = num6;
        this.disableLynxFilterEntryCount = num7;
        this.tabSortShowRecommend = num8;
    }
}
