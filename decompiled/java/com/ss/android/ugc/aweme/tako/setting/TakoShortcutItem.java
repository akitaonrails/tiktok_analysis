package com.ss.android.ugc.aweme.tako.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoShortcutItem {

    @C09CT("max_show_count")
    public final int maxShowCount;

    @C09CT("min_show_interval_day")
    public final int minShowIntervalDay;

    public TakoShortcutItem() {
        this(3, 14);
    }

    public TakoShortcutItem(int i, int i2) {
        this.maxShowCount = i;
        this.minShowIntervalDay = i2;
    }
}
