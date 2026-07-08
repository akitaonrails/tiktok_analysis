package com.ss.android.ugc.aweme.kids.common.response;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class KidsVideoPlaytimeReminder {

    @C09CT("wellness_img_url")
    public final String imageUrl;

    @C09CT("dark_wellness_img_url")
    public final String imageUrlDark;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("threshold")
    public final Integer threshold;

    @C09CT("title")
    public final String title;

    public KidsVideoPlaytimeReminder() {
        this(null, null, null, null, null);
    }

    public KidsVideoPlaytimeReminder(Integer num, String str, String str2, String str3, String str4) {
        this.threshold = num;
        this.imageUrl = str;
        this.imageUrlDark = str2;
        this.title = str3;
        this.subtitle = str4;
    }
}
