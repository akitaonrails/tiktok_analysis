package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ShareWarnModule implements Serializable {
    public boolean hasShown;

    @C09CT("module_type")
    public final int moduleType;

    @C09CT("pop_window")
    public final ShareWarnPopWindow popWindow;

    public ShareWarnModule() {
        this(1, null);
    }

    public final void setHasShown(boolean z) {
        this.hasShown = z;
    }

    public ShareWarnModule(int i, ShareWarnPopWindow shareWarnPopWindow) {
        this.moduleType = i;
        this.popWindow = shareWarnPopWindow;
    }
}
