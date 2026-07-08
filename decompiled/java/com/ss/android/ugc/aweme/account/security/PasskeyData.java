package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class PasskeyData implements Serializable {
    public static final int $stable = 0;

    @C09CT("display_order")
    public final int displayOrder;

    @C09CT("is_passkey_created")
    public final boolean isPasskeyCreated;

    public PasskeyData() {
        this(false, -1);
    }

    public final boolean isPasskeyCreated() {
        return this.isPasskeyCreated;
    }

    public PasskeyData(boolean z, int i) {
        this.isPasskeyCreated = z;
        this.displayOrder = i;
    }
}
