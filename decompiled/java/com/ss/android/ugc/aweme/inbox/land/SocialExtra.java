package com.ss.android.ugc.aweme.inbox.land;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class SocialExtra {
    public static final int $stable = 0;

    @C09CT("is_interactive_notice")
    public final boolean isInteractiveNotice;

    @C09CT("notice_create_time")
    public final long noticeCreateTime;

    public SocialExtra() {
        this(false, 0L);
    }

    public final boolean isValidData() {
        return this.isInteractiveNotice && this.noticeCreateTime > 0;
    }

    public final boolean isInteractiveNotice() {
        return this.isInteractiveNotice;
    }

    public SocialExtra(boolean z, long j) {
        this.isInteractiveNotice = z;
        this.noticeCreateTime = j;
    }
}
