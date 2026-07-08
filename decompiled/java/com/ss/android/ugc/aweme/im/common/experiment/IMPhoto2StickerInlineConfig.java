package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class IMPhoto2StickerInlineConfig {

    @C09CT("enabled")
    public final boolean isEnabled;

    @C09CT("show_after_dismiss_hours")
    public final long showAfterDismissHours;

    @C09CT("show_hours")
    public final long showHours;

    public IMPhoto2StickerInlineConfig() {
        this(false, 48L, 336L);
    }

    public IMPhoto2StickerInlineConfig(boolean z, long j, long j2) {
        this.isEnabled = z;
        this.showHours = j;
        this.showAfterDismissHours = j2;
    }
}
