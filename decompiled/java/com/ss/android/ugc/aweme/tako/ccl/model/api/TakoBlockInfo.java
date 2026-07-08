package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoBlockInfo {

    @C09CT("is_block")
    public final boolean isBlock;

    @C09CT("is_blocked")
    public final boolean isBlocked;

    public TakoBlockInfo() {
        this(false, false);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.isBlock) * 31) + C786410Ut5.Z2(this.isBlocked);
    }

    public TakoBlockInfo(boolean z, boolean z2) {
        this.isBlock = z;
        this.isBlocked = z2;
    }
}
