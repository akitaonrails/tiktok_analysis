package com.ss.android.ugc.aweme.aigc;

import X.C0C64;

/* JADX INFO: loaded from: classes3.dex */
public final class C2PAExtWriteApiRefactorKillSwitch {
    public static final int $stable = 0;
    public static final boolean DISABLE = false;
    public static final C2PAExtWriteApiRefactorKillSwitch INSTANCE = new C2PAExtWriteApiRefactorKillSwitch();
    public static final boolean ENABLE = true;

    public final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "c2pa_ext_write_api_refactor_kill_switch", true, false);
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
