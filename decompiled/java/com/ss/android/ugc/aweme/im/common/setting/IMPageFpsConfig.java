package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class IMPageFpsConfig {

    @C09CT("upload_ratio")
    public final float uploadRatio;

    public IMPageFpsConfig() {
        this(0.1f);
    }

    public IMPageFpsConfig(float f) {
        this.uploadRatio = f;
    }
}
