package com.ss.android.ugc.aweme.im.sharepanel.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class ScreenshotInternalShareConfig {

    @C09CT("internal_share_screenshot_freq_y")
    public final int dismissDays;

    @C09CT("internal_share_screenshot_freq_x")
    public final int displayWithoutClickCount;

    @C09CT("internal_share_screenshot_type")
    public final int screenshotType;

    public ScreenshotInternalShareConfig() {
        this(0, 0, 0);
    }

    public ScreenshotInternalShareConfig(int i, int i2, int i3) {
        this.screenshotType = i;
        this.displayWithoutClickCount = i2;
        this.dismissDays = i3;
    }
}
