package com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoCount {

    @C09CT("video_off_count")
    public final int offCount;

    @C09CT("video_on_count")
    public final int onCount;

    public VideoCount() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCount)) {
            return false;
        }
        VideoCount videoCount = (VideoCount) obj;
        return this.onCount == videoCount.onCount && this.offCount == videoCount.offCount;
    }

    public VideoCount(int i, int i2) {
        this.onCount = i;
        this.offCount = i2;
    }
}
