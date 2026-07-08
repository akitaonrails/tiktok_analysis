package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationStickerInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("content")
    public final String content;

    @C09CT("date_fmt")
    public final String dateFormat;

    @C09CT("date_range_max")
    public final long dateRangeMax;

    @C09CT("date_range_min")
    public final long dateRangeMin;

    @C09CT("show_date")
    public final boolean showDate;

    @C09CT("sticker_type")
    public final int stickerType;

    public CelebrationStickerInfo() {
        this(0, "", true, "L", 0L, 0L);
    }

    public final boolean needCheckDateRange() {
        return (this.dateRangeMin == 0 && this.dateRangeMax == 0) ? false : true;
    }

    public CelebrationStickerInfo(int i, String str, boolean z, String str2, long j, long j2) {
        this.stickerType = i;
        this.content = str;
        this.showDate = z;
        this.dateFormat = str2;
        this.dateRangeMin = j;
        this.dateRangeMax = j2;
    }
}
