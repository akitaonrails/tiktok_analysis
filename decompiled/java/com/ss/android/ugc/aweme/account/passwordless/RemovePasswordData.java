package com.ss.android.ugc.aweme.account.passwordless;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public final class RemovePasswordData implements Serializable {
    public static final int $stable = 0;

    @C09CT("error_code")
    public final int errorCode;

    public RemovePasswordData() {
        this(0);
    }

    public RemovePasswordData(int i) {
        this.errorCode = i;
    }
}
