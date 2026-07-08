package com.ss.android.ugc.aweme.exp.swap;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PhotoSwapInlineMessageConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("affinity_rank")
    public final int affinityRank;

    @C09CT("dismiss_interval")
    public final int dismissInterval;

    @C09CT("display_interval")
    public final int displayInterval;

    @C09CT("max_dismiss_times")
    public final int maxDismissTimes;

    @C09CT("max_unclick_times")
    public final int maxUnclickTimes;

    public PhotoSwapInlineMessageConfig() {
        this(3, 259200000, 3, 432000000, 3);
    }

    public PhotoSwapInlineMessageConfig(int i, int i2, int i3, int i4, int i5) {
        this.affinityRank = i;
        this.displayInterval = i2;
        this.maxUnclickTimes = i3;
        this.dismissInterval = i4;
        this.maxDismissTimes = i5;
    }
}
