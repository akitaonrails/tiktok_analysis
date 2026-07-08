package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0175003p;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BcToggleInfo {
    public static final C0175003p Companion = new Object() { // from class: X.003p
    };

    @C09CT("position")
    public int position;

    @C09CT("bc_toggle_show_interval")
    public int showInterval;

    @C09CT("ecom_bc_toggle")
    public int status = 3;

    @C09CT("bc_toggle_text")
    public String toggleText = "";

    public final boolean isAvailable() {
        int i = this.status;
        return i >= 0 && i < 3;
    }

    public final boolean isClose() {
        return this.status == 0;
    }

    public final boolean isOpen() {
        int i = this.status;
        return 1 <= i && i < 3;
    }
}
