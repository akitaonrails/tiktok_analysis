package com.ss.android.ugc.aweme.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountAttributesData {

    @C09CT("passkey_exists")
    public final boolean passkeyExists;

    @C09CT("password_exists")
    public final boolean passwordExists;

    public AccountAttributesData() {
        this(false, false);
    }

    public AccountAttributesData(boolean z, boolean z2) {
        this.passwordExists = z;
        this.passkeyExists = z2;
    }
}
