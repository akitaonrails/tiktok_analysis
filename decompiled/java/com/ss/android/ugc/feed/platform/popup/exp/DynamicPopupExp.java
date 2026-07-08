package com.ss.android.ugc.feed.platform.popup.exp;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class DynamicPopupExp {

    @C09CT("dynamic_popup_enable")
    public final boolean dynamicPopupEnable;

    @C09CT("android_ignored_popup_key_list")
    public final List<String> ignoredPopupKeyList;

    @C09CT("max_fetch_popup_count")
    public final int maxFetchPopupCount;

    @C09CT("preload_img_cold_start_delay")
    public final long preloadImgColdStartDelay;

    public DynamicPopupExp() {
        this(false, null, 5L, 5);
    }

    public DynamicPopupExp(boolean z, List<String> list, long j, int i) {
        this.dynamicPopupEnable = z;
        this.ignoredPopupKeyList = list;
        this.preloadImgColdStartDelay = j;
        this.maxFetchPopupCount = i;
    }
}
