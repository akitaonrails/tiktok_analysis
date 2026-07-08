package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoPrivateInfo {

    @C09CT("is_private_account")
    public final boolean isPrivateAccount;

    public TakoPrivateInfo() {
        this(false);
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.isPrivateAccount);
    }

    public TakoPrivateInfo(boolean z) {
        this.isPrivateAccount = z;
    }
}
