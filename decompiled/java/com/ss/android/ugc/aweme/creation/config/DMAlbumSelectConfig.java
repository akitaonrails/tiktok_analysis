package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import X.C538540LAe;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class DMAlbumSelectConfig implements Serializable {

    @C09CT("max_media_count")
    public final int maxSelectCount;

    @C09CT("max_video_duration")
    public final int maxVideoDuration;

    @C09CT("show_safety_notice_time")
    public final int showSafetyNoticeTime;

    public DMAlbumSelectConfig() {
        this(9, C538540LAe.LLJJJIL, 2);
    }

    public DMAlbumSelectConfig(int i, int i2, int i3) {
        this.maxSelectCount = i;
        this.maxVideoDuration = i2;
        this.showSafetyNoticeTime = i3;
    }
}
