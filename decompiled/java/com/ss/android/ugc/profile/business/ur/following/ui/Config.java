package com.ss.android.ugc.profile.business.ur.following.ui;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class Config {

    @C09CT("dismiss_type")
    public final int dismissType;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("pin_unread")
    public final boolean pinUnread;

    @C09CT("topn")
    public final int topN;

    public Config() {
        this(false, 1, false, 5);
    }

    public Config(boolean z, int i, boolean z2, int i2) {
        this.enable = z;
        this.dismissType = i;
        this.pinUnread = z2;
        this.topN = i2;
    }
}
