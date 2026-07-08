package com.ss.android.ugc.aweme.absetting;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraSensitivePostOptAB {
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final CameraSensitivePostOptAB INSTANCE = new CameraSensitivePostOptAB();

    public static final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "camera_sensitive_post_opt", true, false);
    }
}
