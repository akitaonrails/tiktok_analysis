package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationContainerPerfConfig {

    @C09CT("downgrade_container")
    public final boolean downgradeContainer;

    @C09CT("enable_others")
    public final boolean enable;

    public AnnotationContainerPerfConfig() {
        this(false, false);
    }

    public AnnotationContainerPerfConfig(boolean z, boolean z2) {
        this.downgradeContainer = z;
        this.enable = z2;
    }
}
