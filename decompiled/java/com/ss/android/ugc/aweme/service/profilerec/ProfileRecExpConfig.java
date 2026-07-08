package com.ss.android.ugc.aweme.service.profilerec;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class ProfileRecExpConfig {

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("show_toast")
    public final boolean showToast;

    public ProfileRecExpConfig() {
        this(false, false);
    }

    public ProfileRecExpConfig(boolean z, boolean z2) {
        this.isEnabled = z;
        this.showToast = z2;
    }
}
