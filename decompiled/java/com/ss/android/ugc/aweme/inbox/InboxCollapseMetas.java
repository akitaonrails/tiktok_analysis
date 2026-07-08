package com.ss.android.ugc.aweme.inbox;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxCollapseMetas {

    @C09CT("notice_display_count")
    public final int noticeDisplayCount;

    @C09CT("notice_display_recently")
    public final int noticeDisplayRecently;

    public InboxCollapseMetas() {
        this(3, 24);
    }

    public InboxCollapseMetas(int i, int i2) {
        this.noticeDisplayCount = i;
        this.noticeDisplayRecently = i2;
    }
}
