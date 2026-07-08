package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.EnumC634740Ov2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class EcPhotoSearchBubbleGuideModel implements Serializable {

    @C09CT("bubble_duration")
    public final long bubbleDuration;

    @C09CT("bubble_style")
    public final int bubbleStyle;

    @C09CT("enable_show_bubble")
    public final boolean enableShowBubble;

    @C09CT("latest_photo_duration_enable_show_bubble")
    public final long latestPhotoDuration;

    @C09CT("bubble_max_show_times_in_a_day")
    public final int maxShowTimes;

    public EcPhotoSearchBubbleGuideModel() {
        this(false, 90L, EnumC634740Ov2.SMALL.getStyle(), 3L, 3);
    }

    public EcPhotoSearchBubbleGuideModel(boolean z, long j, int i, long j2, int i2) {
        this.enableShowBubble = z;
        this.latestPhotoDuration = j;
        this.bubbleStyle = i;
        this.bubbleDuration = j2;
        this.maxShowTimes = i2;
    }
}
