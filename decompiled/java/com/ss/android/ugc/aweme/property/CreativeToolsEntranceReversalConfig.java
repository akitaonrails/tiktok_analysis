package com.ss.android.ugc.aweme.property;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class CreativeToolsEntranceReversalConfig {
    public static final int $stable = 0;

    @C09CT("hide_auto_enhance_on_edit_page")
    public final boolean hideAutoEnhanceOnEditPage;

    @C09CT("hide_noise_reduce_on_edit_page")
    public final boolean hideNoiseReduceOnEditPage;

    public CreativeToolsEntranceReversalConfig() {
        this(false, false);
    }

    public CreativeToolsEntranceReversalConfig(boolean z, boolean z2) {
        this.hideNoiseReduceOnEditPage = z;
        this.hideAutoEnhanceOnEditPage = z2;
    }
}
