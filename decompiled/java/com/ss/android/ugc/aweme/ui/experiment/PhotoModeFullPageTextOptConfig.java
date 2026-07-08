package com.ss.android.ugc.aweme.ui.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class PhotoModeFullPageTextOptConfig {

    @C09CT("enable_loose_line_height")
    public final boolean enableLooseLineHeight;

    @C09CT("letter_spacing")
    public final float letterSpacingPercent;

    @C09CT("paragraph_spacing_android")
    public final int paragraphSpacing;

    public PhotoModeFullPageTextOptConfig() {
        this(false, 0, 0.0f);
    }

    public PhotoModeFullPageTextOptConfig(boolean z, int i, float f) {
        this.enableLooseLineHeight = z;
        this.paragraphSpacing = i;
        this.letterSpacingPercent = f;
    }
}
