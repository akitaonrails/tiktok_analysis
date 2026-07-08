package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class SkipSystemPermissionPopup {
    public static final int $stable = 0;
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final SkipSystemPermissionPopup INSTANCE = new SkipSystemPermissionPopup();

    public static final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "remove_system_pop_up_from_authority_view", true, false);
    }
}
