package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class PasswordData implements Serializable {
    public static final int $stable = 0;

    @C09CT("display_order")
    public final int displayOrder;

    @C09CT("has_password")
    public final boolean hasPassword;

    @C09CT("is_password_compromised")
    public final boolean isPasswordCompromised;

    public PasswordData() {
        this(false, false, -1);
    }

    public final boolean isPasswordCompromised() {
        return this.isPasswordCompromised;
    }

    public PasswordData(boolean z, boolean z2, int i) {
        this.hasPassword = z;
        this.isPasswordCompromised = z2;
        this.displayOrder = i;
    }
}
